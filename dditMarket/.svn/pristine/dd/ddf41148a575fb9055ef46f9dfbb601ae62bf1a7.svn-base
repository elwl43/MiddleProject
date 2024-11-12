package kr.or.ddit.member.service;

import java.util.List;
import java.util.Map;

import kr.or.ddit.member.dao.IMemberDao;
import kr.or.ddit.member.dao.MemberDao;
import kr.or.ddit.member.vo.MemberVO;

public class MemberService implements IMemberService {

	private static IMemberService service;
	private IMemberDao dao;
	
	private MemberService() {
		dao = MemberDao.getInstance();
	}
	
	public static IMemberService getInstance() {
		if(service == null) service = new MemberService();
		return service;
	}
	
	@Override
	public int joinMem(MemberVO mv) {
		int rs = dao.joinMem(mv);
		return rs;
	}

	@Override
	public String loginChk(Map<String, Object> map) {
		String memId = "";
		try {
			memId = dao.loginChk(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return memId;
	}

	@Override
	public int modifyMember(MemberVO mv) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int removeMember(String mem_id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberVO getMember(String memId) {
		return dao.getMember(memId);
	}

	@Override
	public String findId(MemberVO mv) {
		return dao.findId(mv);
	}

	@Override
	public String findPw(MemberVO mv) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String findEmail(MemberVO mv) {
		// TODO Auto-generated method stub
		return dao.findEmail(mv);
	}

	@Override
	public void updatePw(MemberVO mv) {
		dao.updatePw(mv);
	}

	@Override
	public int updateMember(Map<String, Object> map) {
		int res = dao.updateMember(map);
		return res;
	}

	@Override
	public int delId(MemberVO mv) {
		int res = dao.delMember(mv);
		return res;
	}

	@Override
	public List<MemberVO> memberBoard() {
		return dao.memberBoard();
	}

}
