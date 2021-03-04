package week16;

public class rectangle {
	String name;
	double width;
	double length;
	double area;
	
	
	private void printArea(){
		area = width * length;
		System.out.println("The area of :" + name + "rectangle is :" + area);
	}

	public double getArea() {
		area = width * length;
		return area;
	}
	public static void main(String[]args) {
		rectangle A = new rectangle();
		A.name = "A";
		A.width = 4.0;
		A.length = 5.0;
		System.out.println("Name :" + A.name);
		System.out.println("width : " + A.width);
		System.out.println("Length : " + A.length);
		A.printArea();
		
		System.out.println("=*=*=*=*=*=*=*=*=*=**");
		
		rectangle B = new rectangle(); 
		B.name = "B";
		B.width = 2.0;
		B.length = 6.0;
		System.out.println("name :" + B.name);
		System.out.println("width :" + B.width);
		System.out.println("length :" + B.length);
		B.printArea();
		
		System.out.println("length" + A.getArea());
		System.out.println("length" + B.getArea());
	}

}
