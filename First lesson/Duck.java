public abstract class Duck {
    protected FlyBehaivor Fly Behaivor;

    public void performFly() {
        flyBehaivor.fly();
    }

    public void quack() {
        System.out.println("quack-quack"); 
    }
    public void swim() {
        System.out.println("bul-bul");
    }
    
    public abstract void display();
}
