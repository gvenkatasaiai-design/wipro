import test.foundation;

public class TestAccess {

    public static void main(String[] args) {

        foundation obj = new foundation();

        // System.out.println(obj.var1); // Error - private
        // System.out.println(obj.var2); // Error - default
        // System.out.println(obj.var3); // Error - protected
        System.out.println(obj.var4);    // Accessible - public
    }
}
