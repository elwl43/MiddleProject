package kr.or.ddit.complain.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.complain.dao.BoardDaoImpl;
import kr.or.ddit.complain.dao.IBoardDao;
import kr.or.ddit.complain.vo.BoardVO;
import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.util.MybatisUtil;


public class BoardServiceImpl implements IBoardService {
	
//	private static IBoardService service;
	private static IBoardService service = new BoardServiceImpl();
	
	private IBoardDao dao;

	//1.private constructor
	private BoardServiceImpl() {
		dao = BoardDaoImpl.getInstance();
	}
	//2.static method
	public static IBoardService getInstance() {
//	public static IBoardService getInstance(Map<String, Object> searchMap) {
		if(service == null) service = new BoardServiceImpl();
		return service;
	}
	
	@Override
	public int countList(Map<String, Object> searchMap) {
		return dao.countList(searchMap);
	}
	@Override
	public List<BoardVO> boardList(Map<String, Object> map) {
		return dao.boardList(map);
	}
	@Override
	public int insertComplain(BoardVO bv) {
		int cnt = dao.insertComplain(bv);
		
		return cnt;
	}
//	@Override
//	public BoardVO detailBoard(int cmpNo) {
//		return dao.detailBoard(cmpNo);
//	}
	
	@Override
	public BoardVO detailBoard(int cmpNo, String cmpTitle, String cmpContent) {
		return dao.detailBoard(cmpNo);
	}
	@Override
	public int updateBoard(BoardVO bv) {
		int cnt = dao.updateBoard(bv);
		
		return cnt;
	}
	@Override
	public int deleteBoard(int cmp_no) {
		int cnt = dao.deleteBoard(cmp_no);

		return cnt;
	}
	@Override
	public List<BoardVO> searchBoard(String searchType, String searchKeyword) {
		List<BoardVO> BoardList = new ArrayList<BoardVO>();
		
		SqlSession session = MybatisUtil.getSqlseSession(true);
		
		try {
			BoardList = session.selectList("complain.searchBoard", searchType); //NAMESPACE.ID
			BoardList = session.selectList("complain.searchBoard", searchKeyword); //NAMESPACE.ID
			
		}catch (PersistenceException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		
		return dao.searchBoard(searchType, searchKeyword);
	}
	@Override
	public int countSearchList(Map<String, Object> searchMap) {
	    return dao.countSearchList(searchMap);
	}

	@Override
	public List<BoardVO> searchBoardList(Map<String, Object> searchMap) {
	    return dao.searchBoardList(searchMap);
	}
	@Override
	public BoardVO confirmList(int cmp_no, String cmp_title, String cmp_content) {
		return dao.confirmList(cmp_no);
	}
}
