package kr.or.ddit.file.Service;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.Part;

import kr.or.ddit.file.dao.AtchFileDaoImpl;
import kr.or.ddit.file.dao.IAtchFileDao;
import kr.or.ddit.file.vo.AtchFileDetailVO;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.file.vo.AtchSmpleVO;

public class AtchFileServiceImpl implements IAtchFileService {

	private IAtchFileDao fileDao;

	private static IAtchFileService fileService = new AtchFileServiceImpl();

	public AtchFileServiceImpl() {
		fileDao = AtchFileDaoImpl.getInstance();
	}

	public static IAtchFileService getInstance() {
		return fileService;
	}

	@Override
	public AtchFileVO saveAtchFileList(Collection<Part> parts) {

		String uploadPath = "D:/A_TeachingMaterial/04_MiddelProject/workspace/dditMarket/WebContent/image";
		File uploadDir = new File(uploadPath);
		if (!uploadDir.exists()) {
			uploadDir.mkdir();
		}
		AtchFileVO atchFileVO = null;

		boolean isFirstFile = true; // 첫번째 파일 유무

		for (Part part : parts) {
			String fileName = part.getSubmittedFileName();

			if (fileName != null && !fileName.equals("")) {

				if (isFirstFile) { // 첫번째 업로드파일인지 체크

					isFirstFile = false;

					atchFileVO = new AtchFileVO();

					fileDao.insertAtchFile(atchFileVO); // ATCH_FILE에 insert하기

				}
				long fileSize = part.getSize(); // 파일크기
				String saveFileName = UUID.randomUUID().toString().replaceAll("-", ""); // 저장파일명
				String saveFilePath = uploadPath + "/" + saveFileName; // 저장파일 경로

				// 확장자 추출
				String fileExtension = fileName.lastIndexOf(".") < 0 ? "" : fileName.substring(fileName.lastIndexOf(".") + 1);

				try {
					// 업로드 파일
					part.write(saveFilePath);
				} catch (IOException ex) {
					ex.printStackTrace();
				}

				AtchFileDetailVO atchFileDetailVO = new AtchFileDetailVO();
				atchFileDetailVO.setAtchFileId(atchFileVO.getAtchFileId());
				atchFileDetailVO.setStreFileNm(saveFileName);
				atchFileDetailVO.setFileSize(fileSize);
				atchFileDetailVO.setOrignlFileNm(fileName);
				atchFileDetailVO.setFileStreCours(saveFilePath);
				atchFileDetailVO.setFileExtsn(fileExtension);

				fileDao.insertAtchFileDetail(atchFileDetailVO);

				try {
					// 임시 업로드 파일 삭제처리 하기
					part.delete();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

		return atchFileVO;
	}

	@Override
	public AtchFileVO getAtchFile(AtchFileVO fileVO) {
		return fileDao.getAtchFile(fileVO);
	}

	@Override
	public AtchFileDetailVO getAtchFileDetail(AtchFileDetailVO atchFileDetailVO) {
		return fileDao.getAtchFileDetail(atchFileDetailVO);
	}

	@Override
	public List<AtchSmpleVO> getAtchSmple() {
		return fileDao.getAtchSmple();
	}

}
