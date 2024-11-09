package day11_stream;

@FunctionalInterface
public interface Shape {
		double calcArea();
		default double calcPeri() {
			return 0.0;
		}
		public static double calcTotalArea(Shape[] arr) {
			double total = 0.0;
			for (Shape sh: arr) {
				double area = sh.calcArea();
				total += area;
			}
			return total;
			
		}
}
