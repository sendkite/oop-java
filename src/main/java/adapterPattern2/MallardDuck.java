package adapterPattern2;

public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("꽥꽥!");
    }

    @Override
    public void fly() {
        System.out.println("오리 날아요~");
    }
}
