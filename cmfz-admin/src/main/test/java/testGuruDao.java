import com.baizhi.cmfz.dao.GuruDao;
import com.baizhi.cmfz.entity.Guru;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Author fyx
 * @Time in 8:53 2018/7/9
 * @Despriction
 */
public class testGuruDao {

    public static void main(String[] args) {
        ApplicationContext act = new ClassPathXmlApplicationContext("/applicationContext.xml");
        GuruDao guruDao = (GuruDao)act.getBean("guruDao");
        List<Guru> gurus = guruDao.selectAnyGuru("religious_name", "仁", 0, 3);
        for (Guru guru: gurus) {
            System.out.println(guru);
        }
    }
}
