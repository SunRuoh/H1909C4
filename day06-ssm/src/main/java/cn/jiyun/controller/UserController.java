package cn.jiyun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.jiyun.service.UserService;

@Controller
@ResponseBody
public class UserController {

	@Autowired
	UserService us;
	
	
}
