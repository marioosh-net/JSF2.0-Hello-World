package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.Date;

@ManagedBean
@SessionScoped
public class HelloBean implements Serializable {

	private Logger log = Logger.getLogger(getClass());
	
	@Autowired
	private SpringBean springBean;
	
	private static final long serialVersionUID = 1L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Date getTime() {
		log.debug(springBean);
		return new Date();
	}
	
}