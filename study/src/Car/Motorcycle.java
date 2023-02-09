package Car;

public class Motorcycle extends Car{
    boolean isSeatEmpty = true;         // 빈 차인지 체크하기 위한 변수

    public Motorcycle(String name, int passenger, int gas, int distanceLeft, int totalSeat, Tire[] wheels) {
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
        // 좌석이 비었는가?
        if ( !this.isSeatEmpty ) {
            System.out.println("뒷좌석에 이미 사람이 탑승중입니다.");
            return;
        }

        // 자리수보다 많이 탑승하는가?
        if ( boardingPassenger > this.seatLeft ) {
            System.out.println("탑승가능인원 초과");
            return;
        }
        this.isSeatEmpty = false;
        super.boarding(boardingPassenger);

    }

    @Override
    public void stopover (int stopoverPassenger){
        if (!this.isSeatEmpty){
            this.isSeatEmpty = true;
            super.stopover(stopoverPassenger);
            System.out.println("뒷좌석 인원이 내립니다.");
            return;
        }
        System.out.println("이미 빈 좌석입니다.");

    }

    @Override
    public String toString() {
        return  "=====================" +
                "\nMotorcycle" +
                "\nisSeatEmpty=" + isSeatEmpty +
                "\nmoveDistance=" + moveDistance +
                "\nspeed=" + speed +
                "\ndistanceLeft=" + distanceLeft +
                "\nname='" + name + '\'' +
                "\ngas=" + gas +
                "\nseatLeft=" + seatLeft;
    }
}
