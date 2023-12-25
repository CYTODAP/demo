package com.example.service;
import org.springframework.stereotype.Service;

import com.example.entity.NumberData;

@Service
public class StarterServiceImpl implements StarterService{
	@Override
	public String sum(String number1,String number2 ) {
		return String.valueOf(Float.parseFloat(number1)+Float.parseFloat(number2));
	}
	@Override
	public String mul(NumberData numberData) {
//		System.out.println(numberData.getNumber1());
		return String.valueOf(Float.parseFloat(numberData.getNumber1())*Float.parseFloat(numberData.getNumber2())*Float.parseFloat(numberData.getNumber3()));
	}
}
