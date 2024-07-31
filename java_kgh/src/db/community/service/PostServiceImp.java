package db.community.service;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import db.community.dao.MemberDAO;
import db.community.dao.PostDAO;
import db.community.model.vo.CommunityVO;

public class PostServiceImp implements PostService {

	private PostDAO postDao;
	
	public PostServiceImp() {
		String resource = "db/community/config/mybatis-config.xml";
		InputStream inputStream;
		SqlSession session;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			session = sessionFactory.openSession(true);
			postDao = session.getMapper(PostDAO.class);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean insertCommunity(String community) {
		//커뮤니티명 null체크, 빈 문자열 체크
		if(community == null || community.trim().length() == 0) {
			return false;
		}
		community = community.trim();
		//중복 확인
		//다오에게 커뮤니티명을 주고 db에 있는 커뮤니티 정보를 달라고 요청
		CommunityVO communityVo = postDao.selectCommunity(community);
		
		//커뮤니티 정보가 null이 아니면 false를 리턴
		if(communityVo != null) {
			return false;
		}
		//다오에게 커뮤니티명을 주고 db에 추가하라고 시킨후 성공 여부를 리턴
		return postDao.insertCommunity(community);
	}

	@Override
	public boolean updateCommunity(String oldName, String newName) {
		
		// 이전 커뮤니티명과 이후 커뮤니티명 중에 null이 있거나 이후 커뮤니티명의 길이가 0 이면false를 리턴
		if(oldName == null || newName == null || newName.trim().length() == 0) {
			return false;
		}
		// 이전 커뮤니티명과 이후 커뮤니티명이 같으면 false를 리턴 
		if(oldName.equals(newName)) {
			return false;
		}
		// 등록된 커뮤니티명이여야 수정할수 있음 
		// 이전 커뮤니티명을 이용해서 커뮤니티 vo를 가져옴 
		CommunityVO oldVO = postDao.selectCommunity(oldName);
		// 커뮤니티 vo가 null이면 false 를 리턴 
		if(oldVO == null ) {
			return false;
		}
		
		// 바꾸려는 커뮤니티명이 이미 등록되어 있 으면 수정할 수없다 
		// 이후 커뮤니티명을 이용해서 커뮤니티vo를 가져옴 
		CommunityVO newVO = postDao.selectCommunity(newName);
		// 이후 커뮤니티 vo 가 null이 아니면 false를 리턴
		if(newVO == null ) {
			return false;
		}
		// 이전 커뮤니티vo의 커뮤니티명을 이후 커뮤니티명으로 수정 
		oldVO.setCo_name(newName.trim());
		// 다오에게 이전 커뮤니티 vo를 주면서 커뮤니티명을 수정하라고 요청하고 처리 여부를 반환  
		
		return postDao.updateCommunity(oldVO);
	}
}







