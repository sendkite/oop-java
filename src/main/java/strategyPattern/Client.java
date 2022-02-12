package strategyPattern;

public class Client {
    public static void main(String[] args) {
        // 클라이언트가 전략을 생성해서 실행할 컨텍스트에 주입하는 패턴
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 화살
        strategy = new StrategyBow();
        rambo.runContext(strategy);
        // 총
        strategy = new StrategyGun();
        rambo.runContext(strategy);
        // 칼
        strategy = new StrategySword();
        rambo.runContext(strategy);
    }
}
