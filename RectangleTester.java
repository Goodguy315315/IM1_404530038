/*
 * [C]68
 * [TA's advise]
 * 1.Good job!
 * 2.沒有使用到自訂method, 這部分扣2分.
 * 3.謝謝你的誠實, 不過我必須依照規定將你的分數從等第C開始作為計算, 若以後對於作業上有問題, 或許你可以和我約時間討論.
 * */


class Rectangle {
	
	//有沒有可能是浮點數呢?
	int height, width, x, y;

	Rectangle() {
		//this(-1,-1,-1,-1);//加上這一行實踐物件初始化的功能會讓你程式更好.
	}

	Rectangle(int h, int w, int xx, int yy) {
		this.height = h;
		this.width = w;
		this.x = xx;
		this.y = yy;
	}

	int getWidth() {
		return this.width;
	}

	int getheight() {
		return this.height;
	}

	public String toString() {
		return "java.Rectangle[x = " + this.x + ", y = " + this.y + ", height = " + this.height + ", width = "
				+ this.width;

	}
}

public class RectangleTester {
	public static void main(String[] args) {
		Rectangle object1 = new Rectangle(18, 57, 15, 25);
		System.out.println(object1);
		
		//你已經完成了method 何不用它呢?
		System.out.println("Area = " + 1.0 * 57 * 18);
		System.out.println("Perimeter = " + 2.0 * (57 + 18));

		System.out.println();
		Rectangle object2 = new Rectangle(47, 60, 0, 12);

		System.out.println(object2);
		System.out.println("Area = " + 1.0 * 60 * 47);
		System.out.println("Perimeter = " + 2.0 * (60 + 47));
		System.out.println("===========End of Output!==========");
	}

}
