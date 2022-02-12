package whatisioc2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import whatisioc.AmericaTire;
import whatisioc.KoreaTire;
import whatisioc.Tire;

import static org.junit.jupiter.api.Assertions.*;

class Car2Test {
    @Test
    @DisplayName("한국 타이어 장착")
    public void tireTest() {
        Tire tire1 = new KoreaTire();
        Car2 car1 = new Car2();
        car1.setTire(tire1);

        assertEquals("장착된 타이어: 한국 타이어", car1.getTireBrand());
    }

    @Test
    @DisplayName("미국 타이어 장착")
    public void tireTest2() {
        Tire tire2 = new AmericaTire();
        Car2 car2 = new Car2();
        car2.setTire(tire2);

        assertEquals("장착된 타이어: 미국 타이어!", car2.getTireBrand());
    }

}