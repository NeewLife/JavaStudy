package Car;

import java.util.Arrays;

public class Taxi extends Car{
    int totalSeat = 4;
    boolean isSeatEmpty = true;         // 빈 차인지 체크하기 위한 변수

    public Taxi(String name, int passenger, int gas, int distanceLeft, Tire[] wheels) {
        this.name = name;
        this.passenger = passenger;
        this.gas = gas;
        this.distanceLeft = distanceLeft;
        this.seatLeft = totalSeat - passenger;
        this.wheels = wheels;
    }

    @Override
    public void boarding ( int boardingPassenger){      // 택시는 뒷좌석에 몇명 탈지, 빈 차인지 확인하는 과정
        if (!this.isSeatEmpty){
            System.out.println("이미 고객이 탑승중입니다.");
            return;
        }
        this.isSeatEmpty = false;
        super.boarding(boardingPassenger);
    }

    @Override
    public void stopover (int stopoverPassenger){
        if (!this.isSeatEmpty){
            this.isSeatEmpty = true;
            this.passenger = 0;
            this.seatLeft = this.totalSeat;
            System.out.println("고객이 모두 내립니다.");
            System.out.println("현재 좌석수 : " + this.seatLeft);
        }else {
            System.out.println("이미 빈 좌석입니다.");
        }
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "totalSeat=" + totalSeat +
                ", isSeatEmpty=" + isSeatEmpty +
                ", moveDistance=" + moveDistance +
                ", wheels=" + Arrays.toString(wheels) +
                ", money=" + money +
                ", name='" + name + '\'' +
                '}';
    }
}
