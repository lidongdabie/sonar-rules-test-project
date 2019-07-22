package net.cheneystudio.naming;

/**
 * Create on 2019-07-22 11:04
 *
 * @author Cheney Wong
 */
public class BadBooleanFieldName {
    boolean compliantA;
    boolean isNoncompliantA;
    Boolean compliantB;
    Boolean isNoncompliantB;

    Object object = new Object() {
        boolean compliantA;
        boolean isNoncompliantA;
        Boolean compliantB;
        Boolean isNoncompliantB;
    };

    enum Enum {
        enumE;

        boolean compliantA;
        boolean isNoncompliantA;
        Boolean compliantB;
        Boolean isNoncompliantB;
    }
}
