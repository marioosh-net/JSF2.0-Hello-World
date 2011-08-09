package com.mkyong.common;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.mkyong.common.utils.UndefinedUtils;

import java.io.Serializable;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Date;

@ManagedBean
@SessionScoped
public class TokenBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String token;
	
	public String getHash() {
		token = UndefinedUtils.nextRandomString();
		return token;
	}
	
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}