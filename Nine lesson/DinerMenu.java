public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        public inteface Iterator {
            boolean hasNext();
            Object next();
        }
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "(Fakin') BAcon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT ", "BAcon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day & tomato on whole wheat", false, 3.39);
        addItem("HotDog", "A HotDog with saukraut, relish,onions, topped with cheese", false, 3.05);
    }
        public void addItem(String name, String description, boolean vegetarian, double price)
        {
            MenuItem menuItem = new MenuItem(name,description, vegetarian, price);
            if (numberOfItems >= MAX_ITEMS) {
                System.err.println("Sorry, menu is full! Can't add item to menu");
            } else {
                menuItems[numberOfItems] = menuItem;
                numberOfItems = numberOfItems + 1;
            }
        } 
        public Iterator createIterator() {
            return new DinerMenuIterator(menuItems);
        }
}
