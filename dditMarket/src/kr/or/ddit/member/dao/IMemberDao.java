package kr.or.ddit.member.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberDao {
	
	public int joinMem(MemberVO mv);
	
	public String loginChk(Map<String, Object> map);

	
	/**
	 * 해당 회원의 상세정보를 조회하기 위한 메서드
	 * @param memId 회원ID
	 * @return 해당회원의 상세정보를 담은 MemberVO객체 리턴함
	 */
	public MemberVO getMember(String memId);
	
	/**
	 * 회원의 id를 찾기 위한 메서드
	 * @param mv 회원의 id, 주민등록번호
	 * @return 해당 회원의 id를 담은 객체 리턴
	 */
	public String findId(MemberVO mv);
	
	/**
	 * 회원의 Email이 맞는지 확인하기 위한 메서드
	 * @param mv 회원의 아이디, 이메일을 담고있음
	 * @return email을 리턴
	 */
	public String findEmail(MemberVO mv);

	/**
	 * 회원의 비밀번호를 임시비밀번호로 변경하기 위한 메서드
	 * @param cNumber 임시비밀번호를 담고있는 객체
	 */
	public void updatePw(MemberVO mv);

	/**
	 * 회원의 개인정보를 변경하기위한 메서드
	 * @param map 변경할 회원의정보를 담고있는 개체
	 */
	public int updateMember(Map<String, Object> map);
	
	/**
	 * 회원탈퇴를 위한 메서드
	 * @param mv
	 * @return
	 */
	public int delMember(MemberVO mv);

	public List<MemberVO> memberBoard();
}
