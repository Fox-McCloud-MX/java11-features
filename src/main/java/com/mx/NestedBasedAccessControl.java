package com.mx;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NestedBasedAccessControl {
    public void myPublic() {
    }

    private void myPrivate() {
    }

    class Nested {

        public void nestedPublic() {
            myPrivate();
        }
    }

    public static void main(String[] args)  throws NoSuchMethodException,
                                                    InvocationTargetException,
                                                    IllegalAccessException {

        //private method of the main class is accessible from
        // the above-nested class in the above manner.
        //But if we use Java Reflection, it will give an IllegalStateException.
        NestedBasedAccessControl nestedBasedAccessControl = new NestedBasedAccessControl();
        Method method = nestedBasedAccessControl.getClass().getDeclaredMethod("myPrivate");
        method.invoke(nestedBasedAccessControl); //IllegalStateException.
    }
}
