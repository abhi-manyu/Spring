package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.College;

public class Driver {

	public static void main(String[] args) {
      ApplicationContext ap=
    	new ClassPathXmlApplicationContext("xmls/colstudent.spring.xml");
      College cl1=(College)ap.getBean("col1");
      cl1.display();
      cl1.studentDetails();
	}

}
