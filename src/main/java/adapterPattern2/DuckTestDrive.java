package adapterPattern2;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("칠면조는...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\n오리는...");
        duck.quack();
        duck.fly();
        System.out.println("\n칠면조어탭터는..");
        turkeyAdapter.quack();
        turkeyAdapter.fly();

        testDuck(turkeyAdapter);
        System.out.println("\n오리는..");
        testDuck(duck);
    }


    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
