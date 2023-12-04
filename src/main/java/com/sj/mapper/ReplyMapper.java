package com.sj.mapper;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Param;

import com.sj.model.CriteriaDTO;
import com.sj.model.ReplyDTO;

public interface ReplyMapper {
	
	public int replywrite(ReplyDTO reply);

	public ArrayList<ReplyDTO> list(@Param("cri") CriteriaDTO cri,@Param("bno") int bno);

	public int rpycnt(int bno);

	public int replymodify(ReplyDTO reply);

	public int replyremove(ReplyDTO reply);
}
