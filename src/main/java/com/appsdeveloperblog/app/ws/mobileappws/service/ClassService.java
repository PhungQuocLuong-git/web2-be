package com.appsdeveloperblog.app.ws.mobileappws.service;

import java.util.List;

import com.appsdeveloperblog.app.ws.mobileappws.io.entity.ClassEntity;
import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.ClassDto;

public interface ClassService {
	ClassDto createClass(ClassDto classInfor);
	List<ClassEntity> getAllClasses();
}
