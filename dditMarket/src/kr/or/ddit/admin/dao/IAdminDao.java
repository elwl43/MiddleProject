package kr.or.ddit.admin.dao;

import java.util.Map;

import kr.or.ddit.admin.vo.AdminVO;

public interface IAdminDao {
	
	/**
	 * Admin 정보를 가져오는 메서드
	 * @param adminId
	 * @return	admin정보 리턴
	 */
	public AdminVO getAdmin(String adminId);

	/**
	 * Admin 아이디 검증
	 * @param map
	 * @return
	 */
	public String loginChk(Map<String, Object> map);
}
