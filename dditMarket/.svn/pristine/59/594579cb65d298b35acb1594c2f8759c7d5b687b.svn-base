package kr.or.ddit.board.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.board.dao.BoardDao;
import kr.or.ddit.board.dao.IBoardDao;
import kr.or.ddit.board.sailvo.SailBoardVO;
import kr.or.ddit.board.vo.BoardVO;

public class BoardService implements IBoardService {

	private static IBoardService boardService;
	private IBoardDao boardDao;

	private BoardService() {
		boardDao = BoardDao.getInstance();
	}

	public static IBoardService getInstance() {
		if (boardService == null)
			boardService = new BoardService();
		return boardService;
	}

	@Override
	public List<SailBoardVO> getTotalSailngList(Integer mem_no) {
		List<SailBoardVO> sailboardlist = boardDao.sailnglist(mem_no);
		return sailboardlist;
	}

	@Override
	public List<SailBoardVO> getTotalBuyList(Integer mem_no) {
		List<SailBoardVO> buyboardlist = boardDao.buylist(mem_no);
		return buyboardlist;
	}

	// 후기 있는 구매 물품
	@Override
	public List<SailBoardVO> getTotalBuyListNl(Integer mem_no) {
		List<SailBoardVO> buyboardlistNl = boardDao.buylistNl(mem_no);
		return buyboardlistNl;
	}

	@Override
	public List<SailBoardVO> getTotalSoldList(Integer mem_no) {
		List<SailBoardVO> soldboardlist = boardDao.soldlist(mem_no);
		return soldboardlist;
	}

	@Override
	public List<SailBoardVO> recentPage(int mem_no) {
		List<SailBoardVO> recentPage = boardDao.recentPage(mem_no);
		return recentPage;
	}

	@Override
	public int getBoardCount() {

		return boardDao.getBoardCount();
	}

	@Override
	public int getRPCount() {

		return boardDao.getRPCount();
	}

	@Override
	public int insertBoard(BoardVO bv) {
		int cnt = boardDao.insertBoard(bv);
		return cnt;
	}

	@Override
	public int insertRtPage(BoardVO bv) {
		int cnt = boardDao.insertRtPage(bv);
		return cnt;
	}

	@Override
	public int deleteBoard(int sale_no) {
		int cnt = boardDao.deleteBoard(sale_no);
		return cnt;
	}

	@Override
	public int deleteReview(int sale_no) {
		int cnt = boardDao.deleteReview(sale_no);
		return cnt;
	}

	@Override
	public int deleteRvEx(int sale_no) {
		int cnt = boardDao.deleteRvEx(sale_no);
		return cnt;
	}

	@Override
	public int deleteWant(BoardVO bv) {
		int cnt = boardDao.deleteWant(bv);
		return cnt;
	}

	@Override
	public int updateBoard(BoardVO bd) {
		int cnt = boardDao.updateBoard(bd);
		return cnt;
	}

	@Override
	public List<SailBoardVO> getTotalWantedList(Integer mem_no) {
		List<SailBoardVO> watnedboardlist = boardDao.wantedlist(mem_no);
		return watnedboardlist;
	}

	@Override
	public List<SailBoardVO> getTotalSail(Map<String, Object> map) {
		List<SailBoardVO> sailList = boardDao.getAllSail(map);
		return sailList;
	}

	@Override
	public SailBoardVO saleDetail(Integer sale_no) {
		return boardDao.saleDetail(sale_no);
	}

	@Override
	public SailBoardVO saleMemNm(Integer sale_no) {
		return boardDao.saleMemNm(sale_no);
	}

	@Override
	public SailBoardVO salect(Integer sale_no) {
		return boardDao.salect(sale_no);
	}

	@Override
	public int insertWant(BoardVO bd) {
		int cnt = boardDao.insertWant(bd);
		return cnt;
	}

	@Override
	public int getWant(int sale_no) {
		int cnt = boardDao.getWant(sale_no);
		return cnt;
	}

	@Override
	public int buySale(Map<String, Object> map) {
		return boardDao.buySale(map);
	}

	@Override
	public void buyUpdateSale(int sale_no) {
		boardDao.buyUpdateSale(sale_no);
	}

	@Override
	public int checkWant(BoardVO bd) {
		return boardDao.checkWant(bd);
	
	}

	@Override
	public int buyPrice(int mem_no) {
		return boardDao.buyPrice(mem_no);
	}

	@Override
	public int sellPrice(int mem_no) {
		return boardDao.sellPrice(mem_no);
	}

}
