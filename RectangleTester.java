/*
 * [C]68
 * [TA's advise]
 * 1.Good job!
 * 2.�S���ϥΨ�ۭqmethod, �o������2��.
 * 3.���§A���۹�, ���L�ڥ����̷ӳW�w�N�A�����Ʊq����C�}�l�@���p��, �Y�H����@�~�W�����D, �γ\�A�i�H�M�ڬ��ɶ��Q��.
 * */


class Rectangle {
	
	//���S���i��O�B�I�ƩO?
	int height, width, x, y;

	Rectangle() {
		//this(-1,-1,-1,-1);//�[�W�o�@������l�ƪ��\��|���A�{����n.
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
		
		//�A�w�g�����Fmethod �󤣥Υ��O?
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
