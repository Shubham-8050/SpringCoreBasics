package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		//locate and hold the spring bean configuration files
		FileSystemResource fsr = new FileSystemResource("src/com/nt/config/applicationContext.xml");
		//create XmlBeanFactory container by passing spring bean configuration file
		XmlBeanFactory factory = new XmlBeanFactory(fsr);
		//create target class object
		Object obj = factory.getBean("wmg");
		//Typecast to its original Type
		WishMessageGenerator gen = (WishMessageGenerator)obj;
		//call the method
		String message = gen.getWishGenerator("Shubham");
		System.out.println(message);
	}
}
