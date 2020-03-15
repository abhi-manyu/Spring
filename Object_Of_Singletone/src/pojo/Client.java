package pojo;

public class Client
{
	public static void main(String[] args)
	{
       Singletone_class st1= Singletone_class.getObject();
       st1.display();
       Singletone_class st2= Singletone_class.getObject();
       System.out.println(st1.equals(st2));
	}

}
