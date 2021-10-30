package com.appsdeveloperblog.app.ws.mobileappws.io.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="classes")
public class ClassEntity implements Serializable {

	private static final long serialVersionUID = 4431213718217152495L;

	@Id
	@GeneratedValue
	private long id;

	@Column(nullable = false)
	private String classId;

	@Column(nullable = false, length = 120)
	private String name;

	@Column(nullable = false, length = 1200)
	private String details;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
