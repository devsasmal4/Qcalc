package com.crio.qcalc;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(QcalcApplication.class, args);
		System.out.println("Starting QCalc..");
		//StandardCalculator calc = new StandardCalculator();
		//ScientificCalculator calc = new ScientificCalculator();
		//calc.add(Double.MAX_VALUE, Double.MAX_VALUE);
		//calc.subtract(100, 50);
		//System.out.println(calc.getResult());
		//calc.printResult();
		LogicCalculator calc = new LogicCalculator();
		calc.AND(8, 6);
		calc.printResult();
	}

}
