package org.mvc.hibernate.springDAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mvc.hibernate.beans.Person;

public class PersonDAOImpl implements PersonDAO
{

	private SessionFactory factory;
	
	 public void setSessionFactory(SessionFactory sessionFactory) {
		this.factory = sessionFactory;
	}
	public void addPerson(Person p)
	{
        Session s=factory.openSession();
        s.persist(p);
        System.out.println("person added sucessfully as :"+p);
	}

	public void updatePerson(Person p)
	{
         Session s=factory.openSession();
         s.update(p);
	}

	@SuppressWarnings("unchecked")
	public List<Person> listAllPersons()
	{
		Session s=factory.openSession();
		List<Person> personList=
				s.createQuery("from Person").list();
		for(Person p:personList)
		{
			System.out.println(p);
		}
		return personList;
	}

	public Person getPersonById(int id)
	{
		Session s=factory.openSession();
		Person p=(Person)s.load(Person.class, new Integer(id));
		System.out.println("person loaded sucessfully as : "+p);
		return p;
	}

	public void removePerson(int id)
	{
        Session s=factory.openSession();
        Person p=(Person) s.load(Person.class,new Integer(id));
        if(p!=null)
        {
        	s.delete(p);
        }
        System.out.println("deleted successfully");
	}

}
