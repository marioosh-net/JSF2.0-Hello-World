package com.mkyong.common;

import org.springframework.stereotype.Component;

@Component
public class SpringBean {
	private String name = "I'm Spring Bean";

	public String getName() {
		return name;
	}
}
