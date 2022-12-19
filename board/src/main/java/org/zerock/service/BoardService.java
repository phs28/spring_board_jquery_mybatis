package org.zerock.service;

import java.util.List;

import org.zerock.vo.BoardVO;
import org.zerock.vo.Criteria;

public interface BoardService {
	
	public void register(BoardVO vo);
	
	public BoardVO get(long bno);
	
	public boolean modify(BoardVO vo); 
	
	public boolean remove(long bno);
	
	//public List<BoardVO> getList();
	
	public List<BoardVO> getList(Criteria cri);
	
	public int getTotal(Criteria cri);
}
