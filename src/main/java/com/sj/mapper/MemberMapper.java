package com.sj.mapper;

import java.util.ArrayList;

import com.sj.model.MemberDTO;

public interface MemberMapper {
	public void write(MemberDTO member);
	
	public ArrayList<MemberDTO> list();
	
	public MemberDTO detail(MemberDTO member);
	
	public void modify(MemberDTO member);
	
	public void remove(MemberDTO member);
	
	public MemberDTO login(MemberDTO member);
}
