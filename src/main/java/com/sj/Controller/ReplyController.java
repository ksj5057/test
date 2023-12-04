package com.sj.Controller;


import com.sj.model.CriteriaDTO;
import com.sj.model.ReplyPageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sj.model.ReplyDTO;
import com.sj.service.ReplyService;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService rs;
	
	//댓글 쓰기
	@RequestMapping(value = "/replies/new", method = RequestMethod.POST)
	public ResponseEntity<String> replywrite(@RequestBody ReplyDTO reply){
		// insert가 성공했으면 result변수에 1저장
		// insert가 실패했으면 result변수에 0저장
		int result=rs.replywrite(reply);
		
		System.out.println(reply);
		// result가 1이면 HttpStatus.OK
		// result가 0이면 HttpStatus.INTERNAL_SERVER_ERROR 
		return result==1? new ResponseEntity<>("success",HttpStatus.OK)
						: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
	
	// 댓글 목록 리스트
	@RequestMapping(value = "/replies/{bno}/{page}", method = RequestMethod.GET)
	public ResponseEntity <ReplyPageDTO> getList(@PathVariable("page") int page,@PathVariable("bno") int bno){
		System.out.println(bno);
		CriteriaDTO cri = new CriteriaDTO(page,10);
		return new ResponseEntity<>(rs.list(cri, bno),HttpStatus.OK);
	}
	
	@RequestMapping(value = "/replies/replymodify", method = RequestMethod.PUT)
	public ResponseEntity<String> replymodify(@RequestBody ReplyDTO reply){
		// insert가 성공했으면 result변수에 1저장
		// insert가 실패했으면 result변수에 0저장
		int result=rs.replymodify(reply);
		
		System.out.println(reply);
		// result가 1이면 HttpStatus.OK
		// result가 0이면 HttpStatus.INTERNAL_SERVER_ERROR 
		return result==1? new ResponseEntity<>("success",HttpStatus.OK)
						: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@RequestMapping(value = "/replies/replyremove", method = RequestMethod.DELETE)
	public ResponseEntity<String> replyremove(@RequestBody ReplyDTO reply){
		// insert가 성공했으면 result변수에 1저장
		// insert가 실패했으면 result변수에 0저장
		int result=rs.replyremove(reply);
		
		// result가 1이면 HttpStatus.OK
		// result가 0이면 HttpStatus.INTERNAL_SERVER_ERROR 
		return result==1? new ResponseEntity<>("success",HttpStatus.OK)
						: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		
	}
}
