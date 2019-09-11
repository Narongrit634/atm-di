package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
        ATMSimulator AtmSimulator = context.getBean("ATMSimulator", ATMSimulator.class);
        AtmSimulator.run();
    }
}
