package kr.kh.restaurant.service;

import kr.kh.restaurant.model.vo.MemberVO;

public interface MemberService {

		boolean signup(MemberVO member);

		MemberVO login(MemberVO member);

		
}
