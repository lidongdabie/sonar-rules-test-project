package net.cheneystudio.naming;

/**
 * Create on 2019-07-11 17:08
 *
 * @author Cheney Wong
 */
public class BadFieldNameUnderlineOrDollar {
    int anInt;
    int _anInt;
    int anInt_;
    int $anInt;
    int anInt$;

    Object object = new Object() {
        int anInt;
        int _anInt;
        int anInt_;
        int $anInt;
        int anInt$;
    };

    enum Enum {
        enumE;

        int anInt;
        int _anInt;
        int anInt_;
        int $anInt;
        int anInt$;
    }
}
