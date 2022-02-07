package adapterPattern2;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("구억~구억~");
    }

    @Override
    public void fly() {
        System.out.println("칠면조라 짧게 날아요");
    }
}
