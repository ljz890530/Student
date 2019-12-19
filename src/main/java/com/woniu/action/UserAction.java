package com.woniu.action;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
	
	public String save() {
		us.save(user);
		return "success";
	}
	public String login() {
		System.out.println(user);
		User u = us.findOne(user);
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
}
