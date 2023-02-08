package NPE;

public class NPE {
    public static void main(String[] args) {
        Long longVal = null;
        long primitivelLong = longVal; // выкинет NPE
        long unboxed = longVal !=null ? longVal : 0; // тернарный оператор
        // как выглядит тернарный оператор разложенный
        long unboxed2;
        if (longVal != null) {
            unboxed2 = longVal;

        } else {
            unboxed2 = 0;
        }
    }
}
