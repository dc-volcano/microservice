package com.volcano.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.volcano.entity.Student;
import com.volcano.service.StudentClientService;

/**
 * 
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student")
public class StudentConsumerController {
 
     @Autowired
     private StudentClientService studentClientService;
      
     /**
      * 添加或者修改学生信息
      * @param student
      * @return
      */
     @PostMapping(value="/save")
     private boolean save(Student student){
         return studentClientService.save(student);
     }
      
     /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value="/list")
    public List<Student> list(){
        return studentClientService.list();
    }
     
    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentClientService.get(id);
    }
     
    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
    	return studentClientService.delete(id);
    }
    
    /**
     * 获取信息
     * @return
     */
    @GetMapping(value="/getInfo")
    @ResponseBody
    public Map<String,Object> getInfo(){
        return studentClientService.getInfo();
    }
}
