package com.mkyong.common.utils;

import java.math.BigInteger;
import java.security.SecureRandom;

public class UndefinedUtils {
	private static SecureRandom randomString = new SecureRandom();

	public static String nextRandomString() {
		return new BigInteger(130, randomString).toString(32);
	}

}
