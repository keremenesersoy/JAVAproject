package Project;

public class Shape {

	public double a;
	public double b;
	public double c;
	
	public void setValues(double a , double b , double c) {
		
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void setValues(double a , double b) {
		
		this.a = a;
		this.b = b;
	}
	
	public void setValues(double a) {
		
		this.a = a;
	}
	
	public double getA() {
		
		return this.a;
	}
	
	public double getB() {
		
		return this.b;
	}
	
	public double getC() {
		
		return this.c;
	}
	
}


class Rectangle extends Shape{
	
	public double getArea() {
		
		return getA() * getB();
		
	}
	
}

class Square extends Shape{
	
	public double getArea() {
		
		return Math.pow(getA(), 2);
	}
	
}

class Triangle extends Shape{
	
	public double getCevre() {
		
		return (getA() + getB() + getC());
	}
	
	public double getArea() {
		
		double s = (getA() + getB() + getC()) / 2;
		
		return Math.sqrt((s * (s - getA()) * (s - getB()) * (s - getC()))); 
	}
	
}










