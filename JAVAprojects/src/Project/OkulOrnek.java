package Project;

public class OkulOrnek {

	public static void main(String[] args) {
		
		Triangle ucgen = new Triangle();
		ucgen.setValues(7, 24, 25);
		
		System.out.println("Ucgen Cevresi = " + ucgen.getCevre());
		System.out.println("Ucgen Alani = " + ucgen.getArea());
		
		Rectangle dikdortgen = new Rectangle();
		dikdortgen.setValues(6,5);
		
		System.out.println("Dikdortgen Alani = " + dikdortgen.getArea());
		
		Square kare = new Square();
		kare.setValues(10);
		
		System.out.println("Kare Alani = " + kare.getArea());
	}

}
