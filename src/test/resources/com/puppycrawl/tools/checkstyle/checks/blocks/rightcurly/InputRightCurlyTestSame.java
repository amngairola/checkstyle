/*
RightCurly
option = (default)same
tokens = (default)LITERAL_TRY, LITERAL_CATCH, LITERAL_FINALLY, LITERAL_IF, LITERAL_ELSE


*/

package com.puppycrawl.tools.checkstyle.checks.blocks.rightcurly;

/*
 * Config:
 * option = same
 * tokens = { LITERAL_DO, LITERAL_FOR, LITERAL_WHILE, STATIC_INIT, INSTANCE_INIT,
 * CLASS_DEF, METHOD_DEF, CTOR_DEF, ANNOTATION_DEF, ENUM_DEF, INTERFACE_DEF }
 */
public class InputRightCurlyTestSame {
    static {
    }

    public InputRightCurlyTestSame() {
        Thread t = new Thread(new Runnable() {
            {
            }

            @Override
            public void run() {
            }
        }); // ok
    }

    public void doLoop() {
        do {
        } while (true);
    }

    public void whileLoop() {
        while (true) {
        }
    }

    public void forLoop() {
        for (; ; ) {
        }
    }

    public void function() {
    }

    ;

    public class TestClass {
    }

    ;

    public void testMethod() {
    }

    ;

    public @interface TestAnnotation {
    }

    public @interface TestAnnotation1 {
        String someValue();
    }

    public @interface TestAnnotation3 {
        String someValue();
    }

    public @interface TestAnnotation4 {
        String someValue();
    }
}