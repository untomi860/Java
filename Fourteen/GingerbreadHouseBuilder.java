class GingerbreadHouseBuilder extends HouseBuilder {
    public int numWalls = 5;
    public int numWindows = 20;
    public String windowMaterial = "Sugar";
    public String wallMaterial = "Gingerbread and icing";
    public String roofMaterial = "Twizzlers";

    public GingerbreadHouseBuilder(){
        this.builderName = "Stone House Builder";
        setHouseType(HouseType.GINGERBREAD);
    }


    public HouseBuilder addWalls(){
        for (int i = 0; i < numWalls; i++)
        {
            house.addWall(new Wall(wallMaterial));
        }

        return this;
    }


    public HouseBuilder addWindows()
    {
        for (int i = 0; i < numWindows; i++){
            house.addWindow(new Window(windowMaterial));
        }

        return this;
    }


    public HouseBuilder addRoof(){
        house.addRoof(new Roof(roofMaterial));
        return this;
    }
    public House build(){
        System.out.println("Stick everything together with icing");
        return house;
    }
}