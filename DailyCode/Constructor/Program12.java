class Demo{
   static int x=10;
   static void fun(){
   System.out.println("In Fun");
   }
    public static void main(int args){
  System.out.println("int wala main");
  fun();
    }
  public static void main(String[] args){
  System.out.println(x);
  fun();
  main(10);
  }               

}
