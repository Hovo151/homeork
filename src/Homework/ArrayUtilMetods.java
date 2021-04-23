package Homework;

public class ArrayUtilMetods {
    //գտնել max
    void max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

    }

    //    գտնել min
    void min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);


//      Սորտավորենք մեր ունեցած մասիվը փոքրից մեծ։
    }

    void sortsMax(int[] array) {
        int y;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    y = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = y;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }


//      Սորտավորենք մեր ունեցած մասիվը մեծից փոքր։
    }

    void sortsmin(int[] array) {
        int x;
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    x = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = x;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    //      Ունենք թիվ, օրինակ՝ int index = 4; ներքևում պետք է գրենք կոդ, որը կտպի տրված index - ինդեքսի մեջի արժեքը։
    void index(int[] array) {

        int index = 5;
        for (int i = 0; i < array.length; i++) {
            if (array.length == array[i]) {
                array[0] = index;
            }
        }
        System.out.println(array[index]);
    }

//    Գրեք կոդ, որը կգտնի մասիվի մեջի կրկնվող էլեմենտները, ու կտպի որ օրինակ 3-ը կրկնվում է։

    void repeating(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < i; j++) {
                if (array[i] == array[j]) {
                    System.out.println("կրկնվող էլեմենտ " + array[i]);
                }
            }
        }

//    Ունենք թիվ, օրինակ՝ int x = 44; ներքևում պետք է գրենք կոդ, որը մեզ կտպի 44 թվի ինդեքսը մասիվի մեջ եթե կա, եթե չկա -1 կտպի։
    }

    void indexExists(int[] array) {
        int z = 88;
        for (int i = 0; i < array.length; i++) {
            if (array.length == z) {
            } else if (z == -1) {
            } else {
            }
        }
        System.out.println(z);
    }


    //   բոլոր ելեմենտներ
    void elements(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }


//    Տպեք մասիվի բոլոր զույգ էլեմենտները,

    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i]);
            }
        }
    }

    //    Տպեք մասիվի բոլոր կենտ էլեմենտները։
    void evan(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i]);
            }
        }
    }
}