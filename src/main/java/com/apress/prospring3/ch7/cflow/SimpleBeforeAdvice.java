package com.apress.prospring3.ch7.cflow;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

public class SimpleBeforeAdvice implements MethodBeforeAdvice {
	public void before(Method method, Object[] args, Object target)
			throws Throwable {
		System.out.println("Before method: " + method);
	}
}