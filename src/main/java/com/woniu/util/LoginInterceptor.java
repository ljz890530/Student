package com.woniu.util;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
import com.woniu.pojo.User;

public class LoginInterceptor implements Interceptor {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}
	
	/**每次访问Action类之前，先执行intercept方法*/
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//获取当前访问Action的URL
        String actionName = invocation.getProxy().getActionName();
        //如果当前访问Action的URL是login.action表示此时还没有Session，需要放行
        if(!"login".equals(actionName)){
            //从Session中获取当前用户对象
            User user = (User) ActionContext.getContext().getSession().get("loginUser");
            //如果Session不存在，跳转到登录页面
            if(user == null){
                return "login";//这个login已经在struts.xml的全局结果视图中配置了
            }
        }
        //放行，访问Action类中方法
        return invocation.invoke();

	}

}
