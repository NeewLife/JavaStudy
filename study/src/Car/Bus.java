package Car;

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
            System.out.println("탑승 가능 인원 = " + (totalSeat - this.passenger) + "명 탑승합니다.");
            this.passenger = totalSeat;
            return;
                    // 초과인원 = 현재승객 + 탑승승객 - 원래자리수
                    // 현재승객 = 초과인원 + 원래자리수 - 탑승승객
                // 밸리데이션 할 때 else로 실행보단 if문 안에서 return 으로 끝내기
        }
        super.boarding(boardingPassenger);

    }


}
