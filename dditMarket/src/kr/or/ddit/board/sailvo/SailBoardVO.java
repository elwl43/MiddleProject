package kr.or.ddit.board.sailvo;

public class SailBoardVO {

	private int sale_no;
	private String sale_title;
	private String prod_nm;
	private int prod_price;
	private String prod_detail;
	private int at_file_id;
	private int prod_ctgy_id;
	private int mem_no;
	private String loc;
	private String sale_delyn;
	private String sale_state;
	private String mem_nm;
	private String PROD_CTGY_NM;
	private String trade;
	private String address1;
	private String address2;
	private String RV_EX;

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getSale_state() {
		return sale_state;
	}

	public void setSale_state(String sale_state) {
		this.sale_state = sale_state;
	}

	public int getSale_no() {
		return sale_no;
	}

	public void setSale_no(int sale_no) {
		this.sale_no = sale_no;
	}

	public String getSale_title() {
		return sale_title;
	}

	public void setSale_title(String sale_title) {
		this.sale_title = sale_title;
	}

	public String getProd_nm() {
		return prod_nm;
	}

	public void setProd_nm(String prod_nm) {
		this.prod_nm = prod_nm;
	}

	public int getProd_price() {
		return prod_price;
	}

	public void setProd_price(int prod_price) {
		this.prod_price = prod_price;
	}

	public String getProd_detail() {
		return prod_detail;
	}

	public void setProd_detail(String prod_detail) {
		this.prod_detail = prod_detail;
	}

	public int getAt_file_id() {
		return at_file_id;
	}

	public void setAt_file_id(int at_file_id) {
		this.at_file_id = at_file_id;
	}

	public int getProd_ctgy_id() {
		return prod_ctgy_id;
	}

	public void setProd_ctgy_id(int prod_ctgy_id) {
		this.prod_ctgy_id = prod_ctgy_id;
	}

	public int getMem_no() {
		return mem_no;
	}

	public void setMem_no(int mem_no) {
		this.mem_no = mem_no;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public String getSale_delyn() {
		return sale_delyn;
	}

	public void setSale_delyn(String sale_delyn) {
		this.sale_delyn = sale_delyn;
	}

	public String getMem_nm() {
		return mem_nm;
	}

	public void setMem_nm(String mem_nm) {
		this.mem_nm = mem_nm;
	}

	public String getPROD_CTGY_NM() {
		return PROD_CTGY_NM;
	}

	public void setPROD_CTGY_NM(String pROD_CTGY_NM) {
		PROD_CTGY_NM = pROD_CTGY_NM;
	}

	public String getRV_EX() {
		return RV_EX;
	}

	public void setRV_EX(String rV_EX) {
		RV_EX = rV_EX;
	}

	@Override
	public String toString() {
		return "SailBoardVO [sale_no=" + sale_no + ", sale_title=" + sale_title + ", prod_nm=" + prod_nm + ", prod_price=" + prod_price + ", prod_detail=" + prod_detail + ", at_file_id=" + at_file_id + ", prod_ctgy_id=" + prod_ctgy_id + ", mem_no=" + mem_no + ", loc=" + loc + ", sale_delyn=" + sale_delyn + ", sale_state=" + sale_state + ", mem_nm=" + mem_nm + ", PROD_CTGY_NM=" + PROD_CTGY_NM + "]";
	}

}
