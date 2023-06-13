//method overriding
class Language{
  public void print(){
    System.out.println("python language");
  }
}
class java extends Language{
  public void print(){
   System.out.println("java programming language"); 
    super.print();
  }
}

class Main{
  public static void main(String[]args){

    java j1=new java();
    j1.print();
    Language l1=new Language();
    l1.print();
    
  }
}