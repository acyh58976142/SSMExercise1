package cn.bdqn.xsh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bdqn.xsh.dao.ReplyDetailDao;
import cn.bdqn.xsh.pojo.ReplyDetail;

@Service
@Transactional
public class ReplyDetailServiceImpl implements ReplyDetailService {
	@Autowired
	private ReplyDetailDao replyDetailDao;

	public Integer addReplyDetail(ReplyDetail replyDetail) {
		return replyDetailDao.addReplyDetail(replyDetail);
	}

	public List<ReplyDetail> getReplyDetailByPage(Integer startNum,
			Integer pageSize, Integer invid) {
		return replyDetailDao.getReplyDetailByPage(startNum, pageSize, invid);
	}

	public Integer getReplyDetailCount(Integer invid) {
		return replyDetailDao.getReplyDetailCount(invid);
	}

}
