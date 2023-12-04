package com.sj.service;

import java.util.ArrayList;

import com.sj.model.MemberDTO;

public interface MemberService {
	// 회원가입
	public void write(MemberDTO member);
	// 회원정보수정
	public void modify(MemberDTO member);
	// 회원목록리스트(관리자)
	public ArrayList<MemberDTO> list();
	// 회원상세내용(관리자)
	public MemberDTO detail(MemberDTO member);
	
	public void remove(MemberDTO member);
	
	public MemberDTO login(MemberDTO member);
}
