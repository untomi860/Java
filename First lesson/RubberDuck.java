public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehaivor = new FlyNoWay();
    }
    public void quack(){
        System.out.println("Pi-Pi-Pi");
    }
    public void display() {
        System.out.println("I Rubber Duck");
    }
    
}
