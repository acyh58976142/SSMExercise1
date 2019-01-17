package cn.bdqn.xsh.pojo;

import java.util.Date;

public class Invitation {
	private Integer id;
	private String title;
	private String summary;
	private String author;
	private Date createdate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
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
		return "Invitation [author=" + author + ", createdate=" + createdate
				+ ", id=" + id + ", summary=" + summary + ", title=" + title
				+ "]";
	}

}
