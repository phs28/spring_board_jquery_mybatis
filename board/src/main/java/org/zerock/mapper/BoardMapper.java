package org.zerock.mapper;

import java.util.List;

import org.zerock.vo.BoardVO;
import org.zerock.vo.Criteria;

public interface BoardMapper {
	
	public List<BoardVO> getList();
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public void insertSelectKey(BoardVO vo);
	
	public BoardVO read(long bno);
	
	public int delete(long bno);
	
	public int update(BoardVO vo);
	
	public int getTotalCount(Criteria cri);
}
