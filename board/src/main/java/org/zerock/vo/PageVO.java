package org.zerock.vo;

import lombok.Data;

@Data
public class PageVO {
	
	private int startPage;
	private int endPage;
	private boolean prev;
	private boolean next;

	private int total;
	private Criteria cri;
	
	public PageVO(Criteria cr, int total) {
		
		this.cri = cr;
		this.total = total;
		
		this.endPage = (int) (Math.ceil(cr.getPageNum() / 10.0)) * 10;
		this.startPage = this.endPage - 9;
		
		int realEnd = (int) (Math.ceil(total * 1.0) / cr.getAmount());
		if(realEnd < this.endPage) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
		
	}
	
}
