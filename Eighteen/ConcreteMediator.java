public class ConcreteMediator extends Mediator {
    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    public void Send(String msg, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notify(msg);
        } else {
            colleague1.notify(msg);
        }
    }
}
