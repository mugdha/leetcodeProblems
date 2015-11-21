package one;

public class MaxPointOnLine {
	public static void main(String[] args) {
		if (0.0 < .00001) {
			System.out.println("hhhh");
		}
		Point p = new Point(0, 2);
		Point p1 = new Point(0, 2);
		Point p2 = new Point(3, 10);
		Point p3 = new Point(3, 10);
		Point arr[] = new Point[4];
		arr[0] = p;
		arr[1] = p1;
		arr[2] = p2;
		arr[3] = p3;
		System.out.println(maxPoints(arr));
	}

	public static int maxPoints(Point[] points) {
		int maxValue = 0;

		for (int i = 0; i < points.length; i++) {
			Point cur = points[i];
			for (int j = i + 1; j < points.length; j++) {
				Line currLine = new Line(cur, points[j]);
				int count = 0;
				for (int k = 0; k < points.length; k++) {
					if (currLine.isOnLine(points[k])) {
						count++;
					}
				}
				if (count > maxValue) {
					maxValue = count;
				}
			}
		}
		return maxValue;
	}

}

class Line {
	double slope;
	Point base;

	public Line(Point p1, Point p2) {
		if (p1.x == p2.x) {
			slope = Double.MAX_VALUE;
		} else {
			slope = (double) (p2.y - p1.y) / (p2.x - p1.x) * 1.0;
		}
		base = p1;
	}

	public boolean isOnLine(Point p) {

		if (slope == Double.MAX_VALUE) {
			return p.x == base.x;
		}
		System.out.println(base.y - p.y);
		System.out.println(base.x - p.x);
		double res = Math.abs((base.y - p.y) - slope * (base.x - p.x));
		System.out.println(res);
		if (res < 0.00001)
			return true;
		else
			return false;

	}
}

class Point {
	int x;
	int y;

	public Point() {
		x = 0;
		y = 0;
	}

	public Point(int a, int b) {
		x = a;
		y = b;
	}
}
