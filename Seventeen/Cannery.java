public class Cannery extends Colleague {
    
    public Cannery(Mediator mediator) {
        super(mediator);
    }
    
    public void makeKetchup(String message) {
        String ketchup = message + "Ketchup";
        System.out.println(this.getClass().getName() + " produced " + ketchup);
        mediator.Send(ketchup, this);
    }
}
