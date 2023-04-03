
public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        
        simulator.simulate(duckFactory);
    }
    
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.CreateMallardDuck();
        Quackable redheadDuck = duckFactory.CreateRedheadDuck();
        Quackable duckCall = duckFactory.CreateDuckCall();
        Quackable rubberDuck = duckFactory.CreateRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck Simulator");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) 
    {
        duck.quack();
    }
}
