

import com.baizhi.cmfz.dao.UserDao;
import com.baizhi.cmfz.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        UserDao userDao = (UserDao) ctx.getBean("userDao");

        User user = userDao.selectByPrimaryKey("LumpSugar");

        System.out.println(user);

    }

}
