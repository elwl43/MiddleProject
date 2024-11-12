package kr.or.ddit.board.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.vo.BoardVO;

public interface IBoardService {
	/**
	 * 내 상품 관리
	 * 
	 * @param mem_no
	 * @return
	 */
	public List<SailBoardVO> getTotalSailngList(Integer mem_no);

	/**
	 * 구매 물품 관리
	 * 
	 * @param mem_no
	 * @return
	 */
	public List<SailBoardVO> getTotalBuyList(Integer mem_no);

	// 후기 있응 구매 물품 관리
	public List<SailBoardVO> getTotalBuyListNl(Integer mem_no);

	/**
	 * 판매 완료 상품
	 * 
	 * @param mem_no
	 * @return
	 */
	public List<SailBoardVO> getTotalSoldList(Integer mem_no);

	public List<SailBoardVO> recentPage(int mem_no);

	/**
	 * 찜 상품 관리
	 * 
	 * @param mem_no
	 * @return
	 */
	public List<SailBoardVO> getTotalWantedList(Integer mem_no);

	/**
	 * 게시판의 현재 갯수를 가져오는 함수
	 * 
	 * @return 게시판 수
	 */
	public int getBoardCount();

	public int getRPCount();

	/**
	 * 게시판 추가
	 * 
	 * @return 성공 실패 여부
	 */
	public int insertBoard(BoardVO bv);

	/**
	 * 최근 본 페이지 저장
	 * 
	 * @param bv
	 * @return
	 */
	public int insertRtPage(BoardVO bv);

	/**
	 * 게시판 제거
	 * 
	 * @param sale_no
	 * @return
	 */
	public int deleteBoard(int sale_no);

	/**
	 * 리뷰 삭제
	 * 
	 * @param sale_no
	 * @return
	 */
	public int deleteReview(int sale_no);

	/**
	 * 리뷰 여부 삭제
	 * 
	 * @param sale_no
	 * @return
	 */
	public int deleteRvEx(int sale_no);

	/**
	 * 찜 삭제
	 * 
	 * @param bv
	 * @return
	 */
	public int deleteWant(BoardVO bv);

	/**
	 * 전페 판매 품목
	 * 
	 * @return
	 */
	public List<SailBoardVO> getTotalSail(Map<String, Object> map);

	/**
	 * 상품 상세페이지
	 * 
	 * @param memId
	 * @return
	 */
	public SailBoardVO saleDetail(Integer sale_no);

	/**
	 * 상품페이지 회원이름
	 * 
	 * @param sale_no
	 * @return
	 */
	public SailBoardVO saleMemNm(Integer sale_no);

	/**
	 * 상품 카테고리 이름
	 * 
	 * @param sale_no
	 * @return
	 */
	public SailBoardVO salect(Integer sale_no);

	/**
	 * 찜 등록
	 * 
	 * @param sbd
	 * @return
	 */
	public int insertWant(BoardVO sbd);

	public int getWant(int sale_no);

	public int buySale(Map<String, Object> map);

	public void buyUpdateSale(int sale_no);

	public int updateBoard(BoardVO bd);

	public int buyPrice(int mem_no);

	public int sellPrice(int mem_no);

	public int checkWant(BoardVO bd);

}
