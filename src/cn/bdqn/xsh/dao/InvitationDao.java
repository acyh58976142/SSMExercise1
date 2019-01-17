package cn.bdqn.xsh.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.bdqn.xsh.pojo.Invitation;

public interface InvitationDao {
	// ��nameΪ��ʱ���鿴���еķ�����Ϣ����ҳ������name��Ϊ��ʱ���ɲ�ѯ���ӣ���ҳ�������շ���ʱ�併������
	List<Invitation> getInvitationByPageAndName(
			@Param("startNum") Integer startNum,
			@Param("pageSize") Integer pageSize, @Param("name") String name);

	// ��nameΪ��ʱ����ȡ���еķ�����������name��Ϊ��ʱ����ȡ���������ķ�������
	Integer getInvitationCount(@Param("name") String name);

	// ɾ������
	Integer deleteInvitation(Integer id);
}
