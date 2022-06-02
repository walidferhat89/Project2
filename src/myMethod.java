public class myMethod {
    static void myFirst(String name, int age) {
        System.out.println(name + " is " + age + " years old.");
    }
    static int Myfunction(int x) {
        int y = (-6) - x;
        return y;
    }
    static void checkAge(int age) {
        if (age >= 18) {

            System.out.println("access is permitted!!");
        } else {
            System.out.println("access denied sorry!!!");
        }
    }
        public static void main (String[]args){
            myFirst("walid", 33);
            myFirst("Idriss", 3);
            myFirst("Jhon", 18);
            myFirst("Chelsea", 22);
            checkAge(17);

            System.out.println(Myfunction(21));
            System.out.println(Myfunction(54));
            System.out.println(Myfunction(12));
            System.out.println(Myfunction(-23));

        }
    }