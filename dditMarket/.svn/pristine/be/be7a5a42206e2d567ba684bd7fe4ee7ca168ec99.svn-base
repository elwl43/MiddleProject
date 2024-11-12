package kr.or.ddit.review.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.review.service.IReviewSerivce;
import kr.or.ddit.review.service.ReviewService;
import kr.or.ddit.review.vo.IReviewVO;

@WebServlet("/myreview.do")
public class MyReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MyReview() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("===============================================나의 리뷰");
		IReviewSerivce reviewSerivce = ReviewService.getInstance();

		int mem_no = Integer.parseInt(req.getParameter("mem_no"));

		List<IReviewVO> myReview = reviewSerivce.myReview(mem_no);

		// request에 결과데이터를 담아서 페이지로 전달
		req.setAttribute("myReview", myReview);
		System.out.println("============================================출력");
		req.getRequestDispatcher("/views/review/myReview.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
