package com_cg_spring_core_demo.com.cg.spring.core.labs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com_cg_spring_core_demo.com.cg.spring.core.labs.model.Employee;
import com_cg_spring_core_demo.com.cg.spring.core.labs.model.SBU;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Problem statement-1.1");
        Employee emp=ctx.getBean("employee",Employee.class);  
    	emp.displayEmployeeDetails();
    	
    	 System.out.println("\nProblem statement-1.2");
        Employee emp1=ctx.getBean("employee1",Employee.class);  
    	System.out.println(emp1.toString());
    	
    	SBU sbu=ctx.getBean("sbu",SBU.class);
    	sbu.display();
    	
    	
//    	SBU sbu=ctx.getBean("sbu",SBU.class);  
//     	System.out.println(sbu.toString());
    	((AbstractApplicationContext)ctx).close();
    	System.out.println("end");
    }
}
