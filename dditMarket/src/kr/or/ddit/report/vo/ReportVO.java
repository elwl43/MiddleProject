package kr.or.ddit.report.vo;

public class ReportVO {
	int sale_no;
	int mem_no;
	int re_ctgy_id;

	public ReportVO(int sale_no, int mem_no, int re_ctgy_id) {
		super();
		this.sale_no = sale_no;
		this.mem_no = mem_no;
		this.re_ctgy_id = re_ctgy_id;
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

	public int getRe_ctgy_id() {
		return re_ctgy_id;
	}

	public void setRe_ctgy_id(int re_ctgy_id) {
		this.re_ctgy_id = re_ctgy_id;
	}

	@Override
	public String toString() {
		return "ReportVO [sale_no=" + sale_no + ", mem_no=" + mem_no + ", re_ctgy_id=" + re_ctgy_id + "]";
	}

}
