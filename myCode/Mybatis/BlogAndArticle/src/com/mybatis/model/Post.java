package com.mybatis.model;

import java.util.Date;

public class Post {
	private int id;  
    private int blog_id;  
    private int author_id;  
    private Date created_on;  
    private String section;  
    private String subject;  
    private String draft;  
    private String body;
	public int getId() {
		return id;
	}
	public int getBlog_id() {
		return blog_id;
	}
	public int getAuthor_id() {
		return author_id;
	}
	public Date getCreated_on() {
		return created_on;
	}
	public String getSection() {
		return section;
	}
	public String getSubject() {
		return subject;
	}
	public String getDraft() {
		return draft;
	}
	public String getBody() {
		return body;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBlog_id(int blog_id) {
		this.blog_id = blog_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setDraft(String draft) {
		this.draft = draft;
	}
	public void setBody(String body) {
		this.body = body;
	}
}
