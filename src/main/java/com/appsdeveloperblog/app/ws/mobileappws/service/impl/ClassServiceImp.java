package com.appsdeveloperblog.app.ws.mobileappws.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appsdeveloperblog.app.ws.mobileappws.ClassRepository;
import com.appsdeveloperblog.app.ws.mobileappws.io.entity.ClassEntity;
import com.appsdeveloperblog.app.ws.mobileappws.service.ClassService;
import com.appsdeveloperblog.app.ws.mobileappws.shared.Utils;
import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.ClassDto;

@Service
public class ClassServiceImp implements ClassService {
	
	@Autowired
	ClassRepository classRepository;
	
	@Autowired
	Utils utils;

	@Override
	public ClassDto createClass(ClassDto classInfor) {
		ClassEntity classEntity = new ClassEntity();
		
		BeanUtils.copyProperties(classInfor, classEntity);
		String publicClassId = utils.generateUserId(30);
		
		classEntity.setClassId(publicClassId);
		ClassEntity createdClass =  classRepository.save(classEntity);
		
		ClassDto returnValue = new ClassDto();
		
		BeanUtils.copyProperties(createdClass, returnValue);
		
		return returnValue;
	}
	
	@Override
	public List<ClassEntity> getAllClasses() {	
		List<ClassEntity> data = new ArrayList<ClassEntity>();
		classRepository.findAll().forEach(data::add);
		
		return data;
	}

}
