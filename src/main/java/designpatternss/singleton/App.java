package main.java.designpatternss.singleton;
public class App {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            Singleton singleton = Singleton.getSingleton();

        }
    }
}

