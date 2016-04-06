/*
 * [B]83
 * [TA's Advise]
 * 1.一開始打開檔案的時候出錯, 原因產生於java檔案並未放置在src中, 已經協助你進行修正, 等第從B開始計算
 * 2.實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian.
 * 3.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 4.之後可以嘗試在javadoc中寫一些註解. * 	
 * */
public class EasterTester {

	public static void main(String[] args) {

		System.out.println(Easter.getEasterDate(2001));
		System.out.println(Easter.getEasterDate(2012));
	}
}