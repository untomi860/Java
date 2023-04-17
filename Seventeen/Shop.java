public class Shop extends Colleague {
    
    public Shop(Mediator mediator) {
        super(mediator);
    }
    
    public void sellKetchup(String message) {
        System.out.println(this.getClass().getName() + " sold " + message);
    }
}
