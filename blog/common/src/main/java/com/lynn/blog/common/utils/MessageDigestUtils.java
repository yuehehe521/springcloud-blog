package com.lynn.blog.common.utils;

import java.security.MessageDigest;

/**
 * @author hehe
 */
public class MessageDigestUtils {
	
	
	public static String encrypt(String password,String algorithm){
//		algorithm :MD5 SHA1 SHA256
		try {
			MessageDigest md = MessageDigest.getInstance(algorithm);
			byte[] b = md.digest(password.getBytes("UTF-8"));
			return ByteUtils.byte2HexString(b);
		}catch (Exception e){
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) throws Exception{
		System.out.println(MessageDigestUtils.encrypt("admin",Algorithm.SHA1));
	}
}
