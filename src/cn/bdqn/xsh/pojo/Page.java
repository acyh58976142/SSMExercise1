package cn.bdqn.xsh.pojo;

public class Page {
	private Integer currentPage;// ��ǰҳҳ��
	private Integer totalCount;// �ܼ�¼��
	private Integer pre;// ��һҳҳ��
	private Integer next;// ��һҳҳ��
	private Integer pageSize = 4;// ÿҳ��ʾ������
	private Integer pageCount;// ��ҳ��

	public Integer getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		pre = currentPage <= 1 ? 1 : currentPage - 1;
		next = currentPage >= pageCount ? pageCount : currentPage + 1;
	}

	public Integer getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
		pageCount = totalCount % pageSize == 0 ? totalCount / pageSize
				: totalCount / pageSize + 1;
	}

	public Integer getPre() {
		return pre;
	}

	public void setPre(Integer pre) {
		this.pre = pre;
	}

	public Integer getNext() {
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

}
