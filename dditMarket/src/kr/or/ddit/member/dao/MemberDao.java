package kr.or.ddit.member.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.member.vo.MemberVO;
import kr.or.ddit.util.MybatisUtil;

public class MemberDao implements IMemberDao {

	private static MemberDao dao;

	private MemberDao() {

	}

	public static IMemberDao getInstance() {
		if (dao == null)
			dao = new MemberDao();
		return dao;
	}

	@Override
	public int joinMem(MemberVO mv) {

		SqlSession session = MybatisUtil.getSqlseSession();

		int rs = 0;

		try {
			rs = session.insert("member.joinMem", mv);
			if (rs > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return rs;
	}

	@Override
	public String loginChk(Map<String, Object> map) {
		SqlSession session = MybatisUtil.getSqlseSession();

		String memId = null;
		try {
			memId = session.selectOne("member.loginChk", map);
		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 조회 중 예외 발생", e);
		} finally {
			session.close();
		}

		return memId;
	}

	@Override
	public MemberVO getMember(String memId) {
		MemberVO mv = null;

		SqlSession session = MybatisUtil.getSqlseSession();

		try {
			mv = session.selectOne("member.getMember", memId);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return mv;
	}

	@Override
	public String findId(MemberVO mv) {
		String memId = null;

		SqlSession session = MybatisUtil.getSqlseSession();

		try {
			memId = session.selectOne("member.findMember", mv);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return memId;
	}

	@Override
	public String findEmail(MemberVO mv) {
		String memMail = null;

		SqlSession session = MybatisUtil.getSqlseSession();

		try {
			memMail = session.selectOne("member.findEmail", mv);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return memMail;
	}

	@Override
	public void updatePw(MemberVO mv) {

		SqlSession session = MybatisUtil.getSqlseSession();
		try {
			session.update("member.updatePw", mv);
			session.commit();
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public int updateMember(Map<String, Object> map) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int res = 0;
		try {
			res = session.update("member.updateMember", map);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return res;
	}

	@Override
	public int delMember(MemberVO mv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int res = 0;
		try {
			res = session.update("member.delMember", mv);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return res;
	}

	@Override
	public List<MemberVO> memberBoard() {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		
		List<MemberVO> list = new ArrayList<MemberVO>();		
		
		try {
			list = session.selectList("member.memberBoard");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}
}
