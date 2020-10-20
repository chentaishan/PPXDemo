package com.example.libcommon;

import android.content.Context;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AppGlobals {

    private static Context context;

    public static Context getApplication() {
        try {

            Method method = Class.forName("android.app.ActivityThread").getDeclaredMethod("getApplication");
            Object invoke = method.invoke(null, null);

            return context = (Context) invoke;
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
