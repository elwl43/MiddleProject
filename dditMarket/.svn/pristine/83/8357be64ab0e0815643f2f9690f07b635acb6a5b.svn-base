package kr.or.ddit.complain.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.complain.vo.BoardVO;
import kr.or.ddit.util.MybatisUtil;

public class BoardDaoImpl implements IBoardDao {

	private static BoardDaoImpl dao;

	// 1.private constructor
	private BoardDaoImpl() {

	}

	// 2.static method
	public static IBoardDao getInstance() {
		if (dao == null)
			dao = new BoardDaoImpl();
		return dao;
	}

	@Override
	public int countList(Map<String, Object> searchMap) {

		int rst = 0;
		SqlSession session = MybatisUtil.getSqlseSession();

		try {
			rst = session.selectOne("complainBoard.countList", searchMap);

		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 조회 중 예외 발생", e);
		} finally {
			session.close();
		}

		return rst;
	}

	@Override
	public List<BoardVO> boardList(Map<String, Object> map) {

		List<BoardVO> list = null;

		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			list = session.selectList("complainBoard.boardList", map);
		} catch (Exception e) {
			throw new RuntimeException("데이터 조회 중 예외 발생", e);
		} finally {
			session.close();
		}
		return list;
	}

	// 공지사항 등록
	@Override
	public int insertComplain(BoardVO bv) {

		SqlSession session = MybatisUtil.getSqlseSession();

		int cnt = 0;

		try {
			cnt = session.insert("complainBoard.InsertComplain", bv);

			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	// 게시글 상세 조회
	@Override
	public BoardVO detailBoard(int cmpNo) {
		SqlSession session = MybatisUtil.getSqlseSession(true);

		BoardVO bv = null;

		try {
			bv = session.selectOne("complainBoard.detailList", cmpNo);
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return bv;
	}

	// 게시글 수정
	@Override
	public int updateBoard(BoardVO bv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		
		int cnt= 0;
		try {
			cnt = session.update("complainBoard.updateBoard", bv);
			
			if (cnt > 0  ) {
				session.commit();
			}
			
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return cnt;
	}

	@Override
	public List<BoardVO> allBoard() {
		// TODO Auto-generated method stub
		return null;
	}

	//게시글 삭제
	@Override
	public int deleteBoard(int cmp_no) {
		
		SqlSession session = MybatisUtil.getSqlseSession();
		
		int cnt= 0;
		
		try {
			cnt = session.update("complainBoard.deleteBoard",cmp_no);
			
			if ( cnt > 0) {
				session.commit(); 
			}
			
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		}finally {
			session.close();
		}
		return cnt;
	}
	@Override
	public List<BoardVO> searchBoard(String searchType, String searchKeyword) {
	    Map<String, Object> params = new HashMap<>();
	    params.put("searchType", searchType);
	    params.put("searchKeyword", searchKeyword);

	    List<BoardVO> list = null;
//	    List<BoardVO> list = new ArrayList<BoardVO>();
	    
	    SqlSession session = MybatisUtil.getSqlseSession(true);
	    try {
	        list = session.selectList("complainBoard.searchBoard", params);
	    } catch (PersistenceException e) {
	        e.printStackTrace();
	    } finally {
	        session.close();
	    }
	    return list;
	}
	@Override
	public int countSearchList(Map<String, Object> searchMap) {
	    int rst = 0;
	    SqlSession session = MybatisUtil.getSqlseSession();
	    try {
	        rst = session.selectOne("complainBoard.countSearchList", searchMap);
//	        rst = session.selectOne("complainBoard.searchBoard", searchMap);
	    } catch (PersistenceException e) {
	        throw new RuntimeException("데이터 조회 중 예외 발생", e);
	    } finally {
	        session.close();
	    }
	    return rst;
	}

	@Override
	public List<BoardVO> searchBoardList(Map<String, Object> searchMap) {
	    //List<BoardVO> list = null;
	    List<BoardVO> list = new ArrayList<BoardVO>();
	    
	    SqlSession session = MybatisUtil.getSqlseSession(true);
	    
	    try {
	        list = session.selectList("complainBoard.searchBoardList", searchMap);
//	        list = session.selectList("complainBoard.searchBoard", searchMap);
	    } catch (Exception e) {
	        throw new RuntimeException("데이터 조회 중 예외 발생", e);
	    } finally {
	        session.close();
	    }
	    return list;
	}
	
	// 처리내역
	@Override
	public BoardVO confirmList(int cmp_no) {
		
		SqlSession session = MybatisUtil.getSqlseSession(true);

		BoardVO bv = null;
		
		try {
			bv = session.selectOne("complainBoard.confirmList", cmp_no);
		} catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return bv;
	}
	
}
