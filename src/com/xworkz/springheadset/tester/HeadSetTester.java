package com.xworkz.springheadset.tester;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.springheadset.HeadSet;

public class HeadSetTester {

	public static void main(String[] args) {
		String file = "spring.xml";

		ApplicationContext application = new ClassPathXmlApplicationContext(file);

		HeadSet headSet = application.getBean("head1",HeadSet.class);
		System.out.println("The brand is:"+headSet.getBrand());
		System.out.println("The color of headset is :"+headSet.getColor());

		HeadSet headSet2 = application.getBean("head2",HeadSet.class);
		System.out.println("The warranty for this headset is:"+ headSet2.getWarranty());
		System.out.println("The cost is:"+headSet2.getCost());
		
		HeadSet headSet3 = application.getBean("head3", HeadSet.class);
		System.out.println(headSet3.getBrand());
		System.out.println(headSet3.getWarranty());
		System.out.println(headSet3.getCost());
		
		HeadSet headSet4=application.getBean("head4",HeadSet.class);
		System.out.println(headSet4.getColor());
		
		HeadSet headSet5=application.getBean("head5",HeadSet.class);
		System.out.println(headSet5.getCost());
		
		HeadSet headSet6=application.getBean("head6",HeadSet.class);
		System.out.println(headSet6.getCost());
		System.out.println(headSet6.getColor());
		
		HeadSet headSet7=application.getBean("head7",HeadSet.class);
		System.out.println(headSet7.getBrand());
		System.out.println(headSet7.getUseful());
		
		HeadSet headSet8=application.getBean("head8",HeadSet.class);
		System.out.println("is headset useful?"+headSet8.getUseful());
		

	}

}
