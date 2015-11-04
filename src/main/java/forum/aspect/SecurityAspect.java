/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.aspect;

import forum.service.SecurityService;
import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author ETY
 */
@Aspect
@Component
public class SecurityAspect {
    
    @Autowired
    private SecurityService securityService;
    
    //@Before("execution(* forum.service.*.*(..))")
    @Before("execution(* forum.service.*.*(..)) && !execution(* forum.service.SecurityService.*(..))")
    public void checkedExceptionBeforeMethodExecution(JoinPoint jp){
        
        if(!securityService.verifierAccess(jp.toShortString().substring(jp.toShortString().indexOf(".")+1))){
            System.out.format("***LOG[%s] Une SecurityException a été lancée dans %s\n", new Date(), jp);
            throw new SecurityException();
        }
        else {
            System.out.println("Pas de SecurityException à lancer dans : "+jp.toShortString());
        }
    }
}
