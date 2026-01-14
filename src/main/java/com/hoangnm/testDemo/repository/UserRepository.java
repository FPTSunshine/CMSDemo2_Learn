package com.hoangnm.testDemo.repository;

import com.hoangnm.testDemo.enity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional; //1. Nạp thư viện Optional để tránh lỗi NullPointerException

public interface UserRepository  extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); //hàm tìm kiếm người dùng theo tên

}
