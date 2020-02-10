package com.bsuir.lab1;

import javax.lang.model.SourceVersion;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Utils {

    boolean isValidName(String className) {
        try
        {
            Class.forName(className);
            return true;
        }
        catch(ClassNotFoundException ex)
        {
            return false;
        }
    }


    public String[] classMethods(String className) throws ClassNotFoundException {
        Method[] methods=Class.forName(className).getMethods();
        return Arrays.stream(methods)
                .map(m->m.getName())
                .toArray(String[]::new);
    }

}
