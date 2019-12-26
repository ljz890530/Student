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
	
	/**ÿ�η���Action��֮ǰ����ִ��intercept����*/
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		//��ȡ��ǰ����Action��URL
        String actionName = invocation.getProxy().getActionName();
        //�����ǰ����Action��URL��login.action��ʾ��ʱ��û��Session����Ҫ����
        if(!"login".equals(actionName)){
            //��Session�л�ȡ��ǰ�û�����
            User user = (User) ActionContext.getContext().getSession().get("loginUser");
            //���Session�����ڣ���ת����¼ҳ��
            if(user == null){
                return "login";//���login�Ѿ���struts.xml��ȫ�ֽ����ͼ��������
            }
        }
        //���У�����Action���з���
        return invocation.invoke();

	}

}
