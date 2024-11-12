package kr.or.ddit.questionboard.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.questionboard.dao.IQnaBoardDao;
import kr.or.ddit.questionboard.dao.QnaBoardDaoImpl;
import kr.or.ddit.questionboard.vo.QnaBoardVO;

public class QnaBoardServiceImpl implements IQnaBoardService {
	
	private static IQnaBoardService qnaboardService = new QnaBoardServiceImpl();
	
	private IQnaBoardDao qnaboardDao;
	
	public QnaBoardServiceImpl() {
		qnaboardDao = QnaBoardDaoImpl.getinstance();
	}
	public static IQnaBoardService getInstance() {
		if(qnaboardService == null ) qnaboardService = new QnaBoardServiceImpl();
		return qnaboardService;
	}
		
	/**
	 * QnA 등록 
	 */
	@Override
	public int insertQnaboard(QnaBoardVO qv) {
		
		int cnt = qnaboardDao.insertQnaboard(qv);
		
		return cnt;
	}
	
	/**
	 * QnA 수정
	 */
	@Override
	public int updateQnaboard(QnaBoardVO qv) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * QnA 삭제 
	 */
	@Override
	public int deleteQnaboard(int qnaNo) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * QnA 전체리스트 
	 */
	@Override
	public List<QnaBoardVO> allQnaboard() {
		
		List<QnaBoardVO> qnaBoardList = qnaboardDao.allQnaboard();
		return qnaBoardList;
	}
	
	/**
	 * QnA 상세보기 
	 */
	@Override
	public QnaBoardVO detailQnaboard(int qnaNo) {
		return null;
	}
	
	/**
	 * QnA 검색 
	 */
	public List<QnaBoardVO> searchQnaboard(String qnaTitle) {
		// TODO Auto-generated method stub
		return null;
	}
	public int countQnaList(Map<String, Object> map) {
		
		return qnaboardDao.countQnaList(map);
	}
	public List<QnaBoardVO> qnaList(Map<String, Object> map) {
		
		return qnaboardDao.qnaList(map);
	}

}
