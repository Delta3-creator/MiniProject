package com.example.studentmanagement.repository;

import com.example.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // Basic CRUD operations are automatically provided by JpaRepository
    
    // You can add custom query methods here
    List<Student> findByNameContainingIgnoreCase(String name);
    
    Optional<Student> findByEmail(String email);
    
    boolean existsByEmail(String email);
}