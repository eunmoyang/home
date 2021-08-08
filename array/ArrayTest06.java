package kr.co.job.array;

public class ArrayTest06 {

	public static void main(String[] args) {
		// [page 208. 예제 5-13] 16진수를 2진수로 변환하는 알고리즘
		char[] hex = {'C', 'A', 'F', 'E', '8', '5'};
		String[] binary = {"0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"};
		String result = "";
		
		for(int i=0; i<hex.length; i++) {
			if(hex[i]>='0' && hex[i]<='9') {
				result += binary[hex[i]-'0'];
			} else {
				result += binary[hex[i]-'A'+10];
			}
		}
		System.out.println("hex:" + new String(hex));
		System.out.println("binary:"+result);

	}

}