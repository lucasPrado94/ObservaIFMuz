package util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Utils {
	
	public static String toMD5(String senha) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance("MD5");
			BigInteger hash = new BigInteger(1, md.digest(senha.getBytes()));
			senha = hash.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
		return senha;
	}

}
