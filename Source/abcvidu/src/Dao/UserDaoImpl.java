package Dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import Model.User;
import Util.HibernateUtil;

public class UserDaoImpl implements UserDao{
	private SessionFactory sf;
	
	public UserDaoImpl(SessionFactory sf) {
		this.sf = sf;
	}
	
	@Override
	public User getUserById(String user_id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		User user = new User();
		try {
			user = (User) session.get(User.class, user_id);
		} catch(HibernateException e) {
			System.out.println("Loi hibernate "+e.getMessage());
		}
		if(user!=null) {
			System.out.println("Dang nhap thanh cong");
		} else {
			System.out.println("Dang nhap tht bai");
		}
		
		session.close();
		return user;
	}

}
