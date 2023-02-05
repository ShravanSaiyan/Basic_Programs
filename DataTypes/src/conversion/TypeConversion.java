package conversion;

public class TypeConversion {
    public static void main(String[] args) {
        Double doubleValue = new Double("2.4");
        int intValue=doubleValue.intValue();
        byte byteValue=doubleValue.byteValue();
        float floatValue=doubleValue.floatValue();
        System.out.println(intValue+byteValue+floatValue+doubleValue);
    }
}
