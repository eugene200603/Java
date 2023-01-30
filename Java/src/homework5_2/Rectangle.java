package homework5_2;

public class Rectangle {
	private double lengh;
	private double width;
	private double computearea;
	private double computecircumference;
	
	public Rectangle(double lengh,double width) {
		this.lengh=lengh;
		this.width=width;
	}
	

	  public void computeArea() {
		  computearea=lengh*width;
		  System.out.println("矩形面積:"+computearea);
	  }
	  public void computeCircumference(){
		  computecircumference=2*(lengh+width);
		  System.out.println("矩形周長:"+computecircumference);
	  }
}