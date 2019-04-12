package org.mvc.hibernate.springService;

import java.util.List;

import org.mvc.hibernate.beans.Person;
import org.mvc.hibernate.springDAO.PersonDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService
{

	PersonDAO perDao;
	
	public void setPerDao(PersonDAO perDao) {
		this.perDao = perDao;
	}
	
	@Transactional
	public void addPerson(Person p)
	{
        perDao.addPerson(p);
	}

	@Transactional
	public void updateperson(Person p)
	{
        perDao.updatePerson(p);
	}

	@Transactional
	public List<Person> listAllPersons()
	{
		return perDao.listAllPersons();
	}

	@Transactional
	public Person getPersonById(int id) 
	{
		return perDao.getPersonById(id);
	}

	@Transactional
	public void removePerson(int id)
	{
         perDao.removePerson(id);
	}

}
