package JavaSingleton;

class Singleton{
    public String str;
    private static Singleton instance;

    private Singleton() {

    }

    static public Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}