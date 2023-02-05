package designpatterns;

class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }
}

public class SingletonDesignPattern {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton instance = Singleton.getInstance();
        System.out.println(singleton.hashCode());
        System.out.println(instance.hashCode());
    }
}
