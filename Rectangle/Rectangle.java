import greenfoot.*;
public class Rectangle extends Actor{
  private int width;
  private int height;
  //instant variable of reference type
  Rectangle partner;
  
  public Rectangle(int w, int h){
    width = w;
    height = h;
    getImage().scale(width*10, height*10);
  }
  
  public Rectangle(int s){
    width = s;
    height = s;
    getImage().scale(width*10, height*10);
  }
      int k;
  public Rectangle(){
    partner = new Rectangle(10,5);
    System.out.println("Width: " +width+" Height "+height+" Partner "+partner);
    //getImage().scale(width*10, height*10);
  }
  
  public void setWidth(){
    width = 10;
    height = 10;
    }

  public void setWidth(int Size){
    width = Size;
}

  public void setHeight(int h){
    height = h;
    }
  public int getArea(){
        int Area = width*height;
        return Area;
    }

  public void printArea(){
        int area = width*height;
        System.out.println(area);
    }
  public static void main(String[] args){
    Rectangle rect1=null;
    System.out.println(rect1);
    rect1 = new Rectangle(12,10);
    System.out.println(rect1);
  }
  public String toString(){
        return "Rectangle " +System.identityHashCode(this)+" width "+width+" height " + height;
    }
}