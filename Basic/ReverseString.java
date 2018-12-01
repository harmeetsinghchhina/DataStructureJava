public class ReverseString {
	public static void main(String[] args) {
		String str = "hello how are you doing";
		System.out.println(reverseBuilder(str));
		System.out.println(reverseByte(str));
		System.out.println(reverseChar(str));
	}
	public static StringBuilder reverseBuilder(String str) {
		StringBuilder sbr = new StringBuilder(str);
		sbr = sbr.reverse();
		return sbr;
	}
	public static String reverseByte(String str) {
		byte[] strByte = str.getBytes();
		byte[] result = new byte[strByte.length	];
		for(int i=0;i<strByte.length; i++) {
			result[i] = strByte[strByte.length-1-i];
		}
		return new String(result);
	}
	public static String reverseChar(String str) {
		char[] chr = str.toCharArray();
		char[] result = new char[chr.length];
		for(int i=0;i<chr.length;i++) {
			result[i] = chr[chr.length-1-i];
		}
		return new String(result);
	}
}