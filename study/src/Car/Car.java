package Car;

public abstract class Car {
    // 추상화한 공통 변수
    String name;
    int passenger;
    int gas;
    int distanceLeft;
    Tire[] wheels;
    int speed;
    int moveDistance ;
    int totalSeat;
    int seatLeft;

    public Car(String name, int passenger, int gas, int distanceLeft, Tire[] wheels, int speed, int moveDistance
              , int totalSeat){
        this.name = name;
        this.passenger = passenger;
        this.gas = gas;
        this.distanceLeft = distanceLeft;
        this.wheels = wheels;
        this.speed = speed;
        this.moveDistance = moveDistance;
        this.totalSeat = totalSeat;
        this.seatLeft = totalSeat - passenger;
    }

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

    protected void dcrWheelsDurability(int currentSpeed){
        int i = 0;
        while (i < this.wheels.length){
            boolean change = wheels[i].isTireChange((int)(currentSpeed*0.3));
            wheels[i].showDurability(i);
            if (change){
                System.out.println(wheels[i]);
                wheels[i] = new Tire(100);
                System.out.println(wheels[i]);
                System.out.println(i + "번째 타이어 교체완료");
            }
            i++;
        }
    }

    public void gasStation(){
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

    public abstract int move();

    /*
    코드의 길이적 관점이 아니라 중요도의 관점에서 차이가 크다.
    만약 boarding() 함수를 부모 클래스로 공통적으로 빼고 자식 클래스에서 상속받으면
    자식코드의 길이는 반복된걸 super로 호출 하면 되니까 자식코드는 줄어들겠지만 boarding() 메서드의 중요도가 굉장히 떨어지게 된다.
    지금은 예제의 크기가 작아서 중요도를 판별하기 힘들지만
    boarding()은 Car의 필수요소인데 gasStation() 은 어찌보면 필수적이지 않을수도 있다고 칠 때,
    boarding()과 gasStation()의 중요도가 동급이 되어버린다. 현실은 boarding()이 훨씬 중요한데.
    그걸 막기위해서 boarding()을 추상 메서드로 지정하고
    귀찮더라도, 길더라도 자식코드에 하나하나 원래 boarding() 메서드의 코드 추가해야됨
    stopover() 도 마찬가지다.
    */
    public abstract void boarding ( int boardingPassenger);

    public abstract void stopover (int stopoverPassenger);
}