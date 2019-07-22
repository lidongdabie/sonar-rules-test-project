package net.cheneystudio.naming;

/**
 * Create on 2019-07-16 13:52
 *
 * @author Cheney Wong
 */
public class BadConstantNameUnderlineOrDollar {
    enum Enum {
        enumE,
        _enumE,
        enumE_,
        $enumE,
        enumE$
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
