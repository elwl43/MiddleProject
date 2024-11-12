package kr.or.ddit.member.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.member.vo.MemberVO;

public interface IMemberService {
	
	/**
	 * 회원 가입
	 * @param mv 회원정보를 담은 객체
	 * @return 성공 1 실패 0
	 */
	public int joinMem(MemberVO mv);
	
	/**
	 * 로그인 id-pw 검증
	 * @param map
	 * @return
	 */
	public String loginChk(Map<String, Object> map);
	
	/**
	 * 회원 정보 수정
	 * @param mv 회원정보를 담은 객체
	 * @return 성공 1 실패 0
	 */
	public int modifyMember(MemberVO mv);
	
	/**
	 * 회원 정보 삭제
	 * @param mem_id 삭제할 mem_id
	 * @return 삭제 성공시 1 실패 0
	 */
	public int removeMember(String mem_id);
	
	/**
	 * 해당 회원의 상세정보를 조회하기 위한 메서드
	 * @param memId 회원ID
	 * @return 해당회원의 상세정보를 담은 MemberVO객체 리턴함
	 */
	public MemberVO getMember(String memId);

	/**
	 * 회원의 아이디를 찾기위한 메서드
	 * @param mv 회원 Id, 주민등록번호
	 * @return 해당 회원의 ID 리턴
	 */
	public String findId(MemberVO mv);

	/**
	 * 회원의 패스워드를 찾기 위한 메서드
	 * @param mv
	 * @return
	 */
	public String findPw(MemberVO mv);
	
	/**
	 * 회원의 이메일이 맞는지 확인하기 위한 메서드
	 * @param mv
	 * @return
	 */
	public String findEmail(MemberVO mv);
	
	/**
	 * 회원의 비밀번호를 임시비밀번호로 변경하기 위한 메서드
	 * @param mv
	 */
	public void updatePw(MemberVO mv);

	/**
	 * 회원의 개인정보를 업데이트 하기 위한 메서드
	 * @param map 회원의 개인정보를 변경할 정보를 담은 객체
	 */
	public int updateMember(Map<String, Object> map);
	
	/**
	 * 회원 탈퇴를 하기 위한 메서드
	 * @param mv
	 * @return
	 */
	public int delId(MemberVO mv);

	public List<MemberVO> memberBoard();
	
}
