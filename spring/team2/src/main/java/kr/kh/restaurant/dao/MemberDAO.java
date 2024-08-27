package kr.kh.restaurant.dao;

import org.apache.ibatis.annotations.Param;

import kr.kh.restaurant.model.vo.MemberVO;



public interface MemberDAO {

	boolean insertMember(@Param("m")MemberVO member);

	MemberVO selectMember(@Param("me_id")String me_id);



}