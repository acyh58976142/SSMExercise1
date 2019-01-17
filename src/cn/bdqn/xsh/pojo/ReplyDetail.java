package cn.bdqn.xsh.pojo;

import java.util.Date;

public class ReplyDetail {
	private Integer id;
	private Integer invid;
	private String content;
	private String author;
	private Date createdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getInvid() {
		return invid;
	}

	public void setInvid(Integer invid) {
		this.invid = invid;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "ReplyDetail [author=" + author + ", content=" + content
				+ ", createdate=" + createdate + ", id=" + id + ", invid="
				+ invid + "]";
	}

}
