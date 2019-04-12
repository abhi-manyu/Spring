package org.mvc.hibernate.springService;

import java.util.List;

import org.mvc.hibernate.beans.Person;

public interface PersonService
{
   public void addPerson(Person p);
   public void updateperson(Person p);
   public List<Person> listAllPersons();
   public Person getPersonById(int id);
   public void removePerson(int id);
}
