package lab;

public class Rectangle{
	
	// only two simple instance variables: height&width
	// no methods
	
	private double height;
	private double width;
	
	
	//constructors
	public Rectangle(double height, double width) {
		this.setHeight(height);
		this.setWidth(width);
	}
	
	public Rectangle (double width) {
		
		//this.setWidth(width);
		this(width, width);
		}
	
	//no argument constructor
	// if any constructor is available; default constructor is out of operation
	public Rectangle () {
		
	}
	////////////////////
	
	
	
	//Set&Get Method
	public void setWidth(double x) {
		if (x<0){
			System.out.println("\nValue of width cannot be negative\n width is set to 0.0");
			
		}else{
			width = x;	
		}
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setHeight(double height) {
		if (height<0) {
			System.out.println("\nThe value of height cannot be negative \n height is set to 0.0");
			
		}else{
			this.height = height;
		}
		
	}
	
	public double getHeight() {
		return this.height;
	}
	 
	//public void displayArea() {
		
		//double area = height * width;          
        
		//System.out.printf("\nArea is %10.2f:", area);
	//}
	
	public double calculateArea() {
		double area = height * width;
		return area;
	}
	
	public void display () {
		System.out.printf("\nWidth is %10.2f:", width);
		System.out.printf("\nHeight is %10.2f:", height);
		System.out.printf("\nArea is %10.2f:", calculateArea());
		
	}

}
 