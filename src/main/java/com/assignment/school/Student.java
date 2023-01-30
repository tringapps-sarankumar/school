package com.assignment.school;
import java.util.Scanner;
import java.util.logging.Logger;
public class Student 
{
    public static void main(String args[]) {
    	Logger log =  Logger.getLogger("CreditCard");


        Scanner sc = new Scanner(System.in);
        try {
        log.info("Enter name:");
        String name =sc.nextLine();

        log.info("Enter grade:");
        char grade=sc.next().charAt(0);
        
        log.info("Enter GPA:");
        float gpa=sc.nextFloat();
        
        StudentLogic obj = new StudentLogic(name, grade, gpa);
        log.info(obj.profile());
        
        log.info("Do You Want To Update GPA: yes/no");
        String update_gpa= sc.next();
        
        if(update_gpa.equalsIgnoreCase("yes")){
            log.info("Enter New GPA:");
            Float new_gpa =sc.nextFloat();
            obj.update(new_gpa);
            log.info(obj.profile());}
        }catch (Exception e) {
        	log.info("There Was an Exception :"+e);
        }
        finally {
        	sc.close();
        }
    }
}