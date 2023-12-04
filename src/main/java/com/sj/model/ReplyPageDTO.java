package com.sj.model;

import java.util.ArrayList;

public class ReplyPageDTO {
	private int replycnt;
	private ArrayList<ReplyDTO> list;
	
	public ReplyPageDTO(int replycnt,ArrayList<ReplyDTO> list){
		this.replycnt=replycnt;
		this.list=list;
	}

	public int getReplycnt() {
		return replycnt;
	}

	public void setReplycnt(int replycnt) {
		this.replycnt = replycnt;
	}

	public ArrayList<ReplyDTO> getList() {
		return list;
	}

	public void setList(ArrayList<ReplyDTO> list) {
		this.list = list;
	}

}
