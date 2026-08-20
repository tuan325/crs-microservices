package com.example.auth_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "app_user") // Phải đặt tên là app_user vì chữ 'user' là từ khóa dễ gây lỗi trong MySQL
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String username;

    @Column(nullable = false)
    private String password; // Luôn lưu dạng đã mã hóa BCrypt, không bao giờ lưu plain text[cite: 1]

    @Column(nullable = false, length = 20)
    private String role; // Chỉ nhận giá trị "ADMIN" hoặc "STUDENT"[cite: 1]
}