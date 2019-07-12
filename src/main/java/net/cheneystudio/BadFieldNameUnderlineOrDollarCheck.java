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
        enumE,
        _enumE, // Noncompliant {{重命名此属性"_enumE"以使其满足正则表达式'^(?<![_$])[a-zA-Z][a-zA-Z0-9]*(?![_$])$'。}}
        enumE_, // Noncompliant {{重命名此属性"enumE_"以使其满足正则表达式'^(?<![_$])[a-zA-Z][a-zA-Z0-9]*(?![_$])$'。}}
        $enumE, // Noncompliant {{重命名此属性"$enumE"以使其满足正则表达式'^(?<![_$])[a-zA-Z][a-zA-Z0-9]*(?![_$])$'。}}
        enumE$; // Noncompliant {{重命名此属性"enumE$"以使其满足正则表达式'^(?<![_$])[a-zA-Z][a-zA-Z0-9]*(?![_$])$'。}}

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
