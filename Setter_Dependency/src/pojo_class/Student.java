package pojo_class;

public class Student
{
    private int id;
    private String name;
    private String ph_no;
    private String mail;
    
    public void setId(int id) {
		this.id = id;
	}
    public void setName(String name) {
		this.name = name;
	}
    public void setPh_no(String ph_no) {
		this.ph_no = ph_no;
	}
    public void setMail(String mail) {
		this.mail = mail;
	}
    public void studentDataDisplay()
    {
    	System.out.println
    	("s_id \t\t s_name \t\t s_ph_no \t\t s_mail \n ----------------------------------"
    			+"--------------------------------------");
    	System.out.println(id+"\t\t"+name+"\t\t"+ph_no+"\t\t"+mail);
    }
}
