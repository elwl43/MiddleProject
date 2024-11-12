package kr.or.ddit.board.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.vo.BoardVO;

public interface IBoardDao {
	public List<SailBoardVO> sailnglist(Integer mem_no);

	public List<SailBoardVO> buylist(Integer mem_no);

	// 후기 있는 구매 물품
	public List<SailBoardVO> buylistNl(Integer mem_no);

	public List<SailBoardVO> soldlist(Integer mem_no);

	public List<SailBoardVO> recentPage(int mem_no);

	public int getBoardCount();

	public int getRPCount();

	public int insertBoard(BoardVO bv);

	public int insertRtPage(BoardVO bv);

	public int deleteBoard(int sale_no);

	public int deleteReview(int sale_no);

	public int deleteRvEx(int sale_no);

	public int deleteWant(BoardVO bv);

	public List<SailBoardVO> wantedlist(Integer mem_no);

	public List<SailBoardVO> getAllSail(Map<String, Object> map);

	public SailBoardVO saleDetail(Integer sale_no);

	public SailBoardVO saleMemNm(Integer sale_no);

	public SailBoardVO salect(Integer sale_no);

	public int insertWant(BoardVO sbd);

	public int getWant(int sale_no);

	public int buySale(Map<String, Object> map);

	public void buyUpdateSale(int sale_no);

	public int updateBoard(BoardVO bd);

	public int sellPrice(int mem_no);

	public int buyPrice(int mem_no);

	public int checkWant(BoardVO bd);

}
