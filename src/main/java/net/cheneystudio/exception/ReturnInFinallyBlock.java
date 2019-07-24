package net.cheneystudio.exception;

/**
 * Create on 2019-07-24 14:16
 *
 * @author Cheney Wong
 */
public class ReturnInFinallyBlock {
    void methodA() {
        return;
    }

    int methodB() {
        try {
            return -1;
        } catch (Exception e) {
            return 0;
        } finally {
            return 1;
        }
    }

    void methodC() {
        try {
            return;
        } finally {
            try {
                return;
            } catch (Exception e) {
                return;
            } finally {
                return;
            }
        }
    }

    void methodD() {
        try {
            return;
        } finally {
            try {
                return;
            } finally {
                try {
                    return;
                } catch (Exception e) {
                    return;
                } finally {
                    return;
                }
            }
        }
    }

    void methodF() {
        try {
            return;
        } finally {
            new Object() {
                void innerMethod() {
                    return;
                }
            };
        }
    }
}
