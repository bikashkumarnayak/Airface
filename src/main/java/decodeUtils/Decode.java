package decodeUtils;

import java.util.Base64;

public final class Decode {

	
	private Decode() {
		
	}
	public static String getDecode(String encode) {
		return new String(Base64.getDecoder().decode(encode.getBytes()));
	}
}
