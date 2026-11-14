public class TypeTable {
    public static void main(String[] args) {
        System.out.printf("TYPE       BITS                      MIN                      MAX%n");
        System.out.printf("byte       %s %s %s %n", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short %s %s %s %n", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int %s %s %s %n", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long %s %s %s %n", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.printf("float %s %s %s %n", Float.SIZE, -Float.MAX_VALUE, Float.MAX_VALUE);
        System.out.printf("double %s %s %s %n", Double.SIZE, -Double.MAX_VALUE, Double.MIN_VALUE);
        System.out.printf("char %d %d %d%n", Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        System.out.printf("boolean - %s %s %n", Boolean.FALSE, Boolean.TRUE);
    }
}
