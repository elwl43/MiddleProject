package kr.or.ddit.board.vo;

public class BoardVO {

	private int sale_no;
	private String sale_title;
	private String prod_nm;
	private int prod_price;
	private String prod_detail;
	private long at_file_id = -1;
	private int prod_ctgy_id;
	private String mem_no;
	private String loc;
	private String sale_delyn;
	private String trade;
	private String address1;
	private String address2;
	private int rp_no;

	public BoardVO(int sale_no, String mem_no) {
		super();
		this.sale_no = sale_no;
		this.mem_no = mem_no;
	}

	public BoardVO(int sale_no, String sale_title, String prod_nm, int prod_price, String prod_detail, int prod_ctgy_id,
			String cmp_writer, String loc) {
		super();
		this.sale_no = sale_no;
		this.sale_title = sale_title;
		this.prod_nm = prod_nm;
		this.prod_price = prod_price;
		this.prod_detail = prod_detail;
		this.prod_ctgy_id = prod_ctgy_id;
		this.mem_no = cmp_writer;
		this.loc = loc;
	}

	public BoardVO(int sale_no, String sale_title, String prod_nm, int prod_price, String trade, String address2,
			String address1, String prod_detail, int prod_ctgy_id, String cmp_writer, String loc) {
		super();
		this.sale_no = sale_no;
		this.sale_title = sale_title;
		this.prod_nm = prod_nm;
		this.prod_price = prod_price;
		this.trade = trade;
		this.address2 = address2;
		this.address1 = address1;
		this.prod_detail = prod_detail;
		this.prod_ctgy_id = prod_ctgy_id;
		this.mem_no = cmp_writer;
		this.loc = loc;
	}

	public BoardVO(String sale_title, int prod_price, String trade, String address2, String address1,
			String prod_detail, int sale_no) {
		this.sale_title = sale_title;
		this.prod_price = prod_price;
		this.trade = trade;
		this.address2 = address2;
		this.address1 = address1;
		this.prod_detail = prod_detail;
		this.sale_no = sale_no;
	}

	public BoardVO(int rp_no, int sale_no, String mem_no) {
		this.rp_no = rp_no;
		this.sale_no = sale_no;
		this.mem_no = mem_no;
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade;
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

	public long getAt_file_id() {
		return at_file_id;
	}

	public void setAt_file_id(long at_file_id) {
		this.at_file_id = at_file_id;
	}

	public int getProd_ctgy_id() {
		return prod_ctgy_id;
	}

	public void setProd_ctgy_id(int prod_ctgy_id) {
		this.prod_ctgy_id = prod_ctgy_id;
	}

	public String getMem_no() {
		return mem_no;
	}

	public void setMem_no(String mem_no) {
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

	public int getRp_no() {
		return rp_no;
	}

	public void setRp_no(int rp_no) {
		this.rp_no = rp_no;
	}

	@Override
	public String toString() {
		return "BoardVO [sale_no=" + sale_no + ", sale_title=" + sale_title + ", prod_nm=" + prod_nm + ", prod_price="
				+ prod_price + ", prod_detail=" + prod_detail + ", at_file_id=" + at_file_id + ", prod_ctgy_id="
				+ prod_ctgy_id + ", mem_no=" + mem_no + ", loc=" + loc + ", sale_delyn=" + sale_delyn + ", trade="
				+ trade + ", address1=" + address1 + ", address2=" + address2 + ", rp_no=" + rp_no + "]";
	}

}
