package com.core.java.ProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * An invocation handler that prints out the method name and parameters,
 * then invoke the original method
 *
 * @author 	Lian
 * @date 	16/9/7
 * @since 	1.0
 */
class TraceHandler implements InvocationHandler {

	private Object target;

	/**
	 * Constructs a TraceHandler
	 *
	 * @param obj	the implicit parameter of the mothod call
	 */
	public TraceHandler(Object obj) {
		this.target = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// print implicit argument
		System.out.print(target);

		// print method name
		System.out.print("." + method.getName() + "(");

		// print explicit arguments
		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.print(args[i]);
				if(i<args.length -1) {
					System.out.print(", ");
				}
			}
		}

		System.out.println(")");

		// invoke actual method
		return method.invoke(target, args);
	}
}
