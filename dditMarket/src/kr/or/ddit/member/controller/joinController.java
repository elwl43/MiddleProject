package kr.or.ddit.member.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet("/join.do")
public class joinController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public joinController() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("joinCode", "join");
		
		//RequestDispatcher객체가 요청을 원하는 위치로 전달하게 함
		RequestDispatcher disp = req.getRequestDispatcher("index.jsp");
		disp.forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberVO mv = new MemberVO();
		
		try {
			BeanUtils.populate(mv, req.getParameterMap());
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		System.out.println(mv);
		IMemberService service = MemberService.getInstance();
		int rs = service.joinMem(mv);
		
		resp.getWriter().print(rs);
	}
}
