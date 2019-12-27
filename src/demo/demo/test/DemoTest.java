package demo.demo.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.demo.bean.Radio;

public class DemoTest {

	public static void main(String[] args) {
		BeanFactory beanfactory = new XmlBeanFactory(new ClassPathResource("application-context.xml"));
		Radio rad = beanfactory.getBean("radio", Radio.class);
		System.out.println(rad);
	}

}
