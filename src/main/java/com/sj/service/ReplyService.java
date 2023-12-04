package com.sj.service;

import com.sj.model.CriteriaDTO;
import com.sj.model.ReplyDTO;
import com.sj.model.ReplyPageDTO;

public interface ReplyService {
	//댓글 쓰기
	public int replywrite(ReplyDTO reply);

	public ReplyPageDTO list(CriteriaDTO cri, int bno);

	public int replymodify(ReplyDTO reply);

	public int replyremove(ReplyDTO reply);

}
