package Car;

import java.util.Arrays;

public class Tire {
    private int durability;

    public Tire(int durability){
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    public boolean isTireChange(int durability) {
        this.durability -= durability;
        System.out.println("바퀴의 내구도가 " + durability + "만큼 감소했습니다.");
        if(this.durability <= 0){
            this.durability = 0;
            System.out.println("바퀴의 내구도가 전부 닳았습니다.");
            return true;
        }
        return false;
    }

    // run

    public void showDurability(int durability){
        System.out.println(durability + "번 바퀴 내구도 : " + this.durability);
    }

}
