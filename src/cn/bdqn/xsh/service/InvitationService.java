package cn.bdqn.xsh.service;

import java.util.List;

import cn.bdqn.xsh.pojo.Invitation;

public interface InvitationService {
	// 当name为空时，查看所有的发帖信息（分页）；当name不为空时，可查询帖子（分页），按照发布时间降序排列
	List<Invitation> getInvitationByPageAndName(Integer startNum,
			Integer pageSize, String name);

	// 当name为空时，获取所有的发帖数量，当name不为空时，获取满足条件的发帖数量
	Integer getInvitationCount(String name);

	// 删除指定的帖子及其所属的回复记录
	Integer deleteInvitation(Integer id);
}
