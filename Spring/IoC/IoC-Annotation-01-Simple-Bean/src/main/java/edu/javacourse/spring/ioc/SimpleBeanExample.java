package edu.javacourse.spring.ioc;

import edu.javacourse.spring.ioc.beans.BusinessLogic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Artem Pronchakov | email/xmpp: artem.pronchakov@calisto.email
 */
@Configuration
@ComponentScan
public class SimpleBeanExample {

    private static Logger log = LoggerFactory.getLogger(SimpleBeanExample.class);

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleBeanExample.class);

        log.debug("\n\n\n");

        final BusinessLogic bl = context.getBean(BusinessLogic.class);
        log.debug("Is DAO null: {}", bl.getDao() == null);
    }

}
