package net.cheneystudio.naming;

/**
 * Create on 2019-07-18 17:22
 *
 * @author Cheney Wong
 */
public class BadTestClassName {
    @interface AnnotationCompliant {
    }

    @org.junit.jupiter.api.Test
    @interface AnnotationA {
    }

    @org.junit.jupiter.api.Test
    @interface AnnotationATest {

    }

    class ClassCompliant {
    }

    @org.testng.annotations.Test
    class ClassA {
    }

    @org.testng.annotations.Test
    class ClassATest {
    }

    class ClassB {
        @org.junit.Test
        public void test() {
        }
    }

    class ClassBTest {
        @org.junit.Test
        public void test() {
        }
    }

    class ClassC {
        @org.junit.jupiter.api.Test
        public void test() {
        }
    }

    class ClassCTest {
        @org.junit.jupiter.api.Test
        public void test() {
        }
    }

    class ClassD {
        @org.testng.annotations.Test
        public void test() {
        }
    }

    class ClassDTest {
        @org.testng.annotations.Test
        public void test() {
        }
    }
}
