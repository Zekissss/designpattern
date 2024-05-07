package main.java.designpatternss.singleton;

/**
 * llll
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private static int zahl = 0;
    private Singleton() {
        System.out.println("Ich bin Singleton Pattern!");

    }
    public static Singleton getSingleton() {

        zahl++;
        System.out.println(zahl);
        return singleton;
    }
}
