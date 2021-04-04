package com.classboxes.hibernateonetooneexample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "instructor_detail")
public class InstructorDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "instructor_detail_id")
	private int instructor_detail_id;
	
	//@Column(name = "website_url")
	private String website_url;
	
	@Column(name = "hobby")
	private String hobby;

	public InstructorDetail() {
		super();
	}

	public InstructorDetail(String website_url, String hobby) {
		super();
		this.website_url = website_url;
		this.hobby = hobby;
	}

	
	public InstructorDetail(int instructor_detail_id, String website_url, String hobby) {
		super();
		this.instructor_detail_id = instructor_detail_id;
		this.website_url = website_url;
		this.hobby = hobby;
	}

	public int getInstructor_detail_id() {
		return instructor_detail_id;
	}

	public void setInstructor_detail_id(int instructor_detail_id) {
		this.instructor_detail_id = instructor_detail_id;
	}

	public String getWebsite_url() {
		return website_url;
	}

	public void setWebsite_url(String website_url) {
		this.website_url = website_url;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "InstructorDetail [instructor_detail_id=" + instructor_detail_id + ", website_url=" + website_url
				+ ", hobby=" + hobby + "]";
	}
	
	
	
}
