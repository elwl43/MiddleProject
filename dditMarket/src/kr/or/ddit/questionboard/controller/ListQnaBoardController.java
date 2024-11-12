package kr.or.ddit.questionboard.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.questionboard.service.IQnaBoardService;
import kr.or.ddit.questionboard.service.QnaBoardServiceImpl;
import kr.or.ddit.questionboard.vo.QnaBoardVO;

@WebServlet("/qblist.do")
public class ListQnaBoardController extends HttpServlet {
	
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	IQnaBoardService qnaBoardService= QnaBoardServiceImpl.getInstance();
	Map<String, Object> map = new HashMap<String, Object>();

	List<QnaBoardVO> qnalist = qnaBoardService.qnaList(map);
	System.out.println("qnalist" + qnalist);
	
	req.setCharacterEncoding("UTF-8");
	req.setAttribute("qnalist", qnalist);
	req.getRequestDispatcher("/views/qnaboard/qblist.jsp").forward(req, resp);
	}


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
