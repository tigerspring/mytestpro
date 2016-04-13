package org.test.observer.version4.event;

import java.lang.reflect.Method;

public class Event {

	/** 目标类 */
	private Object object;
	/** 目标方法 */
	private String methodName;
	/** 目标方法参数 */
	private Object[] params;
	/** 目标方法参数类型 */
	@SuppressWarnings("rawtypes")
	private Class[] paramTypes;
	
	public Event() {
	}
	
	public Event(Object object, String methodName, Object[] params) {
		super();
		this.object = object;
		this.methodName = methodName;
		this.params = params;
		contractParamTypes(params);
	}
	
	private void contractParamTypes(Object[] params){
		this.paramTypes=new Class[params.length];
		for(int i=0;i<params.length;i++){
			this.paramTypes[i] = params[i].getClass();
		}
	}
	
	public Object getObject(){
		return this.object;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Object[] getParams() {
		return params;
	}

	public void setParams(Object[] params) {
		this.params = params;
		contractParamTypes(params);
	}

	@SuppressWarnings("rawtypes")
	public Class[] getParamTypes() {
		return paramTypes;
	}

	
	public void invoke() throws Exception{
		
		Method method = this.getObject().getClass().getMethod(this.getMethodName(), this.getParamTypes());
		if(method == null){
			return ;
		}
		method.invoke(this.getObject(), this.getParams());
	}
	
}
