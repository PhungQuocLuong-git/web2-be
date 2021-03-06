package com.appsdeveloperblog.app.ws.mobileappws.shared.dto;

import java.io.Serializable;

public class ClassDto implements Serializable {

	private static final long serialVersionUID = -6143005994676901428L;

	private long id;
	private String classId;
	private String name;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
