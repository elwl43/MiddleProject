package kr.or.ddit.board.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.util.MybatisUtil;

public class BoardDao implements IBoardDao {

	private static IBoardDao boardDao = new BoardDao();

	private BoardDao() {
		// TODO Auto-generated constructor stub
	}

	public static IBoardDao getInstance() {
		return boardDao;
	}

	@Override
	public List<SailBoardVO> wantedlist(Integer mem_no) {
		List<SailBoardVO> wanteboarddList = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			wanteboarddList = session.selectList("board.wantedlist", mem_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return wanteboarddList;
	}

	@Override
	public List<SailBoardVO> sailnglist(Integer mem_no) {
		List<SailBoardVO> sailboardList = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			sailboardList = session.selectList("board.sailnglist", mem_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return sailboardList;
	}

	@Override
	public List<SailBoardVO> soldlist(Integer mem_no) {
		List<SailBoardVO> soldboardList = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			soldboardList = session.selectList("board.soldlist", mem_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return soldboardList;
	}

	@Override
	public List<SailBoardVO> recentPage(int mem_no) {
		List<SailBoardVO> recentPage = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			recentPage = session.selectList("board.recentPage", mem_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return recentPage;
	}

	@Override
	public List<SailBoardVO> buylist(Integer mem_no) {
		List<SailBoardVO> buyboardList = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			buyboardList = session.selectList("board.buylist", mem_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return buyboardList;
	}

	// 후기 있는 구매 물품
	@Override
	public List<SailBoardVO> buylistNl(Integer mem_no) {
		List<SailBoardVO> buyboardListNl = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			buyboardListNl = session.selectList("board.buylistNl", mem_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return buyboardListNl;
	}

	@Override
	public int getBoardCount() {
		SqlSession session = MybatisUtil.getSqlseSession(true);

		int boardCount = -1;

		try {
			boardCount = session.selectOne("board.boardCount");
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}

		return boardCount;
	}

	@Override
	public int checkWant(BoardVO bd) {
		SqlSession session = MybatisUtil.getSqlseSession(true);

		int checkWant=0;

		try {
			checkWant = session.selectOne("board.checkWant", bd);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return checkWant;
	}
	
	

	@Override
	public int getRPCount() {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int rpCount = -1;
		try {
			rpCount = session.selectOne("board.rpCount");
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return rpCount;
	}

	@Override
	public int insertBoard(BoardVO bv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.insertBoard", bv);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int insertRtPage(BoardVO bv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.insertRtPage", bv);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int deleteBoard(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.deleteBoard", sale_no);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int deleteReview(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.deleteReview", sale_no);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int deleteRvEx(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.deleteRvEx", sale_no);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int deleteWant(BoardVO bv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.deleteWant", bv);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int updateBoard(BoardVO bd) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.updateBoard", bd);
			if (cnt > 0)
				session.commit();
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public List<SailBoardVO> getAllSail(Map<String, Object> map) {
		List<SailBoardVO> sailList = new ArrayList<SailBoardVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			sailList = session.selectList("board.saillist", map);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return sailList;
	}

	@Override
	public SailBoardVO saleDetail(Integer sale_no) {
		SailBoardVO sbd = null;
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			sbd = session.selectOne("board.saleDetail", sale_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return sbd;
	}

	@Override
	public SailBoardVO saleMemNm(Integer sale_no) {
		SailBoardVO sbd = null;
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			sbd = session.selectOne("board.saleMemNm", sale_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return sbd;
	}

	@Override
	public SailBoardVO salect(Integer sale_no) {
		SailBoardVO sbd = null;
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			sbd = session.selectOne("board.salect", sale_no);
		} catch (PersistenceException ex) {
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return sbd;
	}

	@Override
	public int insertWant(BoardVO bd) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("board.insertWant", bd);
			if (cnt > 0)
				session.commit();
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int getWant(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int cnt = 0;
		try {
			cnt = session.selectOne("board.getWant", sale_no);
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public int buySale(Map<String, Object> map) {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int cnt = 0;
		try {
			cnt = session.insert("board.buySale", map);
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	@Override
	public void buyUpdateSale(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int cnt = 0;
		try {
			cnt = session.insert("board.buyUpdateSale", sale_no);
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
	}

	@Override
	public int sellPrice(int mem_no) {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int rs = 0;
		try {
			rs = session.selectOne("board.sellPrice", mem_no);
			System.out.println(rs);
		} catch (NullPointerException e) {
			e.printStackTrace();
			rs = 0;
		} finally {
			session.close();
		}

		return rs;
	}

	@Override
	public int buyPrice(int mem_no) {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int rs = 0;
		try {
			rs = session.selectOne("board.buyPrice", mem_no);
			System.out.println(rs);
		} catch (NullPointerException e) {
			e.printStackTrace();
			rs = 0;
		} finally {
			session.close();
		}
		return rs;
	}

}
