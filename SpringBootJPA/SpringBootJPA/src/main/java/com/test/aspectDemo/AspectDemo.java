package com.test.aspectDemo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectDemo {

	@Before("execution(* com.test.repository.StudentServicesImpl.save(..))")
	public void doBeforeMethod(JoinPoint joinPoint) {

		System.out.println("***AspectJ*** DoBefore() is running!! intercepted : " + joinPoint.getSignature().getName());
	}

	@After("execution(* com.test.repository.StudentServicesImpl.save(..))")
	public void doAfterMethod(JoinPoint joinPoint) {
		System.out.println("***AspectJ*** DoAfter() is running!! intercepted : " + joinPoint.getSignature().getName());
	}

}