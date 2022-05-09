package com.springapps.springcore.interfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sport {

	@Override
	public String play() {
	
		return "playing cricket";
	}
	
	

}
