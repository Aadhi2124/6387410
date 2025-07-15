package org.library.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* org.library.service.*.*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // Proceed with method execution

        long duration = System.currentTimeMillis() - start;
        System.out.println("Method " + joinPoint.getSignature() + " executed in " + duration + "ms");

        return result;
    }
}

