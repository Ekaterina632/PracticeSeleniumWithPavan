package Session4;

public class IfConditionDemo {
    public static void main (String [] args) {
        int person_age = 12;
        if (person_age >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }

        int num = 9;

        if (num % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }

        int num2 = -1;

        if (num2 > 0) {
            System.out.println("positive number");
        } else if (num2 < 0) {
            System.out.println("negative number");
        } else {
            System.out.println("zero number");
        }

        int a = 100, b = 20, c = 30;

        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > a && b > c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }

        if (1==2) {
            System.out.println(1);
        }
        else {
            System.out.println((2));
        }

        if(true) {
            if (true) {
                System.out.println(1);
            }
            else {
                System.out.println((2));
            }
        }
        else {
            System.out.println((3));
        }
        
        int weekno = 1;
//        if (weekno == 1) {
//            System.out.println("Mon");
//        }
//        else if (weekno == 2) {
//            System.out.println("Tue");
//        }
//        else {
//            System.out.println("invalid week number");
//        }

        switch (weekno) {
            case 1: System.out.println("Mon");
            case 2: System.out.println("Tue"); break;
            default: System.out.println("invalid week number");
        }
    }
}
