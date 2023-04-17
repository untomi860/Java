public class ConcreteMediator extends Mediator {
    
    private Farmer farmer;
    private Cannery cannery;
    private Shop shop;
    
    public void setFarmer(Farmer farmer) {
        this.farmer = farmer;
    }
    
    public void setCannery(Cannery cannery) {
        this.cannery = cannery;
    }
    
    public void setShop(Shop shop) {
        this.shop = shop;
    }
    
    
    public void Send(String message, Colleague colleague) {
        if (colleague == farmer) {
            cannery.makeKetchup(message);
        } else if (colleague == cannery) {
            shop.sellKetchup(message);
        }
    }
}
