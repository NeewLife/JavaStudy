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
        if (boardingPassenger > this.seatLeft){
            System.out.println("탑승가능인원 초과");
            return;
        }
        super.boarding(boardingPassenger);
    }

    @Override
    public void stopover (int stopoverPassenger){
        if (!this.isSeatEmpty){
            this.isSeatEmpty = true;
            super.stopover(this.passenger);
            this.money += ( 10 * this.moveDistance ) + 4500;    // 하차할 때 요금지불 = 거리당 10원 + 기본요금
            System.out.println("현재 금액 : " + this.money + "(+" +  ( 10 * this.moveDistance + 4500)  + ")");
            return;
        }
        System.out.println("이미 빈 좌석입니다.");

    }

    @Override
    public String toString() {
        return "=====================" +
                "\nTaxi" +
                "\ntotalSeat=" + totalSeat +
                "\nisSeatEmpty=" + isSeatEmpty +
                "\nmoveDistance=" + moveDistance +
                "\nspeed=" + speed +
                "\nwheels=" + Arrays.toString(wheels) +
                "\nmoney=" + money +
                "\ndistanceLeft=" + distanceLeft +
                "\nname='" + name + '\'' +
                "\npassenger=" + passenger +
                "\ngas=" + gas +
                "\ntotalSeat=" + totalSeat +
                "\nseatLeft=" + seatLeft ;
    }
}
