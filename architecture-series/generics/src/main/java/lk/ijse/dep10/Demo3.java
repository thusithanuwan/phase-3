package lk.ijse.dep10;

public class Demo3 {
    public static void main(String[] args) {
        DynamicArray<String> array1 = new DynamicArray<>();
        printList(array1);

        DynamicArray<A> arrayA = new DynamicArray<>();
        DynamicArray<B> arrayB = new DynamicArray<>();
        DynamicArray<C> arrayC = new DynamicArray<>();
        DynamicArray<D> arrayD = new DynamicArray<>();

        print2(arrayB);
        print2(arrayC);
        print2(arrayD);

        print3(arrayA);
        print3(arrayB);
        print3(arrayC);


    }
    public static void printList(DynamicArray<?> myArray){
        myArray.print();
    }
    public static void print2(DynamicArray<? extends B> someArray){  // B or B's Sub Class

    }
    public static void print3(DynamicArray<? super C> someArray){  // C or C's super Class

    }
}
class A{};
class B extends A{};
class C extends B{};
class D extends C{};
