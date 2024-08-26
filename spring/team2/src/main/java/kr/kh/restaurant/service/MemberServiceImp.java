package kr.kh.restaurant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.kh.restaurant.dao.MemberDao;

@Service
public class MemberServiceImp implements MemberService {

	@Autowired
	private MemberDao memberDao;
}
