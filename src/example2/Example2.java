package example2;

public class Example2 {
    public static void main(String[] args) {
        @SuppressWarnings(value = "all")
        Integer number = new Integer("10012");
        @SuppressWarnings(value = "all")
        Float f = new Float("0.01");
        @SuppressWarnings(value = "all")
        Long longNumber = new Long("1000000000000000");
        @SuppressWarnings(value = "all")
        Boolean boolVal = new Boolean("true");

        // также можно создать объект оборточного класса (wrapper) с помощью специального
        // метода
        Long longVal = longNumber.parseLong("10000000000000");
        // а если нам надо сравнить оберточные классы друг с другом?
        Long l1 = Long.valueOf("2000");
        Long l2 = Long.valueOf("2000");
        System.out.println(l1==l2); //false
        System.out.println(l1.equals(l2)); // true использовать метод equals


    }
}
