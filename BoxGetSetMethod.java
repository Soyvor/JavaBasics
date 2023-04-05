 

public class BoxGetSetMethod {
	private double width;
	   private double length;
	   private double depth;

	   BoxGetSetMethod(double width, double length, double depth) {
	      this.width = width;
	      this.length = length;
	      this.depth = depth;
	   }

	   public void setWidth(double width) {
	      this.width = width;
	   }

	   public void setlength(double length) {
	      this.length = length;
	   }

	   public void setDepth(double depth) {
	      this.depth = depth;
	   }

	   public double getWidth() {
	      return width;
	   }

	   public double getlength() {
	      return length;
	   }

	   public double getDepth() {
	      return depth;
	   }
	   public double volume() {
		      return width * length * depth;
		   }
	   
	   public static void main(String[] args) {
		   BoxGetSetMethod box = new BoxGetSetMethod(10, 20, 30);
		   box.setWidth(40);
		   box.setlength(50);
		   box.setDepth(60);
		   System.out.println("Width: " + box.getWidth());
		   System.out.println("Length: " + box.getlength());
		   System.out.println("Depth: " + box.getDepth());
		   System.out.println("Volume: " + box.volume());
		   }
}
