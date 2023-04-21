public class Main {

    public static void main (String[] args)
    {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        CoffeeWithHook cw = new CoffeeWithHook();
        TeaWithHook tw = new TeaWithHook();

        System.out.println("------------------------");
        tea.prepareRecipe();

        System.out.println("------------------------");
        coffee.prepareRecipe();

        System.out.println("------------------------");
        cw.prepareRecipe();

        System.out.println("------------------------");
        tw.prepareRecipe();
}
}