package com.mikadosolutions.training.spring.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class LaunchTraining
{
	public static void main(String args[]) throws Exception
	{
		ApplicationContext context = 
			new FileSystemXmlApplicationContext("TrainingConfig.xml");

		Workshop trainingWorkshop = (Workshop)context.getBean("trainingWorkshop");
		trainingWorkshop.conductWorkshop();
	}
};