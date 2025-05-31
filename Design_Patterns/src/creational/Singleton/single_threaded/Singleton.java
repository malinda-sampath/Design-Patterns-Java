package creational.Singleton.single_threaded;

public class Singleton {
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        System.out.println("Singleton is Initiated.");
        this.value=value;
    }

    public static Singleton getInstance(String value){
        if( instance==null ){
            instance = new Singleton(value);
        }
        return instance;
    }
}
