public class Main {
    
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();
        mallard.fly();
        System.out.println("----------------------------");

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
        redhead.fly();
        System.out.println("----------------------------");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.swim();
        rubber.fly();
        System.out.println("----------------------------");

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.quack();
        decoy.swim();
        decoy.fly();
        System.out.println("----------------------------");
    }
}
