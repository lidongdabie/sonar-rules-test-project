package net.cheneystudio.naming;

import java.io.Serializable;

/**
 * Create on 2019-07-17 15:51
 *
 * @author Cheney Wong
 */
public class BadConstantNameNonUpperCase {
    class MySerializableClass implements Serializable {
        private static final long serialVersionUID = 0L;
    }

    enum Enum {
        ENUM_E,
        EnumE,
        enumE,
        enum_e
    }

    interface Interface {
        int AN_INT = 0;
        int AnInt = 0;
        int anInt = 0;
        int an_int = 0;
    }

    @interface Annotation {
        int AN_INT = 0;
        int AnInt = 0;
        int anInt = 0;
        int an_int = 0;
    }
}
