package org.transaction.example.dao;

import java.util.List;

import org.transaction.example.beans.User;

//@Service
public class UserDaoImpl implements UserDao
{

	//@Autowired
	//private SessionFactory sf; 
	
	public void insertUser(User user)
	{
		//sf.getCurrentSession().save(user);
	}

	public User getUserById(int id)
	{
		
		//return (User)sf.getCurrentSession().get(User.class, id);
		return null;
	}

	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<User> getAllUsers()
	{
		//Criteria cr=sf.getCurrentSession().createCriteria(User.class);
		//return cr.list();
		return null;
	}

	public User getUserByName(String username)
	{
		/*Query query=sf.getCurrentSession().
				createQuery("from User where username= : username");
		query.setParameter("username",username);
		return (User) query.uniqueResult();*/
		return null;
	}

}
