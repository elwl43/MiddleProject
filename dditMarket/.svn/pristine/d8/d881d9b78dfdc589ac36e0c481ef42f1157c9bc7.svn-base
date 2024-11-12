package kr.or.ddit.questionboard.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.questionboard.vo.QnaBoardVO;

public interface IQnaBoardService {

	public int insertQnaboard (QnaBoardVO qv);
	/**
	 * QnA 등록하기
	 * @param nv
	 * @return
	 */
	
	public int updateQnaboard (QnaBoardVO qv);
	/**
	 * QnA 수정하기
	 * @param nv
	 * @return
	 */
	
	public int deleteQnaboard (int qnaNo);
	/**
	 * QnA 삭제하기
	 * @param nv
	 * @return
	 */
	
	public List<QnaBoardVO> allQnaboard();
	/**
	 * QnA 전체리스트
	 * @param nv
	 * @return
	 */
	
	public QnaBoardVO detailQnaboard (int qnaNo);
	/**
	 * QnA 상세보기
	 * @param nv
	 * @return
	 */
	
	public List<QnaBoardVO> searchQnaboard(String qnaTitle);
	/**
	 * QnA 검색
	 * @param nv
	 * @return
	 */
	/**
	 * 전체 게시글 갯수 조회
	 * @param nv
	 * @return
	 */
	public int countQnaList(Map<String, Object>map);
	/**
	 * qna 범위별 게시글 조회
	 * @param nv
	 * @return
	 */
	public List<QnaBoardVO> qnaList(Map<String, Object>map);
}
