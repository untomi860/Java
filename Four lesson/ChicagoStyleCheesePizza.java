public class ChigacoStyleCheesePizza extends Pizza {
    public ChigacoStyleCheesePizza() {
        name = "chicago style Deep  Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozarella Cheese");
    }
    void cut() {
        System.out.println("cutting the pizza into square slices");
    }
}