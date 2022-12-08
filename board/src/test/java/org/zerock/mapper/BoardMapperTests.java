package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.vo.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
		
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		
		mapper.getList().forEach(list -> log.info(list));
	}
	
	@Test
	public void testinsertSelectKey() {
		
		BoardVO vo = new BoardVO();
		vo.setTitle("입력한 제목");
		vo.setContent("입력한 내용");
		vo.setWriter("입력한 사람");
		
		mapper.insertSelectKey(vo);
		
		log.info(vo);
	}
}