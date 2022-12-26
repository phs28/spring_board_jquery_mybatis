package org.zerock.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.zerock.mapper.ReplyMapper;
import org.zerock.vo.Criteria;
import org.zerock.vo.ReplyVO;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@AllArgsConstructor
public class ReplyServiceImpl implements ReplyService {
	
	private ReplyMapper mapper;
	
	@Override
	public int register(ReplyVO vo) {
		
		log.info("register.." + vo);
		
		int insert = mapper.insert(vo);
		
		return insert;
	}

	@Override
	public ReplyVO get(long rno) {
		
		log.info("get.." + rno);
		
		ReplyVO read = mapper.read(rno);
		
		return read;
	}

	@Override
	public int modify(ReplyVO vo) {
		
		log.info("modify.." + vo);
		
		int update = mapper.update(vo);
		
		return update;
	}

	@Override
	public int remove(long rno) {
		
		log.info("remove.." + rno);
		
		int delete = mapper.delete(rno);
		
		return delete;
	}

	@Override
	public List<ReplyVO> getList(Criteria cri, long bno) {
		
		log.info("getList.." + bno);
		
		List<ReplyVO> getList = mapper.getListWithPaging(cri, bno);
		
		return getList;
	}

	
}
