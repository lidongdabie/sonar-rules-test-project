package net.cheneystudio.naming;

/**
 * Create on 2019-07-17 15:37
 *
 * @author Cheney Wong
 */
public class BadFieldNameNonLowerCamelCase {
    int anInt;
    int AnInt;
    int ANINT;

    Object object = new Object() {
        int anInt;
        int AnInt;
        int ANINT;
    };

    enum Enum {
        enumE;

        int anInt;
        int AnInt;
        int ANINT;
    }
}
