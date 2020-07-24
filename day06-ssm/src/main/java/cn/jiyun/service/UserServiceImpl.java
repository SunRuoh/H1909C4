package cn.jiyun.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.jiyun.mapper.DeptMapper;
import cn.jiyun.mapper.EmployeeMapper;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	DeptMapper deptMapper;
	
	
	
}
