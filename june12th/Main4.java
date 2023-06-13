//by using interface with abstract methods
interface Name{
  void Method1();
  void Method2();
  
}

class Test implements Name{
  public void Method1(){
    System.out.println("Audio playing");
    
  }
  public void Method2(){
    System.out.println("Audio stopped");
}
}
 
public class Main4{
  public static void main(String[]args){
    Test player=new Test();
    player.Method1();
    player.Method2();
  }
}
   