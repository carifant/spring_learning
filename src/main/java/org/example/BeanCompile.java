package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCompile {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestBean testBean = context.getBean("testBean", TestBean.class);
        System.out.println(testBean);

        TestBean testBean1 = context.getBean("testBean2", TestBean.class);
        System.out.println(testBean1);
        context.close();
    }
}
