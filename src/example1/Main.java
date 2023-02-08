package example1;

public class Main {
    public static void main(String[] args) {
        // boxing
        int primitive = 100;
        Integer reference = Integer.valueOf(primitive);
        // unboxing
        int anotherPrimitive = reference.intValue();

        // autoboxing
        double primitiveDouble = 10.0;
        Double wrapperDouble = primitiveDouble; // autoboxing
        double anotherPrimitiveDouble = wrapperDouble; // autounboxing

        // autoboxing работает только тогда когда левая и правая части принадлежат одному типу
        Long n1 = 10L; // working
        Integer n2 = 10; // working
    }
}
