package polymorphism3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

// ������ = ��� + Overriding + ����ȯ
public class TVUser {
	public static void main(String[] args) {
		// 1. Spring IoC �����̳ʸ� ����(����)�Ѵ�.
//		BeanFactory factory = 
//			new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		ApplicationContext factory = 
			new ClassPathXmlApplicationContext("applicationContext.xml");
	
		// 2. Spring IoC �����̳ʷκ��� �ʿ��� ��ü�� �˻�(Lookup)�Ѵ�.
		TV tv = (TV)factory.getBean("tv");
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
