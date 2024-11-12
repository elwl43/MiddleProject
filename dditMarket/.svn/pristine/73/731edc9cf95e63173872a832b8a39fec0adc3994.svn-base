package kr.or.ddit.review.service;

import java.util.List;

import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.review.dao.IReviewDao;
import kr.or.ddit.review.dao.ReviewDao;
import kr.or.ddit.review.vo.IReviewVO;
import kr.or.ddit.review.vo.ReviewVO;

public class ReviewService implements IReviewSerivce {

//		dao > service 싱글톤 
	private static IReviewSerivce reviewSerivce = new ReviewService();

	private IReviewDao reviewDao;

	private ReviewService() {
		reviewDao = ReviewDao.getinstance();
	}

	public static IReviewSerivce getInstance() {
		if (reviewSerivce == null)
			reviewSerivce = new ReviewService();
		return reviewSerivce;
	}

	/**
	 * 리뷰 등록
	 */
	@Override
	public int insertReview(ReviewVO rv) {
		int cnt = reviewDao.insertReview(rv);
		return cnt;
	}

	// 리뷰 등록 여부 수정
	@Override
	public int updateRvEx(int sale_no) {
		int cnt = reviewDao.updateRvEx(sale_no);
		return cnt;
	}

	/**
	 * 리뷰 수정
	 */
	@Override
	public int updateReview(ReviewVO rv) {
		int cnt = reviewDao.updateReview(rv);
		return cnt;
	}

	/**
	 * 리뷰 삭제
	 */
	@Override
	public int deleteNotice(int notNo) {
		// TODO Auto-generated method stub
		return 0;
	}

// 	공지사항 전체리스트 조회
	@Override
	public List<ReviewVO> allReview() {

		List<ReviewVO> reviewList = reviewDao.allReview();
		return reviewList;
	}

	/**
	 * 공지사항 상세정보
	 */
	@Override
	public IReviewVO rvDetail(int rev_no) {

		return reviewDao.rvDetail(rev_no);
	}

	@Override
	public int countReviewList() {
		return reviewDao.countReviewList();
	}

	@Override
	public List<IReviewVO> reviewList(Integer mem_no) {
		List<IReviewVO> reviewList = reviewDao.reviewList(mem_no);
		return reviewList;
	}

	@Override
	public List<IReviewVO> myReview(Integer mem_no) {
		List<IReviewVO> myReview = reviewDao.myReview(mem_no);
		return myReview;
	}

}
