package com.sj.Controller;

import com.sj.model.*;
import com.sj.service.MemberService;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	//인터페이스 객체화
	@Autowired
	MemberService ms;
	
	
	  
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		
		return "home";
	}
	
	// member.jsp를 실행하기 위한 메소드
	@RequestMapping(value = "member", method = RequestMethod.GET)
	public void abcdefg(Model model) {
		model.addAttribute("memberid", "hong1234");
	}
	
	//회원가입 화면에서 회원가입 버튼 클릭시 메소드 실행
	@RequestMapping(value = "member", method = RequestMethod.POST)
	public void qwerty(MemberDTO member) {
		ms.write(member);
		
	}
	//@RequestMapping(value = "memberlist", method = RequestMethod.GET) 아래와 같음
	@GetMapping("memberlist")
	public void memberlist(Model model) {
		model.addAttribute("list", ms.list());
	}
	
	//회원정보 상세페이지
	@GetMapping("memberdetail")
	public void memberdetail(MemberDTO member, Model model) {
		model.addAttribute("detail", ms.detail(member));
		ms.detail(member);
	}
	
	@PostMapping("modify")
	public String membermodify(MemberDTO member, RedirectAttributes rttr) {
		ms.modify(member);
		rttr.addAttribute("id", member.getId());
		
		return "redirect:/memberdetail";
	}
	
	@PostMapping("remove")
	public String memberremove(MemberDTO member) {
		ms.remove(member);
		
		return "redirect:/memberlist";
	}
	
	@GetMapping("logform")
	public void logform() {
		
	}
	
	@PostMapping("login")
	public String login(MemberDTO member, HttpSession session) {
		//ms.login값이 null이 아니면
		if(ms.login(member) != null) {
		//로그인해라
		session.setAttribute("login", ms.login(member));
		//그리고 로그인 화면으로 이동
		return "redirect:/";
		//그렇지않으면
		}else {
		//로그인 하지마라
		
		//로그인 화면으로 이동.
		return "login";
		}
	}
		
	@PostMapping("logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "logform";
	}

	
	
}
