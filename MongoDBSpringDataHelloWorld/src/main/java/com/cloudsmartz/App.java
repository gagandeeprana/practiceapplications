package com.cloudsmartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cloudsmartz.config.AppConfig;
import com.cloudsmartz.hosting.bo.HostingBo;

public class App {

	public static void main(String[] args) {

		try {
			ApplicationContext context = new AnnotationConfigApplicationContext(
					AppConfig.class);
			HostingBo hostingBo = (HostingBo) context.getBean("hostingBoImpl");
			// HostingBo hostingBo = (HostingBo) context.getBean(App.class);

			hostingBo.save("aaaaaaaa");
			hostingBo.save("bbbbbbb");
			hostingBo.save("cccccccccc");
		} catch (Exception e) {
			System.out.println("EXP: " + e);
			System.out.println("Exception in Main: " + e.getMessage());
		}
	}
}
