package com.appsdeveloperblog.app.ws.mobileappws.ui.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appsdeveloperblog.app.ws.mobileappws.ClassRepository;
import com.appsdeveloperblog.app.ws.mobileappws.io.entity.ClassEntity;
import com.appsdeveloperblog.app.ws.mobileappws.service.ClassService;
import com.appsdeveloperblog.app.ws.mobileappws.shared.dto.ClassDto;
import com.appsdeveloperblog.app.ws.mobileappws.ui.model.request.ClassDetailsRequestModel;

@CrossOrigin("http://localhost:3000")
@RestController
@RequestMapping("/classes")
public class classController {

	@Autowired
	ClassService classService;
	
	@Autowired
	ClassRepository classRepository;

	@GetMapping("/getall")
	public ResponseEntity<List<ClassEntity>> getListClass() {
		try {

			List<ClassEntity> allClasses = classService.getAllClasses();

			if (allClasses.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(allClasses, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
//		 try {
//		      List<ClassEntity> allClass = new ArrayList<ClassEntity>();
//
//		      classRepository.findAll().forEach(allClass::add);
//
//		      if (allClass.isEmpty()) {
//		        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		      }
//
//		      return new ResponseEntity<>(allClass, HttpStatus.OK);
//		    } catch (Exception e) {
//		      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//		    }

	}

	@PostMapping("/add")
	public ClassDto createClass(@RequestBody ClassDetailsRequestModel classDetails) {
		// RequestBody là để cho method này có thể đọc đc body từ http req và sau đó có
		// thể chuyển nó từ json thành java object
		ClassDto classDto = new ClassDto();

		BeanUtils.copyProperties(classDetails, classDto);

		ClassDto createdClass = classService.createClass(classDto);

		return createdClass;
	}
}
