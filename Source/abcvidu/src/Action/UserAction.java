package Action;

import javax.servlet.ServletContext;

import org.apache.struts2.util.ServletContextAware;
import org.hibernate.SessionFactory;

import Dao.UserDao;
import Dao.UserDaoImpl;
import Model.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

public class UserAction implements Action, ModelDriven<User>, ServletContextAware{
	private User user;
	private ServletContext sct;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String execute() {
		SessionFactory sf = (SessionFactory) sct.getAttribute("SessionFactory");
		UserDao userDao = new UserDaoImpl(sf);
		User userdb = userDao.getUserById(user.getUser_id());
		if (userdb == null) return ERROR;
		else {
			user.setEmail(userdb.getEmail());
			user.setName(userdb.getName());
			return SUCCESS;
		}
	}

	@Override
	public User getModel() {
		user = new User();
		return user;
	}

	@Override
	public void setServletContext(ServletContext sct) {
		this.sct = sct;
	}

}
