package cn.bdqn.xsh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.xsh.pojo.Invitation;

public interface InvitationDao {
	// 当name为空时，查看所有的发帖信息（分页）；当name不为空时，可查询帖子（分页），按照发布时间降序排列
	List<Invitation> getInvitationByPageAndName(
			@Param("startNum") Integer startNum,
			@Param("pageSize") Integer pageSize, @Param("name") String name);

	// 当name为空时，获取所有的发帖数量，当name不为空时，获取满足条件的发帖数量
	Integer getInvitationCount(@Param("name") String name);

	// 删除帖子
	Integer deleteInvitation(Integer id);
}
