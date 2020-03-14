package pojos;

public class Triangle
{
   private int height;
   private String type;
   
public Triangle(int height) {
	this.height = height;
}

public Triangle(String type) {
	this.type = type;
}

public Triangle(int height, String type) {
	this.height = height;
	this.type = type;
}
   
   public void draw()
   {
	   System.out.println(type+" type triangle is drawn with height : "+height+" cm");
   }
}
