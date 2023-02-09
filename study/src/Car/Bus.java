package Car;

import java.util.Arrays;

public class Bus extends Car{
    public Bus(String name, int passenger, int gas, int distanceLeft, int totalSeat, Tire[] wheels) {
        this.name = name;
        this.passenger = passenger;
        this.gas = gas;
        this.distanceLeft = distanceLeft;
        this.totalSeat = totalSeat;
        this.seatLeft = totalSeat - passenger;
        this.wheels = wheels;
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
            super.boarding(this.seatLeft);
            return;                                  // 밸리데이션 할 때 else로 실행보단 if문 안에서 return 으로 끝내기

        }
        super.boarding(boardingPassenger);
        this.money += 1500 * boardingPassenger;      // 탑승할 때 받을 금액 = 탑승할 인원 * 1500원
    }

    @Override
    public void stopover (int stopoverPassenger){
        if (this.passenger <= 0) {
            System.out.println("현재 탑승한 승객이 모두 내립니다.");
            super.stopover(this.passenger);
            return;
        }
        super.stopover(stopoverPassenger);
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
