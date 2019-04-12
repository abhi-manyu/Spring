package org.mvc.hibernate.springDAO;

import java.util.List;

import org.mvc.hibernate.beans.Person;

public interface PersonDAO
{
    public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listAllPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}
