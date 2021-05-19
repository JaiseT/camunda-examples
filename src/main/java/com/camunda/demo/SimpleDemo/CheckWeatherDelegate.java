package com.camunda.demo.SimpleDemo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import camundajar.impl.scala.util.Random;

public class CheckWeatherDelegate implements JavaDelegate {

	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		Random rando = new Random();

		execution.setVariable("name", "Jaise");
		execution.setVariable("weatherOk", rando.nextBoolean());
		
	}

}
