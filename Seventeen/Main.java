public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        Farmer farmer = new Farmer(mediator);
        Cannery cannery = new Cannery(mediator);
        Shop shop = new Shop(mediator);
    mediator.setFarmer(farmer);
    mediator.setCannery(cannery);
    mediator.setShop(shop);
    farmer.growTomato();
    }
}