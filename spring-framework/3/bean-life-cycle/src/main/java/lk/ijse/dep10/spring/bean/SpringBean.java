package lk.ijse.dep10.spring.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBean implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public SpringBean() {
        System.out.println("Hey! I am SpringBean Constructor");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name aware : " + s);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory aware : " + beanFactory);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context aware : " + applicationContext);

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing the bean");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposal the bean");
    }

    @PostConstruct
    public void initialize(){
        System.out.println("Initializing bean with @PostConstruct");
    }
    @PreDestroy
    public void destroyed(){
        System.out.println("Disposable bean with @PreDestroy");
    }
}
