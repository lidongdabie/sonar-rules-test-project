package net.cheneystudio.constant;

/**
 * Create on 2019-07-22 17:13
 *
 * @author Cheney Wong
 */
public class LongSuffix {
    static {
        long longCompliantA = 100L;
        Long longCompliantB = 100L;
        long longNoncompliantA = 100l;
        Long longNoncompliantB = 100l;
    }

    long longCompliantA = 100L;
    Long longCompliantB = 100L;
    long longNoncompliantA = 100l;
    Long longNoncompliantB = 100l;

    long methodA() {
        return 100L +
                100l;
    }

    void methodB() {
        for (long aLong = 0L; aLong < Integer.SIZE; aLong++) {
        }
    }

    void methodC() {
        for (long aLong = 0l; aLong < Integer.SIZE; aLong++) {
        }
    }

    interface MyInterface {
        long longCompliantA = 100L;
        Long longCompliantB = 100L;
        long longNoncompliantA = 100l;
        Long longNoncompliantB = 100l;
    }
}
