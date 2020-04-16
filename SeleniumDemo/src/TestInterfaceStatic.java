interface Drawable{  
void draw();  
static int cube(int x){return x*x*x;}  
}  
class Rectangle implements Drawable{  
public void draw(){System.out.println("drawing rectangle");}  
public static void draw1(){System.out.println("drawing rectangle");}  
}  
  
class TestInterfaceStatic{  
public static void main(String args[]){  
	Drawable d=new Rectangle();  
	Rectangle.draw1();  
//System.out.println(d.cube(3));  
}}  