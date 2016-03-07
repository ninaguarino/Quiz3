public abstract class Triangle extends GeometricObject {
	
		// Three double data fields named side1, side2, and side3 with default values 1.0 to denote three sides of the triangle.
		private double side1 = 1.0;
		private double side2 = 1.0;
		private double side3 = 1.0;
		
		// A no-arg constructor that creates a default triangle.
		public Triangle() {
		}
		
		// A constructor that creates a triangle with the specified side1, side2, and side3.
		public Triangle(double side1, double side2, double side3){
	        this.side1 = side1;
	        this.side2 = side2;
	        this.side3 = side3;
		}

		// The accessor methods for all three data fields.
		public double getSide1(){
			return side1;
		}
		
		public double getSide2(){
			return side2;
		}
		
		public double getSide3(){
			return side3;
		}
		
		// A method named getPerimeter() that returns the perimeter of this triangle.
		public double getPerimiter(){
			double perimiter = (side1 + side2 + side3) / 2;
			return perimiter;
		}
		
		// A method named getArea() that returns the area of this triangle.
		public double getArea(){
		    double perimeter = getPerimiter() / 2;
		    return Math.sqrt(perimeter * ( (perimeter) * (perimeter - side2) * (perimeter - side3) ));
		}
		
		// A method named toString() that returns a string description for the triangle.		
		public String toString(){
		    return ("The triangle's side 1 is " + side1 + ", side 2 is " + side2
		            + ", and side 3 is " + side3);
		}

	}