package kr.or.ddit.rank.vo;

public class RankVO {
	int MEM_RANK;
	String RANK_NAME;
	int MEM_NO;
	String sale_no;
	int scount;

	public int getMEM_RANK() {
		return MEM_RANK;
	}

	public void setMEM_RANK(int mEM_RANK) {
		MEM_RANK = mEM_RANK;
	}

	public String getRANK_NAME() {
		return RANK_NAME;
	}

	public void setRANK_NAME(String rANK_NAME) {
		RANK_NAME = rANK_NAME;
	}

	public int getMEM_NO() {
		return MEM_NO;
	}

	public void setMEM_NO(int mEM_NO) {
		MEM_NO = mEM_NO;
	}

	public String getSale_no() {
		return sale_no;
	}

	public void setSale_no(String sale_no) {
		this.sale_no = sale_no;
	}

	public int getScount() {
		return scount;
	}

	public void setScount(int scount) {
		this.scount = scount;
	}

}
