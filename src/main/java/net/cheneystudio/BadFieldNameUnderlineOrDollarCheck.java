package net.cheneystudio;

/**
 * Create on 2019-07-11 17:08
 *
 * @author Cheney Wong
 */
public class BadFieldNameUnderlineOrDollarCheck {
    int anInt;
    int _anInt;
    int anInt_;
    int $anInt;
    int anInt$;

    enum Enum {
        enumE;
        int anInt;
        int _anInt;
        int anInt_;
        int $anInt;
        int anInt$;
    }

    interface Interface {
        int anInt = 0;
        int _anInt = 0;
        int anInt_ = 0;
        int $anInt = 0;
        int anInt$ = 0;
    }

    @interface Annotation {
        int anInt = 0;
        int _anInt = 0;
        int anInt_ = 0;
        int $anInt = 0;
        int anInt$ = 0;
    }
}
