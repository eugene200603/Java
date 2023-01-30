package homework5_2;

public class Circle  implements Shape{
	    private  double radius;
	    private double computearea;
	    private double computecircumference;
	    
	    public Circle(double radius) {
	    	this.radius=radius;
	    }

	public void computeArea( ) {
		   computearea=radius*radius*Math.PI;
		   System.out.println("圓面積:"+computearea);
	}
	
	public void computeCircumference( ) {		
		computecircumference=(radius+radius)*Math.PI;
		System.out.println("圓周長:"+computecircumference);
	}
	
}
