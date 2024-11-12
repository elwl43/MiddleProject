package kr.or.ddit.review.vo;

public class IReviewVO {
	private int REV_NO;
	private int MEM_NO;
	private int SALE_NO;
	private String REV_CONTENT;
	private int AT_FILE_ID;
	private String REV_DY;
	private String MEM_NM;
	private String PROD_NM;
	private String RV_EX;

	public int getREV_NO() {
		return REV_NO;
	}

	public void setREV_NO(int rEV_NO) {
		REV_NO = rEV_NO;
	}

	public int getMEM_NO() {
		return MEM_NO;
	}

	public void setMEM_NO(int mEM_NO) {
		MEM_NO = mEM_NO;
	}

	public int getSALE_NO() {
		return SALE_NO;
	}

	public void setSALE_NO(int sALE_NO) {
		SALE_NO = sALE_NO;
	}

	public String getREV_CONTENT() {
		return REV_CONTENT;
	}

	public void setREV_CONTENT(String rEV_CONTENT) {
		REV_CONTENT = rEV_CONTENT;
	}

	public int getAT_FILE_ID() {
		return AT_FILE_ID;
	}

	public void setAT_FILE_ID(int aT_FILE_ID) {
		AT_FILE_ID = aT_FILE_ID;
	}

	public String getREV_DY() {
		return REV_DY;
	}

	public void setREV_DY(String rEV_DY) {
		REV_DY = rEV_DY;
	}

	public String getMEM_NM() {
		return MEM_NM;
	}

	public void setMEM_NM(String mEM_NM) {
		MEM_NM = mEM_NM;
	}

	public String getPROD_NM() {
		return PROD_NM;
	}

	public void setPROD_NM(String pROD_NM) {
		PROD_NM = pROD_NM;
	}

	public String getRV_EX() {
		return RV_EX;
	}

	public void setRV_EX(String rV_EX) {
		RV_EX = rV_EX;
	}

	@Override
	public String toString() {
		return "IReviewVO [REV_NO=" + REV_NO + ", MEM_NO=" + MEM_NO + ", SALE_NO=" + SALE_NO + ", REV_CONTENT="
				+ REV_CONTENT + ", AT_FILE_ID=" + AT_FILE_ID + ", REV_DY=" + REV_DY + ", MEM_NM=" + MEM_NM
				+ ", PROD_NM=" + PROD_NM + ", RV_EX=" + RV_EX + "]";
	}

}
