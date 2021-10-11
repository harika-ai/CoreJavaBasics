package com.telusko.springframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component//non qualified and de capitalized
public class Samsung {

	@Autowired
	@Qualifier("snapdragan")//used to specify which device we want to use ---when we having more than one devices implementating same interface
	MobileProcessor mobileProcessor;

	public MobileProcessor getMobileProcessor() {
		return mobileProcessor;
	}

	public void setMobileProcessor(MobileProcessor mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}

	public void config() {
		System.out.println("Octa Core,4 gb Ram, 12Mp camera");
		mobileProcessor.processor();
	}

}
