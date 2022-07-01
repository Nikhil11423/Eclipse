package com.xworkz.fw.bean.springboot;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fw.bean.BrainBean;
import com.xworkz.fw.bean.ColonBean;
import com.xworkz.fw.bean.EarBean;
import com.xworkz.fw.bean.EyesBean;
import com.xworkz.fw.bean.FaceBean;
import com.xworkz.fw.bean.FingerBean;
import com.xworkz.fw.bean.HairBean;
import com.xworkz.fw.bean.HandBean;
import com.xworkz.fw.bean.HeartBean;
import com.xworkz.fw.bean.KidneyBean;
import com.xworkz.fw.bean.LegsBean;
import com.xworkz.fw.bean.LiverBean;
import com.xworkz.fw.bean.LungsBean;
import com.xworkz.fw.bean.MouthBean;
import com.xworkz.fw.bean.NeckBean;
import com.xworkz.fw.bean.NoseBean;
import com.xworkz.fw.bean.PancreasBean;
import com.xworkz.fw.bean.StomachBean;
import com.xworkz.fw.bean.TeethBean;
import com.xworkz.fw.bean.TentBean;
import com.xworkz.fw.bean.TongueBean;

public class SpringBoot {

	public static void main(String[] args) {
		String str = "resources\\spring.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(str);
		
		System.err.println("*******************************");

		HeartBean bean = context.getBean(HeartBean.class);
		System.out.println(bean);
		bean.pump();
		System.err.println("*******************************");

		BrainBean bean1 = context.getBean(BrainBean.class);
		System.out.println(bean1);
		bean1.Storage();
		System.err.println("*******************************");
		
		KidneyBean bean2 = context.getBean(KidneyBean.class);
		System.out.println(bean2);
		bean2.purify();
		System.err.println("*******************************");
		
		LungsBean bean3 = context.getBean(LungsBean.class);
		System.out.println(bean3);
		bean3.breathinh();
		System.err.println("*******************************");

		TongueBean bean4 = context.getBean(TongueBean.class);
		System.out.println(bean4);
		bean4.taste();
		System.err.println("*******************************");
		
		ColonBean bean5 = context.getBean(ColonBean.class);
		System.out.println(bean5);
		bean5.tract();
		System.err.println("*******************************");

		EarBean bean6 = context.getBean(EarBean.class);
		System.out.println(bean6);
		bean6.hearing();
		System.err.println("*******************************");

		EyesBean bean7 = context.getBean(EyesBean.class);
		System.out.println(bean7);
		bean7.see();
		System.err.println("*******************************");

		FaceBean bean8 = context.getBean(FaceBean.class);
		System.out.println(bean8);
		bean8.communicating();
		System.err.println("*******************************");

		HairBean bean9 = context.getBean(HairBean.class);
		System.out.println(bean9);
		bean9.protecting();
		System.err.println("*******************************");

		HandBean bean10 = context.getBean(HandBean.class);
		System.out.println(bean10);
		bean10.gripping();
		System.err.println("*******************************");

		LegsBean bean11 = context.getBean(LegsBean.class);
		System.out.println(bean11);
		bean11.walk();
		System.err.println("*******************************");

		LiverBean bean12 = context.getBean(LiverBean.class);
		System.out.println(bean12);
		bean12.enzymeActivation();
		System.err.println("*******************************");

		MouthBean bean13 = context.getBean(MouthBean.class);
		System.out.println(bean13);
		bean13.talk();
		System.err.println("*******************************");

		NeckBean bean14 = context.getBean(NeckBean.class);
		System.out.println(bean14);
		bean14.spporting();
		System.err.println("*******************************");
		
		NoseBean bean15 = context.getBean(NoseBean.class);
		System.out.println(bean15);
		bean15.smell();
		System.err.println("*******************************");

		PancreasBean bean16 = context.getBean(PancreasBean.class);
		System.out.println(bean16);
		bean16.produce();
		System.err.println("*******************************");

		StomachBean bean17 = context.getBean(StomachBean.class);
		System.out.println(bean17);
		bean17.digested();
		System.err.println("*******************************");

		TeethBean bean18 = context.getBean(TeethBean.class);
		System.out.println(bean18);
		bean18.chewing();
		System.err.println("*******************************");

		FingerBean bean19 = context.getBean(FingerBean.class);
		System.out.println(bean19);
		bean19.grip();
		System.err.println("*******************************");
		
		

	}

}
