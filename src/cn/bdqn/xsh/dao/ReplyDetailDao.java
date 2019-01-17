package cn.bdqn.xsh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.xsh.pojo.ReplyDetail;

public interface ReplyDetailDao {
	// 查看回复（分页）
	List<ReplyDetail> getReplyDetailByPage(@Param("startNum") Integer startNum,
			@Param("pageSize") Integer pageSize,@Param("invid")Integer invid);
	
	//获取回复的总数量
	Integer getReplyDetailCount(Integer invid);

	// 添加回复
	Integer addReplyDetail(ReplyDetail replyDetail);

	// 删除回复
	Integer deleteReplyDetail(Integer invid);
}
