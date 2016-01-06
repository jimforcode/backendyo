package com.springapp.mvc;

import com.springapp.mvc.manager.HelloI;
import com.springapp.mvc.manager.HelloImpExtra;
import com.springapp.mvc.manager.HelloImpl;
import com.springapp.mvc.service.MyServiceImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by zj on 16/1/6.
 */
@Configuration
public class AppConfig2 {
    @Bean
    public HelloI ddd() {
        return new HelloImpExtra();
    }

    @Bean
    public MyService myService123() {
        return new MyServiceImpl2();
    }
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig2.class);
        MyService myService = ctx.getBean(MyService.class);
        myService.doWork();
    }
//
//    As mentioned above, AnnotationConfigApplicationContext is not limited to working only with @Configuration classes. Any @Component or JSR-330 annotated class may be supplied as input to the constructor. For example:
//
//    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyServiceImpl.class, Dependency1.class, Dependency2.class);
//        MyService myService = ctx.getBean(MyService.class);
//        myService.doStuff();
//    }
//    The above assumes that MyServiceImpl, Dependency1 and Dependency2 use Spring dependency injection annotations such as @Autowired.
//Building the container programmatically using register(Class<?>…​)
//
//    An AnnotationConfigApplicationContext may be instantiated using a no-arg constructor and then configured using the register() method. This approach is particularly useful when programmatically building an AnnotationConfigApplicationContext.
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.register(AppConfig.class, OtherConfig.class);
//        ctx.register(AdditionalConfig.class);
//        ctx.refresh();
//        MyService myService = ctx.getBean(MyService.class);
//        myService.doStuff();
//    }
//    Enabling component scanning with scan(String…​)
//
//    To enable component scanning, just annotate your @Configuration class as follows:
//
//    @Configuration
//    @ComponentScan(basePackages = "com.acme")
//    public class AppConfig  {
//        ...
//    }
//Experienced Spring users will be familiar with the XML declaration equivalent from Spring’s context: namespace
//            <beans>
//    <context:component-scan base-package="com.acme"/>
//    </beans>
//    In the example above, the com.acme package will be scanned, looking for any @Component-annotated classes, and those classes will be registered as Spring bean definitions within the container. AnnotationConfigApplicationContext exposes the scan(String…​) method to allow for the same component-scanning functionality:
//
//    public static void main(String[] args) {
//        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
//        ctx.scan("com.acme");
//        ctx.refresh();
//        MyService myService = ctx.getBean(MyService.class);
//    }
//Remember that @Configuration classes are meta-annotated with @Component, so they are candidates for component-scanning! In the example above, assuming that AppConfig is declared within the com.acme package (or any package underneath), it will be picked up during the call to scan(), and upon refresh() all its @Bean methods will be processed and registered as bean definitions within the container.



}
