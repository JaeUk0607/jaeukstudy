/*
���赵 �� 1���� ���� �� ����
�������� ���赵 �ۼ��� 
 
 
*������ 
 ��Ӱ���(is ~a :���) �� ~�̴�(�θ����� �ڷ�)
 
 ���԰���(has ~a:����) �� ~ ������ �ִ�
------------------------------
��Ŭ����,  ����Ŭ����
���� �����̴� (��Ӱ���)
>>�� extends ����



���� ���̴�(x)
���� ����(x,y)
���� ���� ������ �ִ�(has ~a)
>>��{ �� ������; }

����, ��
������ ���̴�
������ ���� ������ �ִ�
(���� ����)

���� ���
��, �ﰢ��, ������� ����� ���赵�� �ۼ��Ѵٸ�

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���⼭ ����(�Ϲ�ȭ, �߻�ȭ)�� ���� : ����, �׸���
����(��üȭ, Ư��ȭ) -> (��, ������)

���� ��ǥ��(x,y)
���� ���� ������ �ִ�
�ﰢ���� ���� ������ �ִ�
�簢���� ���� ������ �ִ�

�Ϲ�ȭ(����, �߻�) : shape(���� �׸���), point(��)
class Shape{} , class Point{}

��üȭ Ư��ȭ : circle, triangle
------------------------------------------

 */

//�߻�ȭ, �Ϲ�ȭ
class Shape {
	String color = "gold";

	void draw() {
		System.out.println("�׸���");
	}
}

class Point {
	int x;
	int y;

	Point() {
		// this.x = 1;
		// this.y = 1;
		this(1, 1);
	}

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

// ���� ���弼��(���� : ������ �������� ������ �ֽ��ϴ�.)
// ���� �����̴�(is ~a) : extends
// ���� ���� ������ �ִ�.(has ~a) : ���� ����
// ���� Ư������ ������
class Circle extends Shape {
	int r; // ������
	Point center; // ���԰���

	Circle() {
		// this.r=10;
		// this.center = new Point(10,12);
		this(10, new Point(10, 12));
	}

	/*
	 * Circle c = new Circle(); Circle c2 = new Circle(4,new Point(5,8));
	 */
	Circle(int r, Point center) {
		this.r = r;
		this.center = center;
	}

}

// ����1)
// �ﰢ�� Ŭ������ ���弼��
// ����) �ﰢ���� 3���� ���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
// Shape, Point ���� �޾ƿ�
// hint) (x,y) (x,y) (x,y)
class Triangle extends Shape {
	Point p;
	Point p2;
	Point p3;

	/* Point [] arr = new Point[3]; */
	Triangle() {
		// this.p = (new Point(1,2));
		// this.p2 = (new Point(2,3));
		// this.p3 = (new Point(4,2));
		this(new Point(1, 2), new Point(2, 3), new Point(4, 2));

	}

	Triangle(Point p, Point p2, Point p3) {
		this.p = p;
		this.p2 = p2;
		this.p3 = p3;
		/*
		 * this.arr[0] = p; this.arr[1] = p2; this.arr[2] = p3;
		 */

	}

}

class Triangle2 extends Shape {
	Point[] arr;

	Triangle2() {
		this(new Point[] { new Point(1, 2), new Point(3, 4), new Point(4, 5) });
		// this(new Point[] { new Point(1, 2), new Point(3, 4), new Point(5, 6) });
	}
	
	Triangle2(Point[] p){
		this.arr = p;
	}

}

public class Ex02_inherit_composite {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.draw();
		System.out.println(c.color);
		System.out.println(c.r);
		System.out.println(c.center.x); // ������ �ٽ� �ڵ� ���� .�ּҰ�.��
		System.out.println(c.center.y);

		// ���� ���� ������ �ϰ� ������ �����ؼ� ���� �׸��� �;��

		// Point p = new Point(20, 45);
		// Circle c2 = new Circle(50, p);
		Circle c2 = new Circle(50, new Point(20, 45));
		System.out.println();
		Triangle t2 = new Triangle();

		Triangle t = new Triangle(new Point(10, 5), new Point(1, 2), new Point(16, 3));
		System.out.println("��(x,y) : " + t.p.x + " " + " " + t.p.y);
		System.out.println("��(x1,y1) : " + t.p2.x + " " + " " + t.p2.y);
		System.out.println("��(x2,y2) : " + t.p3.x + " " + " " + t.p3.y);

	}

}
