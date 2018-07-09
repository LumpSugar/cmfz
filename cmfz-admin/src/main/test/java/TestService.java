import com.baizhi.cmfz.dao.MenuDao;
import com.baizhi.cmfz.entity.Menu;
import com.baizhi.cmfz.service.MenuService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @Author fyx
 * @Time in 15:03 2018/7/5
 * @Despriction
 */
public class TestService {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        MenuService menuService = (MenuService) ctx.getBean("menuServiceImpl");

        List<Menu> menus = menuService.queryMenu();

        for (Menu menu: menus) {
            System.out.println("a"+menu+"b");
        }

    }
}
