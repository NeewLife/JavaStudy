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
        if (!this.isSeatEmpty){
            System.out.println("뒷좌석에 이미 사람이 탑승중입니다.");
            return;
        }
        this.isSeatEmpty = false;
        super.boarding(boardingPassenger);
        System.out.println("오토바이 뒷좌석 탑승");

    }

    @Override
    public void stopover (int stopoverPassenger){
        if (!this.isSeatEmpty){
            this.isSeatEmpty = true;
            super.stopover(stopoverPassenger);
            System.out.println("뒷좌석 인원이 내립니다.");
        }else {
            System.out.println("이미 빈 좌석입니다.");
        }
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "isSeatEmpty=" + isSeatEmpty +
                ", moveDistance=" + moveDistance +
                ", speed=" + speed +
                ", distanceLeft=" + distanceLeft +
                ", name='" + name + '\'' +
                ", gas=" + gas +
                ", seatLeft=" + seatLeft +
                '}';
    }
}
