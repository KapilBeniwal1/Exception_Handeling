public class Throws_Keyword {
    // declareing the type of exception
    public static void findFile() throws ArithmeticException {

        // code that may generate IOException
        System.out.println(5/0);
        System.out.println("hello"); //this line will not compile because the previous
                                     // line throws an exception & it will catches/handeled
                                    // by the catch block in the calling function () henmce the route is changed
    }

    public static void main(String[] args) {
        try {
            findFile();
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled and the exception is : "+e);
        }
        System.out.println("last line");
    }
}
