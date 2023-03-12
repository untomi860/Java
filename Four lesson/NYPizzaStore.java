public class NYPizzaStore extends PizzaStore {

    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }else if (type.equals("vegan")){
             return new NYStyleVeganPizza();
        }
        else {
            return null;
        }
    }
}