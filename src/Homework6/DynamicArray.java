package Homework6;

public class DynamicArray {

    // սա մե հիմնական մասիվի է, որտեղ պահելու ենք ավելացող էլեմենտները
    int[] array = new int[10];

    // սա մեր մասիվի մեջ ավելացվաց էլեմենտների քանակն է
    int size = 0;


    //ստուգել եթե մասիվի մեջ  տեղ չկա-> կանչել extend()
    //և ավելացնենք
    void add(int value) {
        if (size == array.length) {
            extend();
        }
        array[size] = value;
        size++;

    }


    //1 ստեղծել հին մասիվից 10էլեմենտ ավելի մեծ մասիվ
    //2 քցել հին մասիվի էլեմենտները նորի մեջ
    //3 հին մասիվի (array,հղումը) կապենք նոր մասիվի (newArray,հղումը) հետ։
    private void extend() {
        int newArray[] = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    //եթե տրվաց ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    //մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։

    int getByIndex(int index) {
        if (index > 0 && index < array.length - 1) {
            return array[index];
        } else {
            return -1;
        }
    }

    //տպել մասիվի ավելացվաց էլեմենտները
    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + ", ");
        }
    }


    //վերադարձնել ավելացված թվերից ամենամեծը

    public int max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //վերադարձնել ավելացված թվերից ամենափոքրը

    public int min() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }


    //մասիվից ջնջում ենք եկած ինդեքսի տակ ընկած էլեմենտը, հետո տպելուց մասիվի բոլոր էլեմենտները կտպի իրար կողք, իսկ ջնջվածը ոչ
    public void deleteByIndex(int index) {
        int[] delet = new int[array.length - 1];
        if (index > 0 && index < array.length - 1) {
            for (int i = 0; i < delet.length; i++) {
                delet[i] = array[i];
                if (i >= index) {
                    delet[i] = array[i + 1];
                }
            }

        }
        array = delet;
        size--;
    }

    //մասիվից ջնջում ենք տված value-ին հավասար բոլոր էլեմենտները
    public void deleteByValue(int value) {
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                x++;
            }
        }
        for (int j = 0; j < x; j++) {
            deleteByValueFirst(value);
        }

    }


    //մասիվից ջնջում ենք տված value-ին հավասար միայն առաջին էլեմենտները։ Այսինքն եթե ասում ենք ջնջի 23 թիվը, ու մասիվում ունենք 2 և ավել 23-ներ, կջնջի միայն առաջինը։
    public void deleteByValueFirst(int value) {
        int[] delet = new int[size - 1];
        for (int i = 0; i < delet.length; i++) {
            delet[i] = array[i];
            if (array[i] == value) {
                for (int j = i; j < delet.length; j++) {
                    delet[j] = array[j + 1];
                }
                break;
            }
        }
        size--;
        array = delet;

    }


    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և endIndex-ի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex, int endIndex) {
        int x = 0;
        int subArray[] = new int[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            subArray[x] = array[i];

        }
        return subArray;


    }


    //մասիվից կկտրի ու կստանա փոքր մասիվ ըստ startIndex-ի և մինչև վերջին էլեմենտի, որն էլ կվերադարձնենք, տեստի մեջ կտպենք
    public int[] subArray(int startIndex) {

        int x = 0;
        int subArray1[] = new int[startIndex];
        for (int i = 0; i < startIndex; i++) {
            subArray1[x] = array[i];
            x++;
        }
        return subArray1;

    }

}



