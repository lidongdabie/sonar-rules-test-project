package net.cheneystudio.naming;

import java.io.Closeable;
import java.io.IOException;

/**
 * Create on 2019-07-15 15:18
 *
 * @author Cheney Wong
 */
public class BadLocalVariableNameUnderlineOrDollar {
    static {
        int anInt;
        int _anInt;
        int anInt_;
        int $anInt;
        int anInt$;
    }

    static {
        for (
                int anInt = 0;
                anInt < Integer.SIZE;
                anInt++
        ) {
        }

        for (
                int _anInt = 0;
                _anInt < Integer.SIZE;
                _anInt++
        ) {
        }
    }

    static {
        int[] intArray = new int[0];

        for (
                int anInt :
                intArray.clone()
        ) {
        }

        for (
                int _anInt :
                intArray.clone()
        ) {
        }
    }

    static {
        try (
                Closeable closeable =
                        () -> {
                            int anInt;
                        }
        ) {
        } catch (
                IOException e
        ) {
        }

        try (
                Closeable _closeable =
                        () -> {
                            int _anInt;
                        }
        ) {
        } catch (
                IOException _e
        ) {
        }
    }

    Closeable closeable =
            () -> {
                int anInt;
            };

    Closeable _closeable =
            () -> {
                int _anInt;
            };

    void methodCompliant(
            int anInt
    ) {
        int anotherInt =
                anInt;
    }

    void methodNoncompliant1(
            int _anInt
    ) {
        int _anotherInt =
                _anInt;
    }

    void methodNoncompliant2(
            int anInt_
    ) {
        int anotherInt_ =
                anInt_;
    }

    void methodNoncompliant3(
            int $anInt
    ) {
        int $anotherInt =
                $anInt;
    }

    void methodNoncompliant4(
            int anInt$
    ) {
        int anotherInt$ =
                anInt$;
    }

    void methodFor() {
        for (
                int anInt = 0;
                anInt < Integer.SIZE;
                anInt++
        ) {
        }

        for (
                int _anInt = 0;
                _anInt < Integer.SIZE;
                _anInt++
        ) {
        }
    }

    void methodForeach() {
        int[] intArray = new int[0];

        for (
                int anInt :
                intArray.clone()
        ) {
        }

        for (
                int _anInt :
                intArray.clone()
        ) {
        }
    }

    void methodTryCatch() {
        try (
                Closeable closeable =
                        () -> {
                            int anInt;
                        }
        ) {
        } catch (
                IOException e
        ) {
        }

        try (
                Closeable _closeable =
                        () -> {
                            int _anInt;
                        }
        ) {
        } catch (
                IOException _e
        ) {
        }
    }
}
