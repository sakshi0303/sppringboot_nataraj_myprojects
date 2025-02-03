package com.nt.sbean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("tinfo")
@Data
public class TestRateCard {
	
	@Value("${test.xray}")
	private Double xrayRate;

	@Value("${test.2d}")
	private Double TwoDecoRate;
	
	@Value("${test.3d}")
	private Double ThreeDecoRate;
	
	@Value("${test.mri}")
	private Double mRIRate;

	//To-String
	@Override
	public String toString() {
		return "TestRateCard [xrayRate=" + xrayRate + ", TwoDecoRate=" + TwoDecoRate + ", ThreeDecoRate="
				+ ThreeDecoRate + ", mRIRate=" + mRIRate +  "]";
	}
	

}
