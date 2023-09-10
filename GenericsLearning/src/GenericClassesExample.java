public class GenericClassesExample {
    public static void main(String[] args) {
        GenericClass1<Integer> myInt = new GenericClass1<>(1);
        GenericClass1<Double> mtDouble = new GenericClass1<>(3.14);
        GenericClass1<String> myString = new GenericClass1<>("Hello, World");
        GenericClass1<Character> myCharacter = new GenericClass1<>('b');

        System.out.println(myInt.getValue());
        System.out.println(mtDouble.getValue());
        System.out.println(myString.getValue());
        System.out.println(myCharacter.getValue());

        GenericClass2<Integer, String> myIntString = new GenericClass2<>(1, "Hello");
        GenericClass2<Double, Character> myDoubleChar = new GenericClass2<>(3.1412, 'B');

        System.out.println(myIntString.getX() + myIntString.getY());
    }
}

class GenericClass1 <T> {
    T x;

    public GenericClass1(T x) {
        this.x = x;
    }

    public T getValue() {
        return x;
    }
}

class GenericClass2 <T1, T2> {
    T1 x;
    T2 y;

    public GenericClass2(T1 x, T2 y) {
        this.x = x;
        this.y = y;
    }

    public T1 getX() {
        return x;
    }

    public T2 getY() {
        return y;
    }
}

class BoundedGenericClass <T1 extends Number>{  // This is how you can set up security. Will only allow number reference data types.




}
