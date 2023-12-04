package com.sj.service;


import com.sj.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sj.mapper.ReplyMapper;
import com.sj.model.CriteriaDTO;
import com.sj.model.ReplyDTO;
import com.sj.model.ReplyPageDTO;

@Service
public class ReplyServiceImpl implements ReplyService{
	@Autowired
	ReplyMapper rm;
	
	// 댓글 쓰기를 위한 구현
	public int replywrite(ReplyDTO reply) {
		return rm.replywrite(reply);
	}
	public ReplyPageDTO list(CriteriaDTO cri, int bno) {
		return new ReplyPageDTO(rm.rpycnt(bno),rm.list(cri,bno));
	}
	public int replymodify(ReplyDTO reply) {
		return rm.replymodify(reply);
	}
	public int replyremove(ReplyDTO reply) {
		return rm.replyremove(reply);
	}
}
