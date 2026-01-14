package com.hoangnm.testDemo.enity;

import jakarta.persistence.*; //các thư viện của JPA
import lombok.Data;

@Entity //đánh dấu là một thực thể, đại diện một bảng trong database
@Table(name="users") //chỉ định tên bảng trong database, nếu không có dòng này, mặc định spring sẽ tạo ra bảng có tên giống class
@Data //lombok tự sinh tất cả hàm get set
public class User{

    @Id // đánh dấu là primary key của bảng
    @GeneratedValue(strategy=GenerationType.IDENTITY) //thiết lập auto Increment (tự động tăng khi tạo mới 1 2 3)
    private Long id;

    //unique = true đảm bảo không có người dùng nào bị trùng user name
    //nullable = false không được để trống
    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

}
