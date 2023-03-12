public class ChicagoPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new ChigacoStyleCheesePizza();
        }else if (type.equals("vegan")){
            return new ChigacoStyleVeganPizza();
        }
        else {
            return null;
        }
    }
}