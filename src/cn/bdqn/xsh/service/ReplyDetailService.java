package cn.bdqn.xsh.service;

import java.util.List;

import cn.bdqn.xsh.pojo.ReplyDetail;

public interface ReplyDetailService {
	// �鿴�ظ�����ҳ��
	List<ReplyDetail> getReplyDetailByPage(Integer startNum, Integer pageSize,
			Integer invid);

	// ��ȡ�ظ���������
	Integer getReplyDetailCount(Integer invid);

	// ��ӻظ�
	Integer addReplyDetail(ReplyDetail replyDetail);
}
