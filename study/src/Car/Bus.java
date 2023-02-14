package Car;

import java.util.Arrays;

public class Bus extends Car{
    // Bus만의 변수
    int money;

    // 생성자
    public Bus(String name, int passenger, int gas, int distanceLeft, Tire[] wheels, int speed, int moveDistance
              , int totalSeat) {
        super(name, passenger, gas, distanceLeft, wheels, speed, moveDistance, totalSeat);
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
    public void boarding( int boardingPassenger){
        System.out.println("기존 승객 : " + this.passenger + " 명");
        int overPassenger = boardingPassenger - this.seatLeft;
        if (overPassenger > 0){
            System.out.println("탑승 승객이 " + overPassenger + "명 초과합니다.");
            System.out.println("탑승 가능 인원 = " + this.seatLeft + "명 탑승합니다.");
            this.money += 1500 * this.seatLeft;      // 탑승할 때 받을 금액 = 탑승할 인원 * 1500원
            System.out.println("현재 금액 : " + this.money + "(+" +  1500*this.seatLeft + ")");
            this.passenger += this.seatLeft;
            this.seatLeft -= this.seatLeft;
            System.out.println("탑승 인원 : " + this.seatLeft + " 명");
            System.out.println("현재 승객 : " + this.passenger + " 명");
            System.out.println("남은 좌석 : " + this.seatLeft);
            return;                                  // 밸리데이션 할 때 else로 실행보단 if문 안에서 return 으로 끝내기
        }
        this.passenger += boardingPassenger;
        this.seatLeft -= boardingPassenger;
        System.out.println("탑승 인원 : " + boardingPassenger + " 명");
        System.out.println("현재 승객 : " + this.passenger + " 명");
        System.out.println("남은 좌석 : " + this.seatLeft);
        this.money += 1500 * boardingPassenger;      // 탑승할 때 받을 금액 = 탑승할 인원 * 1500원
    }

    @Override
    public void stopover (int stopoverPassenger){
        if (this.passenger <= 0) {
            System.out.println("현재 탑승한 승객이 모두 내립니다.");
            System.out.println(this.passenger + "명이 하차합니다");
            this.passenger -= this.passenger;
            this.seatLeft += this.passenger;
            System.out.println("현재 승객 : " + this.passenger + " 명");
            System.out.println("남은 좌석 : " + this.seatLeft);
            return;
        }
        System.out.println(stopoverPassenger + "명이 하차합니다");
        this.passenger -= stopoverPassenger;
        this.seatLeft += stopoverPassenger;
        System.out.println("현재 승객 : " + this.passenger + " 명");
        System.out.println("남은 좌석 : " + this.seatLeft);
    }

    @Override
    public String toString() {
        return "=====================" +
                "\nBus" +
                "\nmoveDistance=" + moveDistance +
                "\nspeed=" + speed +
                "\nwheels=" + Arrays.toString(wheels) +
                "\nmoney=" + money +
                "\ndistanceLeft=" + distanceLeft +
                "\nname='" + name + '\'' +
                "\npassenger=" + passenger +
                "\ngas=" + gas +
                "\ntotalSeat=" + totalSeat +
                "\nseatLeft=" + seatLeft;
    }
}
