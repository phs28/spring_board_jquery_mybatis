package org.zerock.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.zerock.service.BoardService;
import org.zerock.vo.BoardVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/board/*")
@Log4j
@AllArgsConstructor
public class BoardController {
	
	private BoardService service;
	
	@GetMapping("/list")
	public void getList(Model model) {
		
		
		
		log.info("list..");
		
		model.addAttribute("list", service.getList());
	}
	
	@PostMapping("/register")
	public String register(BoardVO vo, RedirectAttributes rttr) {
		
		log.info("BoardVO: " + vo);
		
		service.register(vo);
		
		rttr.addAttribute("result", vo.getBno());
		
		return "redirect:/board/list";
	}
	
	@GetMapping("/get")
	public void Get(@RequestParam("bno") long bno, Model model) {
		
		log.info("/get");
		
		BoardVO one = service.get(bno);
		
		model.addAttribute("board", one);
	}
	
	@PostMapping("/modify")
	public String modify(BoardVO vo, RedirectAttributes rttr) {
		
		log.info("modify.." + vo);
		
		if(service.modify(vo)) {
			rttr.addAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
	@PostMapping("/remove")
	public String remove(@RequestParam("bno") long bno, RedirectAttributes rttr) {
		
		log.info("remove.." + bno);
		
		if(service.remove(bno)) {
			rttr.addAttribute("result", "success");
		}
		
		return "redirect:/board/list";
	}
	
}
