package net.cheneystudio.naming;

/**
 * Create on 2019-07-16 14:27
 *
 * @author Cheney Wong
 */
public class BadClassNameUnderlineOrDollar {
    enum MyEnum {
    }

    enum _MyEnum {
    }

    enum MyEnum_ {
    }

    enum $MyEnum {
    }

    enum MyEnum$ {
    }

    interface MyInterface {
    }

    interface _MyInterface {
    }

    interface MyInterface_ {
    }

    interface $MyInterface {
    }

    interface MyInterface$ {
    }

    @interface MyAnnotation {
    }

    @interface _MyAnnotation {
    }

    @interface MyAnnotation_ {
    }

    @interface $MyAnnotation {
    }

    @interface MyAnnotation$ {
    }

    class MyClass {
    }

    class _MyClass {
    }

    class MyClass_ {
    }

    class $MyClass {
    }

    class MyClass$ {
    }
}
