package kr.or.ddit.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.itextpdf.text.log.SysoCounter;

import kr.or.ddit.board.service.BoardService;
import kr.or.ddit.board.service.IBoardService;
import kr.or.ddit.board.vo.BoardVO;
import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.member.vo.MemberVO;

@MultipartConfig
@WebServlet("/insert.do")
public class insertController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		RequestDispatcher disp = req.getRequestDispatcher(req.getContextPath() + "/insert.jsp");
		disp.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IBoardService boardService = BoardService.getInstance();

		HttpSession session = req.getSession();
		MemberVO vo = (MemberVO) session.getAttribute("loginCode");

		IAtchFileService fileService = AtchFileServiceImpl.getInstance();
		String inserting;

		if (req.getParameter("title").equals("") || req.getParameter("prodName").equals("") || req.getParameter("prodPrice").equals("") || req.getParameter("trade").equals("") || req.getParameter("detail").equals("") || req.getParameter("cate").equals("")) {
			inserting = "fail";
			req.setAttribute("inserting", inserting);

			req.getRequestDispatcher(req.getContextPath() + "/index.do").forward(req, resp);;
		} else {

			int sale_no = (boardService.getBoardCount() + 1);
			String sale_title = req.getParameter("title");
			String prod_nm = req.getParameter("prodName");
			int prod_price = Integer.parseInt(req.getParameter("prodPrice"));
			String trade = req.getParameter("trade");
			String address2 = req.getParameter("address2");
			String address1 = req.getParameter("address1");
			AtchFileVO atchFileVO = fileService.saveAtchFileList(req.getParts());
			String prod_detail = req.getParameter("detail");
			int prod_ctgy_id = Integer.parseInt(req.getParameter("cate"));
			String cmp_writer = vo.getMem_no();
			String loc = vo.getLoc();

			BoardVO bv = new BoardVO(sale_no, sale_title, prod_nm, prod_price, trade, address2, address1, prod_detail, prod_ctgy_id, cmp_writer, loc);

			System.out.println(bv);

			if (atchFileVO != null) {
				bv.setAt_file_id(atchFileVO.getAtchFileId());
			}

			int cnt = boardService.insertBoard(bv);

			String msg;

			if (cnt > 0) {
				msg = "SUCCESS";
			} else {
				msg = "FAIL";
			}
			req.getSession().setAttribute("msg", msg);

			inserting = "success";
			req.setAttribute("inserting", inserting);
			
			req.getRequestDispatcher(req.getContextPath() + "/index.do").forward(req, resp);
		}

	}

}
