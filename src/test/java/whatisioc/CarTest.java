package whatisioc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("타이어 장착 테스트")
    public void testTire() {
        Car car = new Car();

        assertEquals("장착된 타이어: 한국 타이어", car.getTireBrand());

    }

}