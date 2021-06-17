package com.spring.async.configuration;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

	@Override
	public void handleUncaughtException(Throwable ex, Method method, Object... params) {

		System.out.println("Name of Method: " + method.getName() + " ---- " + Arrays.toString(params) + " message: "
				+ ex.getMessage());

	}

}
