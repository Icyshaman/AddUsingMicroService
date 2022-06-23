package com.example.AddUsingMicroService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.AddUsingMicroService.Bean.SumProvider;

@RestController
public class AdditionController {
	@Autowired
	private SumProvider sumProvider;
	
	@GetMapping("/result")
	public int printResult() {
		return new SumProvider(sumProvider.getFirstNumber(), sumProvider.getSecondNumber()).getSum();
	}

}
