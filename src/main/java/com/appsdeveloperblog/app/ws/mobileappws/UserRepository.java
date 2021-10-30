package com.appsdeveloperblog.app.ws.mobileappws;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appsdeveloperblog.app.ws.mobileappws.io.entity.UserEntity;

//nếu không sử dụng springframework thì phải tự tạo dao
//jpa hỗ trợ không cần tạo phương thức crud , nhưng đi làm thì cần tạo và phải mở connect và đóng connect

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
	UserEntity findByEmail(String email); //chuẩn find + By + <varible> là có thể query xuống db
}
