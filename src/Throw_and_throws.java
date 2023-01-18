public class Throw_and_throws {
    public static void main(String[] args) {

        try {
            fun(5);
        }
        catch(Exception e){
            System.out.println("Bhai abhi tu chota hai "+e.getMessage());
        }
    }
    private static void fun(int age) {
        if(age < 18){
            throw new RuntimeException("bro you're under aged");
        }
    }
}
