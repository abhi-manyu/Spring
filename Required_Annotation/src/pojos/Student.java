package pojos;

import org.springframework.beans.factory.annotation.Required;

public class Student {
    private int roll_no;
    private String name;
    private String phno;
    private String address;
    private double marks;
    
    @Required
    public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}
    @Required
    public void setName(String name) {
		this.name = name;
	}
    public void setAddress(String address) {
		this.address = address;
	}
    public void setPhno(String phno) {
		this.phno = phno;
	}
    @Required
    public void setMarks(double marks) {
		this.marks = marks;
	}
    
    public void display()
    {
    	System.out.println
    	("student details \n------------------------------------------");
    	System.out.println(roll_no+"\t"+name+"\t"+phno+"\t"+address+"\t"+marks);
    }
}
