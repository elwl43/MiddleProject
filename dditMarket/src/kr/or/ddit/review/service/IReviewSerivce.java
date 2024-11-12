package kr.or.ddit.review.service;

import java.util.List;

import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.review.vo.IReviewVO;
import kr.or.ddit.review.vo.ReviewVO;

public interface IReviewSerivce {
	// 게시글 등록
	public int insertReview(ReviewVO rv);

	/**
	 * 리뷰 수정
	 * 
	 * @param mem_no
	 * @return
	 */
	public int updateReview(ReviewVO rv);

	public int deleteNotice(int notNo);

	public List<ReviewVO> allReview();

	public IReviewVO rvDetail(int rev_no);

	// 전체 게시글 갯구 조회
	public int countReviewList();

	// 리뷰 여부 등록
	public int updateRvEx(int sale_no);

	// 범위별 게시글 조회
	public List<IReviewVO> reviewList(Integer mem_no);

	// 범위별 게시글 조회
	public List<IReviewVO> myReview(Integer mem_no);

	

}
