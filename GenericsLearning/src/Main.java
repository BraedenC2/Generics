import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Integer[] integer = {1, 2, 3, 4, 5, 6, 7};
        String[] string = {"Hello,", "World"};
        Double[] doubl3 = {1.2, 2.3, 3.4, 4.5};
        Character[] characters = {'h', 'i', ' ', 'w', 'o', 'r','l','d'};

        genericMethod(integer);
        genericMethod(string);
        genericMethod(doubl3);
        genericMethod(characters);
        System.out.println("-----");
        System.out.println(getFirst(integer));
        System.out.println(getFirst(string));
        System.out.println(getFirst(doubl3));
        System.out.println(getFirst(characters));


    }

    // To create a Generic Method:
    public static <T> void genericMethod(T[] t){
        for(T x : t){
            System.out.print(x);
        }
        System.out.println();
    }

    public static <T> T getFirst(T[] t){
        return t[0];
    }


}
