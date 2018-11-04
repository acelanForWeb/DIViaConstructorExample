package tw.acelan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.acelan.output.OutputHelper;

public class App {
	public static void main(String[] args){
		//取得springConfig.xml設定檔context內容
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//透過spring container取得Java Bean
		OutputHelper outputHelper = (OutputHelper)context.getBean("OutputHelper");
		
		//執行generateOutput方法
		outputHelper.generateOutput();
	}
}
