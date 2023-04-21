public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
    super(mediator);
    }
    public void send(String message) {
        mediator.Send(message, this);
    }
    
    public void notify(String message) {
        System.out.println(message);
    }
}    