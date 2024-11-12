package kr.or.ddit.report.vo;

public class ReportBoardVO {
	
	private int rownum;
	private String sale_title;
	private int sale_no;
	private int mem_no;
	private String mem_nm;
	private String re_ctgy_nm;
	
	public ReportBoardVO() {
		// 기본 생성자
	}
	
	public ReportBoardVO(int rownum, String sale_title, int sale_no, int mem_no, String mem_nm, String re_ctgy_nm) {
		super();
		this.rownum = rownum;
		this.sale_title = sale_title;
		this.sale_no = sale_no;
		this.mem_no = mem_no;		
		this.mem_nm = mem_nm;
		this.re_ctgy_nm = re_ctgy_nm;
	}
		
	public int getSale_no() {
		return sale_no;
	}

	public void setSale_no(int sale_no) {
		this.sale_no = sale_no;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public int getRownum() {
		return rownum;
	}

	public void setRownum(int rownum) {
		this.rownum = rownum;
	}

	public String getSale_title() {
		return sale_title;
	}
	public void setSale_title(String sale_title) {
		this.sale_title = sale_title;
	}
	public String getMem_nm() {
		return mem_nm;
	}
	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}
	public String getRe_ctgy_nm() {
		return re_ctgy_nm;
	}
	public void setRe_ctgy_nm(String re_ctgy_nm) {
		this.re_ctgy_nm = re_ctgy_nm;
	}
	
	@Override
	public String toString() {
		return "ReportBoardVO [sale_title=" + sale_title + ", mem_nm=" + mem_nm + ", re_ctgy_nm=" + re_ctgy_nm + "]";
	}
}
