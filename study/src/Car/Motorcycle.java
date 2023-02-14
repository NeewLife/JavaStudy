package Car;

public class Motorcycle extends Car{
    boolean isSeatEmpty;         // 빈 차인지 체크하기 위한 변수

    public Motorcycle(String name, int passenger, int gas, int distanceLeft, Tire[] wheels, int speed, int moveDistance
                      , int totalSeat) {
        super(name, passenger, gas, distanceLeft, wheels, speed, moveDistance,totalSeat);
        this.totalSeat = 2;
        this.isSeatEmpty = true;
    }

    public void booster(){
        this.speed *= 1.5;
        this.move();
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
        System.out.println(stopoverPassenger + "명이 하차합니다");
        this.passenger -= stopoverPassenger;
        this.seatLeft += stopoverPassenger;
        System.out.println("현재 승객 : " + this.passenger + " 명");
        System.out.println("남은 좌석 : " + this.seatLeft);
        System.out.println("뒷좌석 인원이 내립니다.");
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
