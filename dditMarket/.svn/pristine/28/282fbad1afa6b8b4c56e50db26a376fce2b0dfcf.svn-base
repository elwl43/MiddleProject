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

@WebServlet("/reviewlist.do")
public class ListReview extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListReview() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		IReviewSerivce reviewSerivce = ReviewService.getInstance();

		int mem_no = Integer.parseInt(req.getParameter("mem_no"));

		List<IReviewVO> reviewList = reviewSerivce.reviewList(mem_no);

		// request에 결과데이터를 담아서 페이지로 전달
		req.setAttribute("reviewList", reviewList);

		req.getRequestDispatcher("/views/review/rvList.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
