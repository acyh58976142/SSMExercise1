package cn.bdqn.xsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bdqn.xsh.dao.InvitationDao;
import cn.bdqn.xsh.dao.ReplyDetailDao;
import cn.bdqn.xsh.pojo.Invitation;

@Service
@Transactional
public class InvitationServiceImpl implements InvitationService {
	@Autowired
	private InvitationDao invitationDao;
	@Autowired
	private ReplyDetailDao replyDetailDao;

	public Integer deleteInvitation(Integer id) {
		replyDetailDao.deleteReplyDetail(id);
		return invitationDao.deleteInvitation(id);
	}

	public List<Invitation> getInvitationByPageAndName(Integer startNum,
			Integer pageSize, String name) {
		return invitationDao.getInvitationByPageAndName(startNum, pageSize,
				name);
	}

	public Integer getInvitationCount(String name) {
		return invitationDao.getInvitationCount(name);
	}

}
