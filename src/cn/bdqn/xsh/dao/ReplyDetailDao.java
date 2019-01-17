package cn.bdqn.xsh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.xsh.pojo.ReplyDetail;

public interface ReplyDetailDao {
	// �鿴�ظ�����ҳ��
	List<ReplyDetail> getReplyDetailByPage(@Param("startNum") Integer startNum,
			@Param("pageSize") Integer pageSize,@Param("invid")Integer invid);
	
	//��ȡ�ظ���������
	Integer getReplyDetailCount(Integer invid);

	// ��ӻظ�
	Integer addReplyDetail(ReplyDetail replyDetail);

	// ɾ���ظ�
	Integer deleteReplyDetail(Integer invid);
}
