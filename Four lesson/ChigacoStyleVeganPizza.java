public class ChigacoStyleVeganPizza extends Pizza {
    public ChigacoStyleVeganPizza() {
        name = "chicago style Vegan Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("tomatos");
    }
    void cut() {
        System.out.println("cutting the pizza into square slices");
    }
}