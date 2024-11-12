package kr.or.ddit.review.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.notice.vo.NoticeVO;
import kr.or.ddit.review.vo.IReviewVO;
import kr.or.ddit.review.vo.ReviewVO;
import kr.or.ddit.util.MybatisUtil;

public class ReviewDao implements IReviewDao {

	private static IReviewDao reviewDao = new ReviewDao();

	public ReviewDao() {
	}

	public static IReviewDao getinstance() {

		return reviewDao;
	}

	// 임시 페이징처리 떄문에
	public static IReviewDao getInstance() {
		if (reviewDao == null)
			reviewDao = new ReviewDao();
		return reviewDao;
	}

	// 리뷰 등록
	@Override
	public int insertReview(ReviewVO rv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.insert("review.InsertReview", rv);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	// 리뷰 존재 여부 등록
	@Override
	public int updateRvEx(int sale_no) {
		SqlSession session = MybatisUtil.getSqlseSession(true);
		int cnt = 0;
		try {
			cnt = session.insert("review.updateRvEx", sale_no);
		} catch (PersistenceException ex) {
			session.rollback();
			ex.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	// 리뷰 수정
	@Override
	public int updateReview(ReviewVO rv) {
		SqlSession session = MybatisUtil.getSqlseSession();
		int cnt = 0;
		try {
			cnt = session.update("review.updateReview", rv);
			if (cnt > 0) {
				session.commit();
			}
		} catch (PersistenceException e) {
			session.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return cnt;
	}

	// 리뷰 삭제
	@Override
	public int deleteNotice(int notNo) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 리뷰 전체리스트
	@Override
	public List<ReviewVO> allReview() {

		List<ReviewVO> reveiwList = new ArrayList<ReviewVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);

		try {
			reveiwList = session.selectList("review.allReview");
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}

		return reveiwList;
	}

	// 공지사항 상세정보
	@Override
	public IReviewVO rvDetail(int rev_no) {
		IReviewVO irv = null;
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			irv = session.selectOne("review.rvDetail", rev_no);
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return irv;
	}

	// 페이징 처리(전체 게시글 갯수 조회)
	@Override
	public int countReviewList() {
		int rst = 0;
		SqlSession session = MybatisUtil.getSqlseSession();
		try {
			rst = session.selectOne("review.countReviewList");
		} catch (PersistenceException e) {
			throw new RuntimeException("데이터 번호 조회 중 예외 발생", e);
		} finally {
			session.close();
		}
		return rst;
	}

	// 전체 리뷰 조회
	@Override
	public List<IReviewVO> reviewList(Integer mem_no) {

		List<IReviewVO> reviewList = new ArrayList<IReviewVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			reviewList = session.selectList("review.ReviewList", mem_no);
		} catch (Exception e) {
			throw new RuntimeException("데이터 리스트 조회 중 예외 발생", e);
		} finally {
			session.close();
		}
		return reviewList;
	}

	@Override
	public List<IReviewVO> myReview(Integer mem_no) {

		List<IReviewVO> myReview = new ArrayList<IReviewVO>();
		SqlSession session = MybatisUtil.getSqlseSession(true);
		try {
			myReview = session.selectList("review.myReview", mem_no);
		} catch (Exception e) {
			throw new RuntimeException("데이터 리스트 조회 중 예외 발생", e);
		} finally {
			session.close();
		}
		return myReview;
	}

}
