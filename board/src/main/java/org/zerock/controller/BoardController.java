package org.zerock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.service.BoardService;
import org.zerock.vo.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/board/*")
@Log4j
public class BoardController {
	
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
	@GetMapping("/list")
	public void getList(Model model) {
		
		List<BoardVO> list = service.getList();
		
		log.info(list);
		
		model.addAttribute("list", list);
	}
	
	
}
