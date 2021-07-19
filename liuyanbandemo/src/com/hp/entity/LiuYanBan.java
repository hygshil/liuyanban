package com.hp.entity;

public class LiuYanBan {
	private String title;
	private String author;
	private String content;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public LiuYanBan(String title, String author, String content) {
		super();
		this.title = title;
		this.author = author;
		this.content = content;
	}
	public LiuYanBan() {
		super();
		// TODO 自动生成的构造函数存根
	}
	@Override
	public String toString() {
		return "LiuYanBan [title=" + title + ", author=" + author
				+ ", content=" + content + "]";
	}
	

}
