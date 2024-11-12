package kr.or.ddit.admin.service;

import java.util.Map;

import kr.or.ddit.admin.dao.AdminDao;
import kr.or.ddit.admin.dao.IAdminDao;
import kr.or.ddit.admin.vo.AdminVO;

public class AdminService implements IAdminService {

	private static IAdminService service;
	private IAdminDao dao;
	
	private AdminService() {
		dao = AdminDao.getInstance();
	}
	
	public static IAdminService getInstance() {
		if(service == null) service = new AdminService();
		return service;
	}
	
	@Override
	public AdminVO getAdmin(String adminId) {
		AdminVO adV = dao.getAdmin(adminId);
		return adV;
	}

	public String loginChk(Map<String, Object> map) {
		String AdId = dao.loginChk(map);
		return AdId;
	}
}
