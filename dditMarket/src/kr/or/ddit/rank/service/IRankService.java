package kr.or.ddit.rank.service;

import kr.or.ddit.rank.vo.RankVO;

public interface IRankService {

	/**
	 * 판매 수량
	 * 
	 * @param mem_no
	 * @return
	 */
	public int sailCount(int mem_no);

	public int buyCount(int mem_no);

}
