package org.annotations;

public @interface MyAnnotation {
enum Device{
    LAPTOP,MOBILE,TV
}

    /*
    * elements are abstract and public by default
    * var are public static final by default like interface
    *
    * */

//    int startTime() default 100;
//    int stopTime();
//    int STOP_IN_TIME=900;
//    String name() default "Deep";
    Device consume() default Device.LAPTOP;
}