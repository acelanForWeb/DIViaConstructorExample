package tw.acelan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import tw.acelan.output.OutputHelper;

public class App {
	public static void main(String[] args){
		//���ospringConfig.xml�]�w��context���e
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		//�z�Lspring container���oJava Bean
		OutputHelper outputHelper = (OutputHelper)context.getBean("OutputHelper");
		
		//����generateOutput��k
		outputHelper.generateOutput();
	}
}
