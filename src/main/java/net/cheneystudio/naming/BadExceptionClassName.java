package net.cheneystudio.naming;

/**
 * Create on 2019-07-18 17:16
 *
 * @author Cheney Wong
 */
public class BadExceptionClassName {
    class MyException extends Exception {
    }

    class MyAnotherExceptionNoncompliant extends Exception {
    }
}
