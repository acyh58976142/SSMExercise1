package cn.bdqn.xsh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bdqn.xsh.pojo.Invitation;
import cn.bdqn.xsh.pojo.Page;
import cn.bdqn.xsh.pojo.ReplyDetail;
import cn.bdqn.xsh.service.InvitationService;
import cn.bdqn.xsh.service.ReplyDetailService;

@Controller
public class InvitationManageController {
	@Autowired
	private InvitationService invitationService;
	@Autowired
	private ReplyDetailService replyDetailService;

	// ���������б���ҳ��
	@RequestMapping("/list.do")
	public String list(Integer currentPage, String name, Model model) {
		currentPage = currentPage == null ? 1 : currentPage;
		Page page = new Page();
		page.setTotalCount(invitationService.getInvitationCount(name));
		page.setCurrentPage(currentPage);
		List<Invitation> invlist = invitationService
				.getInvitationByPageAndName((currentPage - 1)
						* page.getPageSize(), page.getPageSize(), name);
		model.addAttribute("invlist", invlist);
		model.addAttribute("page", page);
		model.addAttribute("name", name);
		return "list.jsp";
	}

	// �鿴�ظ���Ϣ�б�
	@RequestMapping("/detail.do")
	public String detail(Integer currentPage, Integer invid, Model model) {
		currentPage = currentPage == null ? 1 : currentPage;
		Page page = new Page();
		page.setTotalCount(replyDetailService.getReplyDetailCount(invid));
		page.setCurrentPage(currentPage);
		List<ReplyDetail> replist = replyDetailService.getReplyDetailByPage(
				(currentPage - 1) * page.getPageSize(), page.getPageSize(),
				invid);
		model.addAttribute("invid", invid);
		model.addAttribute("replist", replist);
		model.addAttribute("page", page);
		return "detail.jsp";
	}

	// ��ӻظ�ʱ�������ӵ�id������ת��addҳ��
	@RequestMapping("/toAdd.do")
	public String toAdd(Integer invid, Model model) {
		model.addAttribute("invid", invid);
		return "add.jsp";
	}

	// ��ӻظ���Ϣ
	@RequestMapping("/add.do")
	public String add(ReplyDetail replyDetail, Model model) {
		if (replyDetail.getAuthor() == "") {
			replyDetail.setAuthor("�����û�");
		}
		Integer num = replyDetailService.addReplyDetail(replyDetail);
		String msg = null;
		if (num == 1) {
			msg = "��ӻظ��ɹ���";
		} else {
			msg = "��ӻظ�ʧ�ܣ�";
		}
		model.addAttribute("msg", msg);
		return "detail.do";
	}

	// ɾ������
	@RequestMapping("/delete.do")
	public String delete(Integer id, Model model) {
		Integer num = invitationService.deleteInvitation(id);
		String msg = null;
		if (num == 1) {
			msg = "ɾ���ɹ���";
		} else {
			msg = "ɾ��ʧ�ܣ�";
		}
		model.addAttribute("msg", msg);
		return "list.do";
	}
}
