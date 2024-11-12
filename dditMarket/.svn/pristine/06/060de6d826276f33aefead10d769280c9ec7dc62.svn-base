package kr.or.ddit.member.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import kr.or.ddit.member.service.IMemberService;
import kr.or.ddit.member.service.MemberService;
import kr.or.ddit.member.vo.MemberVO;

@WebServlet("/findId.do")
public class findIdController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public findIdController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("memViews/findIdForm.jsp").forward(req, resp);
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
		System.out.println(mv)
		;
		IMemberService service = MemberService.getInstance();
		
		String rs = service.findId(mv);
		
		if(rs != null) { 
	        req.setAttribute("memId", rs);
		} 
//		else {
//			resp.sendRedirect("findIdForm.jsp.jsp");
//		}
//		
		resp.getWriter().print(rs);
		
		
	}
}
