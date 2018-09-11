import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import polymorphism.TV;

public class TVUser {
    public static void main(String[] args) {



        AbstractApplicationContext factory
                = new GenericXmlApplicationContext("applicationContext.xml");

        TV tv = (TV) factory.getBean("stv");
        tv.VolumeDown();
        tv.PowerOff();

        tv = (TV) factory.getBean("ltv");
        tv.VolumeDown();
        tv.PowerOff();


        factory.close();


    }
}
