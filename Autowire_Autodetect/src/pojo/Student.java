package pojo;

public class Student {
private String name;
private Books book;

public Student() {
	System.out.println("defalt constructor");
}


public Student(String name, Books book)
{
	super();
	System.out.println("parameterize constructor");
	this.name = name;
	this.book = book;
}


/*public void setName(String name) {
	this.name = name;
}
public void setBook(Books book) {
	this.book = book;
}*/

public void display()
{
	System.out.println("name : "+name);
	System.out.println("book : "+book.getName());
}
}
