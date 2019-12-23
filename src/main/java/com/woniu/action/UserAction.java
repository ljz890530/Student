package com.woniu.action;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.woniu.pojo.User;
import com.woniu.pojo.UserRole;
import com.woniu.service.IUserService;
@Controller
public class UserAction {
	@Autowired
	private IUserService us;
	
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	//在云端修改
	//登录
	public String login() {
		
		User u = us.findOne(user);
		if(u!=null) {
			//登录成功后将用户信息存放到session中
			ActionContext.getContext().getSession().put("loginUser", u);
		}
		
		//根据权限跳转不同界面
		Set<UserRole> userRoles = u.getUserRoles();
		Iterator<UserRole> iterator = userRoles.iterator();
		int rid = 0;
		while(iterator.hasNext()) {
			UserRole ur = iterator.next();
			int id  = ur.getRole().getRid();
			if(id>rid) {
				rid = id;
			}
		}
		if(rid == 1) {
			return "student";
		}
		if(rid == 2) {
			return "teacher";
		}
		if(rid == 3) {
			return "leader";
		}
		if(rid == 4) {
			return "director";
		}
		return "fail";
	}
	
	//安全退出
	public String exit() {
		ActionContext.getContext().getSession().remove("loginUser");
		return "success";
	}
}
