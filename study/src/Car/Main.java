package Car;

public class Main {

    public static void main(String[] args) {
        Tire[] twoWheels = { new Tire(95), new Tire(90)};
        Tire[] fourWheels = { new Tire(80), new Tire(100), new Tire(90), new Tire(45)};

        Bus bus = new Bus("17번 버스", 5, 90, 400, new Tire[] { new Tire(80), new Tire(100), new Tire(90), new Tire(45)},
                          0,0, 45);
        Taxi taxi = new Taxi("서울택시", 0, 100, 500, new Tire[] { new Tire(80), new Tire(100), new Tire(90), new Tire(45)},0,
                             0, 4);
        Motorcycle motorcycle = new Motorcycle("거북선", 0,100, 500, new Tire[] { new Tire(95), new Tire(90)},0, 0, 2);


        Car[] cars = {
                new Bus("17번 버스", 5, 90, 400, new Tire[] { new Tire(80), new Tire(100), new Tire(90), new Tire(45)},
                        0,0, 45),
                new Taxi("서울택시", 0, 100, 500, new Tire[] { new Tire(80), new Tire(100), new Tire(90), new Tire(45)},0,
                        0,4),
                new Motorcycle("거북선", 0,100, 500, new Tire[] { new Tire(95), new Tire(90)},0, 0, 2),
                new Motorcycle("호랑이", 0,100, 500, new Tire[] { new Tire(95), new Tire(90)},0, 0, 2)
        };

        for(int i = 0; i < cars.length; i++){
            cars[i].move();
            if (cars[i] instanceof Motorcycle motorcycle1){
                motorcycle1.booster();
                System.out.println(motorcycle1.name + "이(가) 부스터를 사용");
            }
        }

        // 버스
        bus.boarding(10);
        bus.increaseSpeed(30);
        while(bus.getGas()>0 && bus.getDistanceLeft()>0){
            bus.move();
            int ranNum1 = (int)(Math.random()*10);
            int ranNum2 = (int)(Math.random()*10);
            bus.boarding(ranNum1);
            bus.stopover(ranNum2);
        }

        bus.stopover(bus.getPassenger());
        System.out.println(bus.toString());

        // 택시
        taxi.boarding(3);           // 고객 탑승
        taxi.boarding(5);           // 고객 초과 탑승
        taxi.increaseSpeed(30);
        System.out.println(taxi.toString());
        while(taxi.getGas()>0 && taxi.getDistanceLeft()>0){     // 움직여보기
            taxi.move();
        }
        taxi.decreaseSpeed(30);
        taxi.stopover(taxi.passenger);                               // 고객 전부 하차
        taxi.stopover(4);                               // 빈 좌석인지 확인
        System.out.println(taxi.toString());

        // 오토바이
        motorcycle.boarding(1);           // 고객 탑승
        motorcycle.boarding(3);           // 고객 초과 탑승
        motorcycle.increaseSpeed(30);
        System.out.println(motorcycle.toString());
        while(motorcycle.getGas()>0 && motorcycle.getDistanceLeft()>0){     // 움직여보기
            motorcycle.move();
        }
        motorcycle.decreaseSpeed(30);
        motorcycle.stopover(1);                               // 고객 전부 하차
        motorcycle.stopover(3);                               // 빈 좌석인지 확인
        System.out.println(bus.toString());
        System.out.println(taxi.toString());
        System.out.println(motorcycle.toString());
    }
}