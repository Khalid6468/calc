package com.crio.qcalc;

// // import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication
public class QcalcApplication {

	public static void main(String[] args) {
		// SpringApplication.run(QcalcApplication.class, args);
		StandardCalculator sc = new StandardCalculator();
		sc.add(Double.MAX_VALUE, 2.0);
		System.out.println(sc.getResult());
		if(Double.MAX_VALUE == sc.getResult()) {
			System.out.println("BOUNDARY");
		}
	}

}
