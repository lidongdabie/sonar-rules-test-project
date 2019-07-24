package net.cheneystudio.constant;

/**
 * Create on 2019-07-22 17:12
 *
 * @author Cheney Wong
 */
public class MagicValue {
    static final int CONSTANT_INT_42 = 42;
    static final long CONSTANT_LONG_42 = 42L;
    static final float CONSTANT_FLOAT_42 = 42.0F;
    static final double CONSTANT_DOUBLE_42 = 42.0D;
    static final String CONSTANT_STRING_42 = "42";
    static final int CONSTANT_BINARY_A = 0B00;
    static final int CONSTANT_BINARY_B = 0B0_0;
    static final int CONSTANT_OCTAL_A = 00;
    static final int CONSTANT_OCTAL_B = 0_0;
    static final int CONSTANT_HEX_A = 0x00;
    static final int CONSTANT_HEX_B = 0x0_0;
    static final double CONSTANT_HEX_C = 0x0_0p0;
    static final double CONSTANT_HEX_D = 0x0_0p-0;
    static final double CONSTANT_SCIENTIFIC_A = 00e0;
    static final double CONSTANT_SCIENTIFIC_B = 00e-0;
    static final double CONSTANT_SCIENTIFIC_C = 0.0e0;
    static final double CONSTANT_SCIENTIFIC_D = 0_0e0;
    static final int[] CONSTANT_INT_ARRAY_A = {42};
    static final int[] CONSTANT_INT_ARRAY_B = new int[42];
    static final int[] CONSTANT_INT_ARRAY_C = new int[]{42};
    static final int[][] CONSTANT_TWO_DIMENSION_INT_ARRAY_A = {{42}};
    static final int[][] CONSTANT_TWO_DIMENSION_INT_ARRAY_B = new int
            [42]
            [42];
    static final int[][] CONSTANT_TWO_DIMENSION_INT_ARRAY_C = new int[][]{{42}};
    static final String[] CONSTANT_STRING_ARRAY = {"42"};
    static final String[][] CONSTANT_TWO_DIMENSION_STRING_ARRAY = {{"42"}};
    int intOne = 1;
    int intZero = 0;
    int intMinusOne = -1;
    long longOne = 1L;
    long longZero = 0L;
    long longMinusOne = -1L;
    float floatOne = 1.0F;
    float floatZero = 0.0F;
    float floatMinusOne = -1.0F;
    double doubleOne = 1.0D;
    double doubleZero = 0.0D;
    double doubleMinusOne = -1.0D;
    String empty = "";
    int magicInt = 42;
    long magicLong = 42L;
    float magicFloat = 42.0F;
    double magicDouble = 42.0D;
    String magicString = "42";
    int binaryA = 0B00;
    int binaryB = 0B0_0;
    int octalA = 00;
    int octalB = 0_0;
    int hexA = 0x00;
    int hexB = 0x0_0;
    double hexC = 0x0_0p0;
    double hexD = 0x0_0p-0;
    double scientificA = 00e0;
    double scientificB = 00e-0;
    double scientificC = 0.0e0;
    double scientificD = 0_0e0;
    int[] intArrayA = {-1, 0, 1};
    int[] intArrayB = new int[0];
    int[] intArrayC = new int[]{-1, 0, 1};
    int[][] twoDimensionIntArrayA = {{-1, 0, 1}};
    int[][] twoDimensionIntArrayB = new int[0][0];
    int[][] twoDimensionIntArrayC = new int[][]{{-1, 0, 1}};
    String[] stringArray = {""};
    String[][] twoDimensionStringArray = {{""}};
    int[] intArrayMagicA = {42};
    int[] intArrayMagicB = new int[42];
    int[] intArrayMagicC = new int[]{42};
    int[][] twoDimensionIntArrayMagicA = {{42}};
    int[][] twoDimensionIntArrayMagicB = new int
            [42]
            [42];
    int[][] twoDimensionIntArrayMagicC = new int[][]{{42}};
    String[] stringArrayMagic = {"42"};
    String[][] twoDimensionStringArrayMagic = {{"42"}};

    int method(int number) {
        return number;
    }

    String method(String string) {
        return string;
    }

    void methodA() {
        int intA = method(0);
        int intB = method(42);
        String stringA = method("");
        String stringB = method("42");

        final int constantIntA = method(0);
        final int constantIntB = method(42);
        final String constantStringA = method("");
        final String constantStringB = method("42");
    }

    void methodB() {
        int intA = 1 + 1;
        int intB =
                1 +
                        42;
        int intC =
                1 +
                        method(1);
        int intD =
                1 +
                        method(42);
        int intE =
                method(42) +
                        method(42);

        String stringA = "" + "";
        String stringB =
                "" +
                        "42";
        String stringC =
                "" +
                        method("");
        String stringD =
                "" +
                        method("42");
        String stringE =
                method("42") +
                        method("42");
    }

    void methodC() {
        int intX;
        intX = 1;
        intX = 42;
        intX = method(1);
        intX = method(42);

        intX += 1;
        intX += 42;
        intX += method(1);
        intX += method(42);

        intX = 1 + 1;
        intX =
                1 +
                        42;
        intX =
                1 +
                        method(1);
        intX =
                1 +
                        method(42);
        intX =
                method(42) +
                        method(42);

        intX += (
                method(42)
                        +
                        (
                                42 +
                                        42));
    }

    void methodD() {
        String stringX;
        stringX = "";
        stringX = "42";
        stringX = method("");
        stringX = method("42");

        stringX += "";
        stringX += "42";
        stringX += method("");
        stringX += method("42");

        stringX = "" + "";
        stringX =
                "" +
                        "42";
        stringX =
                "" +
                        method("");
        stringX =
                "" +
                        method("42");
        stringX =
                method("42") +
                        method("42");

        stringX += (
                method("42")
                        +
                        (
                                "42" +
                                        "42"));
    }

    void methodE() {
        for (
                int i = 0;
                i < 1;
                i++
        ) {

        }

        for (
                int i = 0;
                i < 42;
                i++
        ) {

        }
    }
}
