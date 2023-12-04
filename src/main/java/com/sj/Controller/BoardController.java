package com.sj.Controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.sj.model.*;
import com.sj.service.BoardService;

@Controller
public class BoardController {

	//인터페이스 객체화
		@Autowired
		BoardService bs;

		
////		boardlist.jsp 실행
//		@RequestMapping(value = "board/boardlist", method = RequestMethod.GET)
//		public void viewboard(Model model) {
//			model.addAttribute("viewboard" , bs.viewboard());
//		}
		
		@RequestMapping(value = "board/boardlist", method = RequestMethod.GET)
		public String list (Model model, CriteriaDTO cri) {
		System.out.println(cri);
		model.addAttribute("list", bs.list(cri));
		int total = bs.total(cri);
		model.addAttribute("paging", new pageDTO(cri, total));
		return "board/boardlist";
		}
		
		//insertform.jsp 실행
		@RequestMapping(value = "board/insertform", method = RequestMethod.GET)
		public void insertform() {
			
		}
		
		@RequestMapping(value = "/insertboard", method = RequestMethod.POST)
		public String insertboard(BoardDTO board) {
			bs.insertboard(board);
			
			return "redirect:/board/boardlist";
		}
		
		@RequestMapping(value = "detailboard", method = RequestMethod.GET)
		public String detailboard(BoardDTO board, Model model) {
			System.out.println(board);
			model.addAttribute("detailboard", bs.detailboard(board));
			bs.detailboard(board);
			return "board/detailboard";
		}

		
		@RequestMapping(value = "updateboard", method = RequestMethod.POST)
		public String updateboard(BoardDTO board, RedirectAttributes rttr) {
			bs.updateboard(board);
			rttr.addAttribute("bno", board.getBno());
			// 수정하고 난 뒤 확인을 위해 상세페이지로 화면이동
			return "redirect:/detailboard";
		}
		
		@RequestMapping("deleteboard")
		public String deleteboard(BoardDTO board) {
			bs.deleteboard(board);
			
			return "redirect:/board/boardlist";
		}
		
		
		
	}