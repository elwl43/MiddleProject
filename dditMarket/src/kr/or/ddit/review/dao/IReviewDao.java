package kr.or.ddit.review.dao;

import java.util.List;

import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.review.vo.IReviewVO;
import kr.or.ddit.review.vo.ReviewVO;

public interface IReviewDao {
	/**
	 * 리뷰 수정
	 * 
	 * @param nv
	 * @return
	 */
	public int updateReview(ReviewVO rv);

	/**
	 * 공지사항 삭제
	 * 
	 * @param nv
	 * @return
	 */
	public int deleteNotice(int notNo);

	/**
	 * 리뷰 전체리스트
	 * 
	 * @param nv
	 * @return
	 */
	public List<ReviewVO> allReview();


	// 전체 게시글 갯수
	public int countReviewList();

	// 리뷰 범위별 게시글 조회
	public List<IReviewVO> reviewList(Integer mem_no);
	
	// 나의 리뷰 조회
	public List<IReviewVO> myReview(Integer mem_no);

	// 리뷰 등록
	public int insertReview(ReviewVO rv);

	// 리뷰 상세조회
	public IReviewVO rvDetail(int rev_no);
	
	// 리뷰 존재 여부 등록
	public int updateRvEx(int sale_no);
	


}
