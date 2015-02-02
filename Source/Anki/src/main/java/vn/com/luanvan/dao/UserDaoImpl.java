package vn.com.luanvan.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import vn.com.luanvan.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
    private JavaMailSender mailSender;
	
	    
	@SuppressWarnings("unchecked")
	@Transactional
	public boolean findByUserName(String username) {

		List<User> users = new ArrayList<User>();

		/*users = sessionFactory.getCurrentSession()
				.createQuery("from User where email=?")
				.setParameter(0, username).list();*/
		Query query = sessionFactory.getCurrentSession().createQuery("FROM User WHERE email =: email");
		User user = null;
		user = (User) query.uniqueResult();
		if (users.size() > 0) {
			return true;
		} else {
			return false;
		}

	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public User findUserbyUserName(String email) {
		return (User) sessionFactory.getCurrentSession()
				.get(User.class, email);
	}
	

	/**
	 * @author lonel_000
	 */
	@Transactional
	public void save(User user) {
		sessionFactory.getCurrentSession().update(user);
	}

	/**
	 * @author lonel_000
	 */
	@Transactional
	public void add(User user) {
		sessionFactory.getCurrentSession().save(user);
	}
	
	
	@Transactional
	public void sendMail(User user){
		SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(user.getEmail());
        email.setSubject("Đăng ký tài khoản");
        email.setText("Xin chào bạn đã đăng ký thành công tài khoản \n\n"
        		+ "Tài khoản: "+user.getEmail() +"\n\n"
        		+"Mật khẩu: "+user.getPassword()+ "\n"
        		);
        // sends the e-mail
        mailSender.send(email);
	}
	
	@Transactional
	public boolean checkOldPassword (User user, String oldPass){
		if(oldPass.equals(user.getPassword())){
			return true;
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	@Transactional
	public boolean checkEmail(String email) {
		List<User> users = new ArrayList<User>();
		users = sessionFactory.getCurrentSession().createQuery("from User where email=?").setParameter(0, email).list();
		if (users.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	
	
	

	
}