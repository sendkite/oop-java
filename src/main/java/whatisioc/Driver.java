package whatisioc;

public class Driver {
    public static void main(String[] args) {
        // 드라이버가 Tire를 선택해서 Car에 주입하는 전략 패턴
        Tire tire = new KoreaTire();
        Car car = new Car(tire);
        System.out.println(car.getTireBrand());

    }
}
