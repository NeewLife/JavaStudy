package Car;

import java.util.Arrays;

public class Taxi extends Car{
    int money;
    boolean isSeatEmpty;         // 빈 차인지 체크하기 위한 변수

    public Taxi(String name, int passenger, int gas, int distanceLeft, Tire[] wheels, int speed, int moveDistance
                , int totalSeat) {
        super(name, passenger, gas, distanceLeft, wheels, speed, moveDistance, totalSeat);
        this.totalSeat = 4;
        this.isSeatEmpty = true;
        this.money = 0;
    }

    @Override
    public int move(){
        dcrWheelsDurability(this.speed);
        this.gas -= this.speed*0.3;                     // gas를 밖으로 빼버리면 gas소모가 '선택' 사항이 되어버림
        this.moveDistance += this.speed;                // gasStation() 같은 경우는 선택이지만 gas소모는 필수적 요소
        this.distanceLeft -= this.speed;
        if (this.distanceLeft < 0){
            this.distanceLeft = 0;
        }
        if (this.gas < 10 ){
            gasStation();
        }
        System.out.println("남은 거리 : " + this.distanceLeft + "km");
        System.out.println("Gas 잔량 : " + this.gas + "%");
        return this.distanceLeft;
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
        this.passenger += boardingPassenger;
        this.seatLeft -= boardingPassenger;
        System.out.println("탑승 인원 : " + boardingPassenger + " 명");
        System.out.println("현재 승객 : " + this.passenger + " 명");
        System.out.println("남은 좌석 : " + this.seatLeft);
    }

    @Override
    public void stopover (int stopoverPassenger){
        if (this.isSeatEmpty){
            System.out.println("이미 빈 좌석입니다.");
            return;
        }
        this.isSeatEmpty = true;
        System.out.println(this.passenger + "명이 하차합니다");
        this.passenger -= this.passenger;
        this.seatLeft += this.passenger;
        System.out.println("현재 승객 : " + this.passenger + " 명");
        System.out.println("남은 좌석 : " + this.seatLeft);
        this.money += ( 10 * this.moveDistance ) + 4500;    // 하차할 때 요금지불 = 거리당 10원 + 기본요금
        System.out.println("현재 금액 : " + this.money + "(+" +  ( 10 * this.moveDistance + 4500)  + ")");
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
