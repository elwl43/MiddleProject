package kr.or.ddit.report.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.report.vo.ReportBoardVO;
import kr.or.ddit.report.vo.ReportVO;
import kr.or.ddit.util.MybatisUtil;

public class ReportDao implements IReportDao {

	private static ReportDao dao;

	private ReportDao() {

	}

	public static IReportDao getInstance() {
		if (dao == null)
			dao = new ReportDao();
		return dao;
	}

	@Override
	public int report(ReportVO rv) {

		SqlSession session = MybatisUtil.getSqlseSession();

		int cnt = 0;

		try {
			cnt = session.insert("report.insertReport", rv);
			if (cnt > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return cnt;
	}

	@Override
	public List<ReportBoardVO> reportBoard() {

		SqlSession session = MybatisUtil.getSqlseSession(true);

		List<ReportBoardVO> list = new ArrayList<ReportBoardVO>();

		try {
			list = session.selectList("report.reportBoard");
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return list;
	}

	@Override
	public int ban(int mem_no) {
		SqlSession session = MybatisUtil.getSqlseSession();

		int cnt = 0;

		try {
			cnt = session.insert("report.ban", mem_no);
			if (cnt > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return cnt;
	}

	@Override
	public void updateReport(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession();

		int cnt = 0;

		try {
			cnt = session.update("report.updateReport", sale_no);
			if (cnt > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	@Override
	public List<Integer> blackMemList() {
		SqlSession session = MybatisUtil.getSqlseSession(true);

		List<Integer> memList = new ArrayList<Integer>();

		try {
			memList = session.selectList("report.blackList");
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

		return memList;
	}

	@Override
	public void banCancel(int mem_no) {
		SqlSession session = MybatisUtil.getSqlseSession();

		int cnt = 0;

		try {
			cnt = session.delete("report.banCancel", mem_no);
			if (cnt > 0) {
				session.commit();
			}
		} catch (Exception e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
