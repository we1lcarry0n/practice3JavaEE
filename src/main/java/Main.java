import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
        GameMaster gm = (GameMaster) context.getBean("Roger");
        gm.rollTheDice();
    }

}
