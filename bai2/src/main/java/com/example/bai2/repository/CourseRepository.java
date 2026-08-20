package com.example.bai2.repository;

import com.example.bai2.entity.Course; // Import Entity Course của bạn
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {

    // Hàm kiểm tra trùng tên môn học (không phân biệt hoa thường)
    boolean existsByTenMonHocIgnoreCase(String tenMonHoc);

    // HÀM MỚI (BUỔI 3): Tìm kiếm theo tên có phân trang
    Page<Course> findByTenMonHocContainingIgnoreCase(String keyword, Pageable pageable);
}