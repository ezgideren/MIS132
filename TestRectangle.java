package lab;

public class TestRectangle {
	
	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(10);
		//System.out.printf("The height is before %10.2f:", r1.height);
		//System.out.printf("\nThe width is before %10.2f:", r1.width);
		
		Rectangle r2 = new Rectangle ();
		//r2.height = 3.0;
		//r2.width = 4.0; 

		//r1.height = 4.0;
		//r1.width = 5.0; 
		
		//System.out.printf("\nThe height is before %10.2f:", r1.height);              
		//System.out.printf("\nThe width is before %10.2f:", r1.width);
		
		//r1.setWidth(5);
		//r1.setHeight(10);
		//r1.display();
		double area1 = r1.calculateArea();
		System.out.printf("\nThe width for r1 is %10.2f:", r1.getWidth());
		System.out.printf("\nThe height for r1 is %10.2f:", r1.getHeight());
		System.out.printf("\nThe area for r1 is %10.2f:", area1);
		//System.out.printf("\nThe area is: %10.2f" ,area1);
		
		//double area2 = r2.calculateArea();
		//System.out.printf("\nThe area is: %10.2f", area2);		                                                                           

}
	
}
