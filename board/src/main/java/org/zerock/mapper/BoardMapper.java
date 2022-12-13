package org.zerock.mapper;

import java.util.List;

import org.zerock.vo.BoardVO;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public void insertSelectKey(BoardVO vo);
	
	public BoardVO read(long bno);
	
	public int delete(long bno);
	
	public int update(BoardVO vo);
	
}
