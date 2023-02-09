package static_vs_final;

public class Earth {
    static boolean water = true;
    final String nation = "한국";
    final int newborn = 100000;
    static final int POPULATION = 70000000;

    void birth(int x){
        int a = newborn + x;
    }
    static void tax (){
    }
}
