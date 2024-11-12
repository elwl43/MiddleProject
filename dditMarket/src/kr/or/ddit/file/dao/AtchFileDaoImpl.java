package kr.or.ddit.file.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kr.or.ddit.file.vo.AtchFileDetailVO;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.file.vo.AtchSmpleVO;
import kr.or.ddit.util.MybatisUtil;

public class AtchFileDaoImpl implements IAtchFileDao {
	
	private static final Logger PARAM_LOGGER = LogManager.getLogger("log4jexam.sql.Parameter");

	private static IAtchFileDao fileDao = new AtchFileDaoImpl();

	private AtchFileDaoImpl() {

	}

	public static IAtchFileDao getInstance() {
		return fileDao;
	}

	@Override
	public int insertAtchFile(AtchFileVO atchFileVO) {

		SqlSession session = MybatisUtil.getSqlseSession(false);

		int cnt = 0;

		try {

			cnt = session.insert("atchFile.insertAtchFile", atchFileVO);

			if (cnt > 0) {
				session.commit();
			}

		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return cnt;

	}

	@Override
	public int insertAtchFileDetail(AtchFileDetailVO atchFileDetailVO) {
		SqlSession session = MybatisUtil.getSqlseSession(false);

		int cnt = 0;

		try {

			cnt = session.insert("atchFile.insertAtchFileDetail", atchFileDetailVO);

			if (cnt > 0) {
				session.commit();
			}

		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return cnt;
	}

	@Override
	public AtchFileVO getAtchFile(AtchFileVO atchFileVO) {

		AtchFileVO fileVO = null;

		SqlSession session = MybatisUtil.getSqlseSession(true);

		try {

			fileVO = session.selectOne("atchFile.getAtchFile", atchFileVO);

		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return fileVO;
	}

	@Override
	public AtchFileDetailVO getAtchFileDetail(AtchFileDetailVO atchFileDetailVO) {

		AtchFileDetailVO fileDetailVO = null;

		SqlSession session = MybatisUtil.getSqlseSession(true);

		try {

			fileDetailVO = session.selectOne("atchFile.getAtchFileDetail", atchFileDetailVO);

		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return fileDetailVO;
	}

	@Override
	public List<AtchSmpleVO> getAtchSmple() {
		List<AtchSmpleVO> smpleVO = null;
		
		SqlSession session = MybatisUtil.getSqlseSession(true);
		
		try {

			smpleVO = session.selectList("atchFile.getAtchSmple");

		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		
		return smpleVO;
	}

}
