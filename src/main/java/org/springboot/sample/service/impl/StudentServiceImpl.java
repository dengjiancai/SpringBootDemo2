package org.springboot.sample.service.impl;

import org.springboot.sample.entity.Student;
import org.springboot.sample.mapper.StudentMapper;
import org.springboot.sample.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Student Service
 *
 * @author   单红宇(365384722)
 * @myblog  http://blog.csdn.net/catoop/
 * @create    2016年1月12日
 */
@Service("studentService")
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Student getById(int id) {
		return studentMapper.getById(id);
	}
}
