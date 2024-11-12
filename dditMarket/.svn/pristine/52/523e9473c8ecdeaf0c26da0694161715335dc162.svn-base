package kr.or.ddit.file.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.file.vo.AtchFileDetailVO;
import kr.or.ddit.file.vo.AtchFileVO;
import kr.or.ddit.file.vo.AtchSmpleVO;

public interface IAtchFileDao {
	
	/**
	 *  첨부파일 저장
	 * @param atchFileVO
	 * @return
	 */
	public int insertAtchFile(AtchFileVO atchFileVO);
	
	/**
	 *  첨부파일 세부정보 저장
	 * @param atchFileVO
	 * @return
	 */
	public int insertAtchFileDetail(AtchFileDetailVO atchFileDetailVO);
	
	/**
	 * 첨부파일목록 조회하기
	 * @param atchFileVO
	 * @return
	 */
	public AtchFileVO getAtchFile(AtchFileVO atchFileVO);
	
	/**
	 * 상세첨부파일 정보 조회하기
	 * @param atchFileDetailVO
	 * @return
	 */
	public AtchFileDetailVO getAtchFileDetail(AtchFileDetailVO atchFileDetailVO);
	
	
	/**
	 *  첨부파일 간단정보를 조회하기 위한 메서드(화면에 출력시 사용)
	 * @param atchFileId 및 fileSn을 담은 객체
	 * @return 간단정보를 담은 AtchSmpleVO 객체
	 */
	public List<AtchSmpleVO> getAtchSmple();
}
