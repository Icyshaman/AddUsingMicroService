package com.example.AddUsingMicroService.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("using-ms-add")
public class SumProvider {
	private int firstNumber;
	private int secondNumber;

	public SumProvider() {
		super();
	}
	
	public int getSum() {
		return this.firstNumber + this.secondNumber;
	}

	public SumProvider(int firstNumber, int secondNumber) {
		super();
		this.firstNumber = firstNumber;
		this.secondNumber = secondNumber;
	}

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

}
