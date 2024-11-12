package kr.or.ddit.rank.service;

import kr.or.ddit.rank.dao.IRankDao;
import kr.or.ddit.rank.dao.RankDao;
import kr.or.ddit.rank.vo.RankVO;

public class RankService implements IRankService {

	private static IRankService service;
	private IRankDao rankdao;
	
	private RankService() {
		rankdao = RankDao.getInstance();
	}
	
	public static IRankService getInstance() {
		if(service == null) service = new RankService();
		return service;
	}
	
	
	@Override
	public int sailCount(int mem_no) {
		return rankdao.sailCount(mem_no);
	}

	public int buyCount(int mem_no) {
		return rankdao.buyCount(mem_no);
	}

}
