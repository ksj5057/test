package com.sj.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.mapper.BoardMapper;
import com.sj.model.BoardDTO;
import com.sj.model.CriteriaDTO;

@Service
public class BoardServiceImpl implements BoardService{

	@Autowired
	BoardMapper bm;

	public void insertboard(BoardDTO board) {
		bm.insertboard(board);
	}
	
	public ArrayList<BoardDTO> list(CriteriaDTO cri){
		return bm.list(cri);
	}
	
	public int total(CriteriaDTO cri) {
		return bm.total(cri);
	}

	public void updateboard(BoardDTO board) {
		bm.updateboard(board);
	}

	public void deleteboard(BoardDTO board) {
		bm.deleteboard(board);
	}

	public ArrayList<BoardDTO> viewboard(){
		return bm.viewboard();
	}
	
	public BoardDTO detailboard(BoardDTO board) {
		//조회수
		bm.countup(board);
		return bm.detailboard(board);
	}
	
}
