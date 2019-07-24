package net.cheneystudio.naming;

import java.io.Closeable;
import java.io.IOException;

/**
 * Create on 2019-07-17 18:28
 *
 * @author Cheney Wong
 */
public class BadLocalVariableNameNonLowerCamelCase {
    static {
        int anInt;
        int AnInt;
        int ANINT;
    }

    static {
        for (int anInt = 0; anInt < Integer.SIZE; anInt++) {
        }

        for (int AnInt = 0; AnInt < Integer.SIZE; AnInt++) {
        }
    }

    static {
        int[] intArray = new int[0];

        for (int anInt : intArray.clone()) {
        }

        for (int AnInt : intArray.clone()) {
        }
    }

    static {
        try (Closeable closeable = () -> {
            int anInt;
        }) {
        } catch (IOException e) {
        }

        try (Closeable Closeable = () -> {
            int AnInt;
        }) {
        } catch (IOException E) {
        }
    }

    Closeable closeable = () -> {
        int anInt;
    };

    Closeable Closeable = () -> {
        int AnInt;
    };

    void methodCompliant(int anInt) {
        int anotherInt = anInt;
    }

    void methodNoncompliant(int AnInt) {
        int AnotherInt = AnInt;
    }

    void methodFor() {
        for (int anInt = 0; anInt < Integer.SIZE; anInt++) {
        }

        for (int AnInt = 0; AnInt < Integer.SIZE; AnInt++) {
        }
    }

    void methodForeach() {
        int[] intArray = new int[0];

        for (int anInt : intArray.clone()) {
        }

        for (int AnInt : intArray.clone()) {
        }
    }

    void methodTryCatch() {
        try (Closeable closeable = () -> {
            int anInt;
        }) {
        } catch (IOException e) {
        }

        try (Closeable Closeable = () -> {
            int AnInt;
        }) {
        } catch (IOException E) {
        }
    }
}
