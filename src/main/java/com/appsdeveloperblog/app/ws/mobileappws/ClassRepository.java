package com.appsdeveloperblog.app.ws.mobileappws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.io.entity.ClassEntity;

@Repository
public interface ClassRepository extends CrudRepository<ClassEntity, Long> {
}
