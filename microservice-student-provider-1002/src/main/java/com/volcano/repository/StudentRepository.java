package com.volcano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
 
import com.volcano.entity.Student;
 
/**
 * 学生Repository接口
 * @author Administrator
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer>,JpaSpecificationExecutor<Student>{
 
}
