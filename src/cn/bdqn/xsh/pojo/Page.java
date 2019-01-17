package cn.bdqn.xsh.pojo;

public class Page {
	private Integer currentPage;// 当前页页码
	private Integer totalCount;// 总记录数
	private Integer pre;// 上一页页码
	private Integer next;// 下一页页码
	private Integer pageSize = 4;// 每页显示数据量
	private Integer pageCount;// 总页数

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
