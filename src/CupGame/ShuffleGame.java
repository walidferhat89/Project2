package CupGame;

import java.util.Scanner;

public class ShuffleGame {
    public static void main(String[] args) {
        int rand;
        int temp;

        int[] Num = {1, 0, 1};
        Scanner scan = new Scanner(System.in);
        int response;
        int position;
        System.out.println("------------------------------welcome to shuffle game--------------------------------");
        System.out.println("guess where the 0 is ?");
        System.out.println("are you ready to play? 1-Yes/2-No");
        response = scan.nextInt();
        do {

            while (response != 1 && response != 2) {
                System.out.println("please choose 1 or 2");
                response = scan.nextInt();
            }

                if (response == 1) {
                    System.out.println("pick 1, 2 or 3!");
                    for (int i = 0; i < Num.length; ++i) {
                        rand = (int) (Math.random() * Num.length);
                        temp = Num[i];
                        Num[i] = Num[rand];
                        Num[rand] = temp;
                        position = scan.nextInt();
                        if (position == Num[0]) {

                            System.out.println(Num[0] + " good guess!");
                        } else {
                            System.out.println(Num[0] + " sorry wrong guess!!");
                        }
                    }
                } else {
                    System.out.println("---------------------------------see you next time!-----------------------------------");

                }
            System.out.println("do you wanna play again!!!");
                response = scan.nextInt();
            while (response != 1 && response != 2) {
                System.out.println("please choose 1 or 2");
                response = scan.nextInt();
            }

        } while (response == 1);
        System.out.println("---------------------------------see you next time!-----------------------------------");



            }
        }




