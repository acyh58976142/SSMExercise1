package cn.bdqn.xsh.service;

import java.util.List;

import cn.bdqn.xsh.pojo.Invitation;

public interface InvitationService {
	// ��nameΪ��ʱ���鿴���еķ�����Ϣ����ҳ������name��Ϊ��ʱ���ɲ�ѯ���ӣ���ҳ�������շ���ʱ�併������
	List<Invitation> getInvitationByPageAndName(Integer startNum,
			Integer pageSize, String name);

	// ��nameΪ��ʱ����ȡ���еķ�����������name��Ϊ��ʱ����ȡ���������ķ�������
	Integer getInvitationCount(String name);

	// ɾ��ָ�������Ӽ��������Ļظ���¼
	Integer deleteInvitation(Integer id);
}
