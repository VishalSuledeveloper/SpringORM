package net.spring.com.SpringORMA5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.spring.com.SpringORMA5.dao.StudentDao;
import net.spring.com.SpringORMA5.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ct = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentdao = ct.getBean("studentdao", StudentDao.class);
//        Student st = new Student(123, "Pranil", "A");
//        int result = studentdao.insert(st);
//        System.out.println("Record inserted with id " + result);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean go=true;
        while(true)
        {
        	System.out.println("Press 1 -Insert");
        	System.out.println("Press 2 - View a Record");
        	System.out.println("Press 3 - View All Record");
        	System.out.println("Press 4 - Delete a Record");
        	System.out.println("Press 5 - Update a Record");
        	
        	
        	try
        	{
        		Integer ch =Integer.parseInt(br.readLine());
        		
        		switch (ch) {
        		case 1:
        			System.out.println("Enter Student Id -");
        			Integer uid=Integer.parseInt(br.readLine());
        			
        			System.out.println("Enter Student Name -");
        			String uname=br.readLine();
        			
        			System.out.println("Enter Student class -");
        			String uclass=br.readLine();        			
        	
        			
        			Student insertst =new Student(uid,uname,uclass);
        			studentdao.insert(insertst);
        			break;
        			
        		case 2:
        			System.out.println("Enter Student Id -");
        			Integer userid=Integer.parseInt(br.readLine());
        			Student gst = studentdao.getstudent(userid);
        			
        			System.out.println(".......................");
        			
        			System.out.println("Student name is: "+gst.getStudentName());
        			System.out.println("Student class is: "+gst.getStudentId());
        			System.out.println("..................");
        			
        			
        			
        			break;
        		case 3:
        			List<Student>getallstudent =studentdao.getallstudent();
        			for (Student rec:getallstudent)
        			{
        				System.out.println("Id is- "+rec.getStudentId());
        				System.out.println("Name is- "+rec.getStudentName());
        				System.out.println("Class is -"+rec.getStudentCity());
        				System.out.println("................ ");
        				
        			}
        			break;
        		case 4:
        			break;
        		case 5:
        			//update
        			
        			
        			break;
        		default:
        			go=false;
        			break;
        		
        		}
        	}
        		catch(Exception e)
        		{
        			System.out.println("Enter Correct Input");
        			System.out.println("e.getMessage");
        		}
        	}
        
    }
    
}
