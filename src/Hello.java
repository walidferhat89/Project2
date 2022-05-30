
public class Hello {
    public static void main(String[] args) {
        int result= sum(10);
        System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }
}
/*static void checkAge(int age) {
        if (age >= 18) {

            System.out.println("access is permitted!!");
        } else {
            System.out.println("access denied sorry!!!");
        }

    }

    public static void main(String[] args) {
        checkAge(17);
    }*/

