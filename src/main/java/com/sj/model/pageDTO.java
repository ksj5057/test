package com.sj.model;

public class pageDTO {
	//시작번호
	private int startpage;
	//끝번호
	private int endpage;
	//이전버튼
	private boolean prev;
	//다음버튼
	private boolean next;
	//CriteriaDTO 포함
	private CriteriaDTO cri;
	//board테이블의 전체 건수 저장
	private int total;
	
	//생성자 선언
	public pageDTO(CriteriaDTO cri, int total) {
		this.cri = cri;
		this.total = total;
		
		//끝번호 식
		this.endpage = (int)(Math.ceil(cri.getPagenum() / 10.0)) * 10;
		//시작번호 식
		this.startpage = this.endpage - 9;
		
		//제일 마지막 페이지는 전체 건수를 고려해야 함.
		//제일 마지막 끝 번호식
		int realend = (int)(Math.ceil((total * 1.0) / cri.getAmount()));
		
		if(realend < this.endpage) {
			this.endpage = realend;
		}
		//startpage가 1보다 크면 이전버튼 활성화
		this.prev = this.startpage > 1;
		//endpage가 realend 보다 작으면 다음버튼 활성화
		this.next = this.endpage < realend;
	}

	public int getStartpage() {
		return startpage;
	}

	public void setStartpage(int startpage) {
		this.startpage = startpage;
	}

	public int getEndpage() {
		return endpage;
	}

	public void setEndpage(int endpage) {
		this.endpage = endpage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public CriteriaDTO getCri() {
		return cri;
	}

	public void setCri(CriteriaDTO cri) {
		this.cri = cri;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "PageVO [startPage=" + startpage + ", endPage=" + endpage + ", prev=" + prev + ", next=" + next
				+ ", cri=" + cri + ", total=" + total + "]";
	}
	
	
	
}
