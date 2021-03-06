package br.com.cripto.utils;

import org.apache.commons.codec.digest.DigestUtils;

public class CodenationCripto {

	public static String encriptar(int chave, String valor) {
		
		chave = (chave < 0 ? -1 : 1) * chave;
		return encdec(chave, valor);
	}
	public static String decriptar(int chave, String valor) {
		
		chave = (chave > 0 ? -1 : 1) * chave;
		return encdec(chave, valor);
	}
	private static String encdec(int chave, String valor) {
		
		StringBuilder builder = new StringBuilder();
		valor.chars().forEach(x -> {
			
			if (x == 'a')
				System.out.println("CodenationCripto.encdec()");
			if (!Character.isDigit(x) && !Character.isWhitespace(x) 
					&& !(((char) x) == '.') && !(((char) x) == ',')) {
				
				x += chave;
				if (x < 97)
					x = (x - 97) + 123;
				else if (x > 122)
					x = (122 - x) + 96;
			}

			builder.append((char)(x));
			
			});
		return builder.toString();
	}
	
	public static String convertToSha1(String valor) {
		
		return DigestUtils.sha1Hex(valor).toString();
	}
}