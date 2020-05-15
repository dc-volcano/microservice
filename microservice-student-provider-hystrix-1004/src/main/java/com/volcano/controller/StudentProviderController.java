package com.volcano.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volcano.entity.Student;
import com.volcano.service.StudentService;

/**
 * 服务提供者-学生信息控制器
 * @author Administrator
 *
 */
@RestController
@RequestMapping("/student")
public class StudentProviderController {
 
    @Resource
    private StudentService studentService;
     
    /**
     * 添加或者修改学生信息
     * @param student
     * @return
     */
    @PostMapping(value="/save")
    public boolean save(@RequestBody Student student){
        try{
            studentService.save(student);  
            return true;
        }catch(Exception e){
            return false;
        }
    }
     
    /**
     * 查询学生信息
     * @return
     */
    @GetMapping(value="/list")
    public List<Student> list(){
    	System.out.println("list--------->1004");
        return studentService.list();
    }
     
    /**
     * 根据id查询学生信息
     * @return
     */
    @GetMapping(value="/get/{id}")
    public Student get(@PathVariable("id") Integer id){
        return studentService.findById(id);
    }
     
    /**
     * 根据id删除学生信息
     * @return
     */
    @GetMapping(value="/delete/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        try{
            studentService.delete(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    /**
     * 获取信息
     * @return
     * @throws InterruptedException 
     */
    @GetMapping(value="/getInfo")
    public Map<String,Object> getInfo() throws InterruptedException{
        Thread.sleep(500);
        return studentService.getInfo();
    }
     
}
