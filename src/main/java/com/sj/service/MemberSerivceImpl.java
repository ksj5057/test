package com.sj.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.mapper.MemberMapper;
import com.sj.model.MemberDTO;

@Service
public class MemberSerivceImpl implements MemberService {
		
	
		@Autowired
		MemberMapper mm;
		//MemberMapper mm = new MemberMapper();
		// 회원가입
		public void write(MemberDTO member){
			mm.write(member);
		}
		// 회원정보수정
		public void modify(MemberDTO member){
			mm.modify(member);
			
		}
		//회원정보 삭제
		public void remove(MemberDTO member){
			mm.remove(member);
			
		}
		
		// 회원목록리스트(관리자)
		public ArrayList<MemberDTO> list(){
			return mm.list();
			
			
		}
		// 회원상세내용(관리자)
		public MemberDTO detail(MemberDTO member){
			return mm.detail(member);
			
		}
		
		public MemberDTO login(MemberDTO member){
			return mm.login(member);
			
			
		}
		

}
