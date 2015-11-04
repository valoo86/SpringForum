/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.aspect;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author ETY
 */
@Aspect
@Component
public class LoggingAspect {
    
    @Before("execution(* forum.service.*.*(..))")
    public void firstMethodLog(JoinPoint jp){
        System.out.format("***LOG[%s]Log de début de méthode pour %s\n", new Date(), jp);
        System.out.println("toLongString "+jp.toLongString());
        System.out.println("toShortString "+jp.toShortString());
        System.out.println("toString "+jp.toString());
        System.out.println("getArgs "+jp.getArgs());
        System.out.println("getSignature "+jp.getSignature());
        System.out.println("getSourceLocation "+jp.getSourceLocation());
        System.out.println("getStaticPart "+jp.getStaticPart());
        System.out.println("getTarget "+jp.getTarget());
        System.out.println("getThis "+jp.getThis());
        System.out.println("getKind "+jp.getKind());
    }
    
}
