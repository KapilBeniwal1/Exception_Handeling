public class Custome_Exception {
    public static void main(String[] args) {
        try{
            fun(5);
        }
        catch(Exception e){
            //e.message will take the message which was passed with the throw new.....
            System.out.println(e.getMessage());
        }
    }
    //In the case of custom exception we need to write both throws and throw
    public static void fun(int age) throws UnderAgeException{
        if(age <  18){
           throw new UnderAgeException("Bhai abhi tu chota hai");
        }
    }
    //Template of making custom Exception
    public static class UnderAgeException extends Exception{
        public UnderAgeException(String message){
            super(message);
        }
    }
}
