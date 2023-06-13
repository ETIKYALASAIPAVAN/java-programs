//method overloading
class Pattern{
  public void print(){
    for(int i=0;i<10;i++){
      System.out.println(1);
  }
}
  public void print(int j){
    for(int i=0;i<10;i++){
      System.out.println(j);
  }
  }
}
class Main2{
  public static void main(String[]args){
    Pattern p1=new Pattern();
    p1.print();
    System.out.println("\n");
    p1.print(2);
    System.out.println("\n");
  }
}
  
  