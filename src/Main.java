// try{} catch(){} block , finally
public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
       int a = 5;
       int b = 0;
       int c = 6;

       try {
           System.out.println(c / b);
           System.out.println(a / b);
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println(" X "+e);
       }
       catch(NullPointerException e){
           System.out.println("Y "+e);
       }
       catch(ArithmeticException e){
           System.out.println("Z1");
       }
       catch(Exception e){
           System.out.println("Z2 "+e);
       }

       finally{
           System.out.println("Irrespective of the exception got handled or not I will defeneitly be printed");
       }
       System.out.println("Bottom");
    }
}