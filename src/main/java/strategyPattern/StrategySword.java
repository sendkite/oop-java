package strategyPattern;

public class StrategySword implements Strategy{
    @Override
    public void runStrategy() {
        System.out.println("칼");
    }
}
