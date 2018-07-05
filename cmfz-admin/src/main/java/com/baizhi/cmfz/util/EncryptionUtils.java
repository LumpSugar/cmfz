package com.baizhi.cmfz.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptionUtils {
	
	public static String encryption(String str) throws NoSuchAlgorithmException{
		MessageDigest md = MessageDigest.getInstance("MD5");
		
		byte[] code = md.digest(str.getBytes());
		
		StringBuilder builder = new StringBuilder();
		
		for(byte b : code){

			int c = b & 0XFF;
			
			if(c < 16){
				builder.append("0");
			} 
			builder.append(Integer.toHexString(c));
		}
		
		return builder.toString();
		
	}
	
	public static String getRandomSalt(int n){
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		String str2 = "";
		int len = str1.length() - 1;
		double r;
		for (int i = 0; i < n; i++) {
			r = (Math.random()) * len;
			str2 = str2 + str1.charAt((int) r);
		}
		return str2;
	}
	
}
