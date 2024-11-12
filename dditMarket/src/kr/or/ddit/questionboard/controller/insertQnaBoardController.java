package kr.or.ddit.questionboard.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.log.SysoCounter;

import kr.or.ddit.questionboard.service.IQnaBoardService;
import kr.or.ddit.questionboard.service.QnaBoardServiceImpl;
import kr.or.ddit.questionboard.vo.QnaBoardVO;

@MultipartConfig
@WebServlet("/qbinsert.do")
public class insertQnaBoardController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/views/qnaboard/qbinsert.jsp").forward(req,resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String qnaTitle = req.getParameter("qnaTitle");
		String qnaContent = req.getParameter("qnaContent");
		
		IQnaBoardService qnaBoardService = QnaBoardServiceImpl.getInstance();
		
		QnaBoardVO qv = new QnaBoardVO();
		qv.setQnaTitle(qnaTitle);
		qv.setQnaContent(qnaContent);
		
		int cnt = qnaBoardService.insertQnaboard(qv);
		String msg= "";
		
		if(cnt > 0) {
			msg="성공";
		}else {
			msg="실패";
		}
		req.getSession().setAttribute("msg", msg);
		
		resp.sendRedirect(req.getContextPath()+ "/qblist.do");
	}

}
