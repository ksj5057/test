package com.sj.service;

import java.util.ArrayList;

import com.sj.model.BoardDTO;
import com.sj.model.CriteriaDTO;

public interface BoardService {
	//게시판 글쓰기
	public void insertboard(BoardDTO board);
	//리스트
	public ArrayList<BoardDTO> list(CriteriaDTO cri);
	//DB 총 합계
	public int total(CriteriaDTO cri);
	//게시판 글수정
	public void updateboard(BoardDTO board);
	//게시판 글 삭제
	public void deleteboard(BoardDTO board);
	//게시글 상세페이지
	public ArrayList<BoardDTO> viewboard();
	
	public BoardDTO detailboard(BoardDTO board);

	
	
}
