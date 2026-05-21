
    class base{
        int x;
        int y;
        public int sum(){
            return x+y;
        }
    
    }
     class D extends base {
          int z;
          public int addition(){
            return x+y+z;
          }
     }
     public class inheritence{
        public static void main(String[] args){
         D obj=new D();
         obj.x=10;
         obj.y=20;
         obj.z=30;
         System.out.println(obj.addition());
    }
}