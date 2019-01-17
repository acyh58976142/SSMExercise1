package cn.bdqn.xsh.service;

import java.util.List;

import cn.bdqn.xsh.pojo.ReplyDetail;

public interface ReplyDetailService {
	// 查看回复（分页）
	List<ReplyDetail> getReplyDetailByPage(Integer startNum, Integer pageSize,
			Integer invid);

	// 获取回复的总数量
	Integer getReplyDetailCount(Integer invid);

	// 添加回复
	Integer addReplyDetail(ReplyDetail replyDetail);
}
