package drivers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojos.Student;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext ap=
				new ClassPathXmlApplicationContext("xmls/details.spring.xml");
		Student st1=(Student)ap.getBean("stu1");
		st1.display();
	}

}
