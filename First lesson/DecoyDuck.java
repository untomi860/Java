public class DecoyDuck extends Duck {

    public DecoyDuck(){
        FlyBehaivor = new FlyNoWay();
    }
    public void quack(){
        System.out.println(" ");
    }
    public void display() {
        System.out.println("I decoy Duck");
    }
    
}