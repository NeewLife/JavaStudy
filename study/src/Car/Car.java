package Car;

public class Car {
    int moveDistance ;
    int speed;
    Tire[] wheels;
    int money;
    int distanceLeft;
    String name;
    int passenger;
    int gas;
    int totalSeat;
    int seatLeft;


    public int getDistanceLeft() {
        return distanceLeft;
    }

    public int getPassenger() {
        return passenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public int getseatLeft() {
        return seatLeft;
    }

    public void setseatLeft(int seatLeft) {
        this.seatLeft = seatLeft;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }





    public void increaseSpeed ( int speed){
        this.speed += speed;
        System.out.println("현재 속도 : " + this.speed + " km/h");
    }
    public void decreaseSpeed (int speed){
        this.speed -= speed;
        if(this.speed != 0){
            System.out.println("현재 속도 : " + this.speed + " km/h");
        }
    }

    public int move(){
        int i = 0;
        while (i < this.wheels.length){
                boolean change = wheels[i].isTireChange((int)(this.speed*0.3));
                wheels[i].showDurability(i);
                if (change){
                    System.out.println(wheels[i]);
                    wheels[i] = new Tire(100);
                    System.out.println(wheels[i]);
                    System.out.println(i + "번째 타이어 교체완료");
                }
                i++;
        }

//        if( <= 0){
//            System.out.println("바퀴의 내구도가 부족합니다..");
//            System.out.println("카센타로 이동합니다.");
//        }
        this.gas -= this.speed*0.3;
        this.moveDistance += this.speed;
        this.distanceLeft -= this.speed;
        if (this.distanceLeft < 0){
            this.distanceLeft = 0;

        }
        System.out.println("남은 거리 : " + this.distanceLeft + "km");
        System.out.println("Gas 잔량 : " + this.gas + "%");
        if (this.gas<10){
            System.out.println("기름이 모자랍니다");
            System.out.println("남은 거리 : " + this.distanceLeft + "km");
            System.out.println("Gas 잔량 : " + this.gas);
            System.out.println("=============================");
            System.out.println("주유소로 이동합니다.");
            System.out.println("'가득이요'");
            this.gas = 100;
            System.out.println("주유소에서 나옵니다.");
            System.out.println("Gas 잔량 : " + this.gas + "%");
        }

        return this.distanceLeft;
    }

    public void boarding ( int boardingPassenger){
            this.passenger += boardingPassenger;
            this.seatLeft -= boardingPassenger;
            System.out.println("탑승 인원 : " + boardingPassenger + " 명");
            System.out.println("현재 승객 : " + this.passenger + " 명");
            System.out.println("남은 좌석 : " + this.seatLeft);
            System.out.println("현재 돈 : " + this.money + "원");
    }

    public void stopover (int stopoverPassenger){
//        if (this.passenger <= 0) {
//            System.out.println("내릴 승객이 없습니다");
//        } else if (this.passenger - stopoverPassenger < 0) {
//            System.out.println(this.passenger + "명이 하차합니다");
//            this.passenger = 0;
//            this.seatLeft = totalSeat;
//            System.out.println("현재 승객 : " + this.passenger + " 명");
//            System.out.println("남은 좌석 : " + this.seatLeft);
//        } else{
            System.out.println(stopoverPassenger + "명이 하차합니다");
            this.passenger -= stopoverPassenger;
            this.seatLeft += stopoverPassenger;
            System.out.println("현재 승객 : " + this.passenger + " 명");
            System.out.println("남은 좌석 : " + this.seatLeft);
//        }

    }

}
