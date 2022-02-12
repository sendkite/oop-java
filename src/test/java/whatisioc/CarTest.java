package whatisioc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("한국 타이어 장착 테스트")
    public void testTire() {
        Tire tire = new KoreaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어: 한국 타이어", car.getTireBrand());

    }

    @Test
    @DisplayName("미국 타이어 장착 테스트")
    public void testTire2() {
        Tire tire = new AmericaTire();
        Car car = new Car(tire);

        assertEquals("장착된 타이어: 미국 타이어!", car.getTireBrand());

    }

}