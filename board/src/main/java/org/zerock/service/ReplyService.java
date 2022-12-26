package org.zerock.service;

import java.util.List;

import org.zerock.vo.Criteria;
import org.zerock.vo.ReplyVO;

public interface ReplyService {
	
	public int register(ReplyVO vo);
	
	public ReplyVO get(long bno);
	
	public int modify(ReplyVO vo);
	
	public int remove(long bno);
	
	public List<ReplyVO> getList(Criteria cri, long bno);
}
