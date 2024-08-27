package kr.kh.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.kh.restaurant.dao.MemberDAO;
import kr.kh.restaurant.model.vo.MemberVO;

@Service
public class MemberService  {

	@Autowired
	private MemberDAO memberDao;

	 public boolean signup(MemberVO member) {
		
		return false;
	}
	 @Autowired
	 BCryptPasswordEncoder passwordEncoder;
	//비번 암호화
	 String encPw = passwordEncoder.encode("비번");
	 //비번과 암호화된 비번이 같은 비번인지 알려줌
	 boolean res = passwordEncoder.matches("비번", "암호화된 비번");
}
