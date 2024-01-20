package lesson11.zoo;

import lesson11.zoo.cat.Cat;

public class Zoo  {
    public static <C extends Cat> void sayCatMeow(C cat){
        cat.say();
    }
}
