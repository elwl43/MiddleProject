package kr.or.ddit.notice.vo;

public class NoticeVO {
	private int notNo; /* 번호  */
	private String adminId; /*관리자 아이디  */
	private String notTitle; /* 공지사항 제목 */
	private String notContent; /* 공지사항 내용 */
	private String notDy; /* 작성일자 */
	private String notDelyn; /* 삭제여부 */
	/*
	 * public NoticeVO () { }
	 * 
	 * public NoticeVO(int notNo, String adminId, String notTitle, String
	 * notContent, String notDy) { super(); this.notNo = notNo; this.adminId =
	 * adminId; this.notTitle = notTitle; this.notContent = notContent; this.notDy =
	 * notDy;
	 
	}
	*/
	public int getNotNo() {
		return notNo;
	}
	public void setNotNo(int notNo) {
		this.notNo = notNo;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getNotTitle() {
		return notTitle;
	}
	public void setNotTitle(String notTitle) {
		this.notTitle = notTitle;
	}
	public String getNotContent() {
		return notContent;
	}
	public void setNotContent(String notContent) {
		this.notContent = notContent;
	}
	public String getNotDy() {
		return notDy;
	}
	public void setNotDy(String notDy) {
		this.notDy = notDy;
	}
	
	public String getNotDelyn() {
		return notDelyn;
	}
	public void setNotDelyn(String notDelyn) {
		this.notDelyn = notDelyn;
	}
	/*
	 * @Override public String toString() { return "NoticeVO [notNo=" + notNo +
	 * ", adminId=" + adminId + ", notTitle=" + notTitle + ", notContent=" +
	 * notContent + ", notDy=" + notDy + "]"; }
	 */
	@Override
	public String toString() {
		return "NoticeVO [notNo=" + notNo + ", adminId=" + adminId + ", notTitle=" + notTitle + ", notContent="
				+ notContent + ", notDy=" + notDy + ", notDelyn=" + notDelyn + "]";
	}
	
	
}
