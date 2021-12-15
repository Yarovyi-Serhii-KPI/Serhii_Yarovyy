package test;

import http_requests.setter;
import http_requests.getter;
import http_requests.deleter;

public class Demo {

    public static void main(String[] args) {
        setter mySetter = new setter();
        getter myGetter = new getter();
        deleter myDeleter = new deleter();
        mySetter.setterTest();
        myGetter.getterTest();
        myDeleter.deleterTest();
    }
}