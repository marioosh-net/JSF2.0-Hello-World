package com.mkyong.common;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@ViewScoped
public class HelloBean implements Serializable {

	transient private Logger log = Logger.getLogger(getClass());

	@Autowired
	private SpringBean springBean;
	
	@ManagedProperty(value="#{tokenBean}")
	private TokenBean tokenBean;
	
	public void setTokenBean(TokenBean tokenBean) {
		this.tokenBean = tokenBean;
	}
	
	@PostConstruct
	public void t() {
		token = tokenBean.getHash(); 
	}
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String token;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public Date getTime() {
		log.debug(springBean);
		return new Date();
	}
	
	public String voidek() {
		log.debug("NAME: "+name);
		log.debug("TOKEN: "+token);
 
		if(tokenBean.getToken().equals(token)) {
			log.debug("SEND");
		} else {
			log.error("INVALID TOKEN, AVOID SEND");
		}
		t();
		return null;
	}
	
}