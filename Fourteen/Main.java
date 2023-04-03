public class Main{
public static void main(String[] args){
    HouseBuilder woodHouseBuilder = new WoodHouseBuilder();
    House woodHouse = woodHouseBuilder.addWalls().addWindows().addRoof().build();
    System.out.println(woodHouse);
    System.out.println("--------------------------------\n");

    HouseBuilder StoneHouseBuilder = new StoneHouseBuilder();
    House stoneHouse = StoneHouseBuilder.addWalls().addWindows().addRoof().build();
    System.out.println(stoneHouse.toString());

    HouseBuilder gingerbreadHouseBuilder = new GingerbreadHouseBuilder();
    House gingerbreadHouse = gingerbreadHouseBuilder.addWalls().addWindows().addRoof().build();
    System.out.println(gingerbreadHouse);
    System.out.println("--------------------------------\n");
}
}