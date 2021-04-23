package Homework;

public class FigurPeint {



//        *
//        **
//        ***
//        ****
//        *****

    void figureone() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//        *****
//        ****
//        ***
//        **
//        *

    void figuretwo() {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//        *****
//         ****
//          ***
//           **
//            *

    void figuretree() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 5; j > i; j--) {
                System.out.print("*");

            }
            System.out.println();
        }
    }


//            *
//           **
//          ***
//         ****
//        *****

    void figurefour() {
        for (int i = 0; i < 6; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


//             *
//            * *
//           * * *
//          * * * *
//           * * *
//            * *
//             *

    void figurefive() {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (
                int i = 0;
                i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j > i; j--) {
                System.out.print(" *");

            }
            System.out.println();
        }

    }
}










