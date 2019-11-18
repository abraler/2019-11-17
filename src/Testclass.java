public class Testclass {
    private static void testMethod(){
        System.out.println("testMethod");
    }
    public static void main(String[] args) {
        ((Testclass)null).testMethod();
    }
}