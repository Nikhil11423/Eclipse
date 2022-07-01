package com.xworkz.fw.bean.springboot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fw.bean.TentBean;
import com.xworkz.fw.bean.VillageBean;


public class TentBoot {

	public static void main(String[] args) {
		
		String var= "resources\\spring1.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(var);
		
		System.out.println("=======================================================");

		
		TentBean bean1=context.getBean("tentBean1",TentBean.class);
		System.out.println(bean1.getName());
		
		System.out.println("=======================================================");

		TentBean bean2=context.getBean("tentBean2",TentBean.class);
		System.out.println(bean2.getPrice());
		
		System.out.println("=======================================================");

		TentBean bean8=context.getBean("tentBean3",TentBean.class);
		System.out.println(bean8.getName());
		System.out.println(bean8.getPrice());
		
		System.out.println("=======================================================");

		
		TentBean bean3=context.getBean("tentBean4",TentBean.class);
		System.out.println(bean3.getName());
		System.out.println(bean3.getColor());

		System.out.println("=======================================================");

		TentBean bean4=context.getBean("tentBean5",TentBean.class);
		System.out.println(bean4.getPrice());
		System.out.println(bean4.getColor());
		
		System.out.println("=======================================================");

		TentBean bean5 =context.getBean("tentBean6",TentBean.class);
		System.out.println(bean5.getColor());
		System.out.println(bean5.getPrice());
		System.out.println(bean5.getName());
		
		
		System.out.println("=======================================================");
		TentBean bean6 =context.getBean("tentBean7",TentBean.class);
		System.out.println(bean6.getColor());
		System.out.println(bean6.getName());
		System.out.println(bean6.getPrice());
		
		System.out.println("=======================================================");
		TentBean bean7 =context.getBean("tentBean8",TentBean.class);
		System.out.println(bean7.getPrice());
		System.out.println(bean7.getColor());
		System.out.println(bean7.getName());
		System.out.println("=======================================================");

		
		System.out.println("=======================================================");

		
		System.out.println("=======================================================");
		VillageBean village = context.getBean("villageBean1", VillageBean.class);
		System.out.println(village);

		System.out.println("=======================================================");
		VillageBean village1 = context.getBean("villageBean2", VillageBean.class);
		System.out.println(village1.getName());
		System.out.println(village1.getNoOfHouse());

		System.out.println("=======================================================");
		VillageBean village2 = context.getBean("villageBean3", VillageBean.class);
		System.out.println(village2.getName());
		System.out.println(village2.getNoOfHouse());
		System.out.println(village2.getTotalPeople());

		System.out.println("=======================================================");
		VillageBean village3 = context.getBean("villageBean4", VillageBean.class);
		System.out.println(village3.getName());
		System.out.println(village3.getNoOfHouse());
		System.out.println(village3.getTotalPeople());
		System.out.println(village3.getTalukOfVillage());

		System.out.println("=======================================================");
		VillageBean village4 = context.getBean("villageBean5", VillageBean.class);
		System.out.println(village4.getName());
		System.out.println(village4.getNoOfHouse());
		System.out.println(village4.getTotalPeople());
		System.out.println(village4.getTalukOfVillage());
		System.out.println(village4.getDistricOfVillage());	    

	}

}
