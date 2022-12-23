 class Rectangle 
{ 
     int l,w;
     Rectangle(int x,int y)
     {
        l=x;
        w=y;
     }
  void  rectArea()
   {
    System.out.println("Area="+(l*w));
  }
}
class withconstructor
{
public static void main(String[] args) 
   {  
      int area1;
      Rectangle rect1=new Rectangle(15,20);
      //Rectangle rect2=new Rectangle(30,3);
      rect1.rectArea();
      // area2=rect2.rectArea();
    //System.out.println("Area 1="+area1);
     //System.out.println("Area 2="+area2);
   }
}

  
   