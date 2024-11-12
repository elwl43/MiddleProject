package kr.or.ddit.file.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import kr.or.ddit.file.Service.AtchFileServiceImpl;
import kr.or.ddit.file.Service.IAtchFileService;
import kr.or.ddit.file.vo.AtchFileDetailVO;


@WebServlet("/download.do")
public class FileDownloadController extends HttpServlet {

	private static final Logger PARAM_LOGGER = LogManager.getLogger("log4jexam.sql.Parameter");
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		long atchFileId = req.getParameter("atchFileId") == null ? -1 : Long.parseLong(req.getParameter("atchFileId"));
		int fileSn = req.getParameter("fileSn") == null ? -1 : Integer.parseInt(req.getParameter("fileSn"));
		
		IAtchFileService fileService = AtchFileServiceImpl.getInstance();

		AtchFileDetailVO atchFileDetailVO = new AtchFileDetailVO();
		atchFileDetailVO.setAtchFileId(atchFileId);
		atchFileDetailVO.setFileSn(fileSn);

		atchFileDetailVO = fileService.getAtchFileDetail(atchFileDetailVO);

		/*
			Content -Disposition 가 파일 다운로드시 사용되는 경우
			
			Content-Disposition: inline (default)
			Content-Disposition: attachment								   // 파일 다운로드(서블릿 이름으로)	
			Content-Disposition: attachment; filename="abc.jpg" // abc.jpg이름으로 파일 다운
			
		*/

		// 파일 다운로드 처리를 위한 응답헤더 정보 설정하기
		resp.setContentType("application/octet-stream");

		// URL에는 문자를 포함할 수 없다. URLEncoding을 이용하여 인코딩 처리를 하면 공백은(+)로 표시되기 때문에 (+)문자를
		// 공백문자인 %20으로 바꿔서 처리해준다
		resp.setHeader("Content-Disposition", "attachment; filename=\""
				+ URLEncoder.encode(atchFileDetailVO.getOrignlFileNm(), "UTF-8").replaceAll("\\+", "%20") + "\"");

		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(atchFileDetailVO.getFileStreCours()));

		BufferedOutputStream bos = new BufferedOutputStream(resp.getOutputStream());

		int data = 0;

		while ((data = bis.read()) != -1) {
			bos.write(data);
		}

		bis.close();
		bos.close();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
