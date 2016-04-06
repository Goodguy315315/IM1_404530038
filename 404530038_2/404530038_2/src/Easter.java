
public class Easter {

	public static String getEasterDate(int year) {

		int a = year % 19;
		int b = year / 100;// Math.floor(), -2
		int c = year % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13) / 25;
		int h = (19 * a + b - d - g + 15) % 30;
		int j = c / 4;
		int k = c % 4;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n = (h - m + r + 90) / 25;
		
		// why is 32?
		int p = (h - m + r + n + 19) % 32;

		return "In " + year + ",Easter sunday is :month = " + d + " and day = " + e;
	}

}
