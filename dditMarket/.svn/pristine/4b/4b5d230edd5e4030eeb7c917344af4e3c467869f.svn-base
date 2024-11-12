package kr.or.ddit.admin.dao;

import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.admin.vo.AdminVO;
import kr.or.ddit.util.MybatisUtil;

public class AdminDao implements IAdminDao {

	private static AdminDao dao; 
	
	private AdminDao() {
		
	}
	
	public static IAdminDao getInstance() {
		if(dao == null) dao = new AdminDao();
		return dao;
	}
	
	@Override
	public AdminVO getAdmin(String adminId) {
		SqlSession session = MybatisUtil.getSqlseSession();
		AdminVO adV = null;
		
		
		try {
			adV = session.selectOne("admin.getAdmin", adminId);
		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 조회 중 예외 발생", e);
		} finally {
			session.close();
		}
		
		return adV;
	}

	@Override
	public String loginChk(Map<String, Object> map) {
		SqlSession session = MybatisUtil.getSqlseSession();
		String AdId = null;
		
		
		try {
			AdId = session.selectOne("admin.loginChk", map);
		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 조회 중 예외 발생", e);
		} finally {
			session.close();
		}
		
		return AdId;
	}
}
