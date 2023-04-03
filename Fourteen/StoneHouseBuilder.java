class StoneHouseBuilder extends HouseBuilder {
    public int numWalls = 5;
    public int numWindows = 20;
    public String windowMaterial = "Antique glass";
    public String wallMaterial = "Stone, 2 feet thick";
    public String interiorWallMaterial = "Stone, 1 foot thick";
    public String roofMaterial = "Title";

    public StoneHouseBuilder(){
        this.builderName = "Stone House Builder";
        setHouseType(HouseType.STONE);
    }
    public HouseBuilder addWalls(){
        for (int i = 0; i < numWalls-1; i++){
            house.addWall(new Wall(interiorWallMaterial));
        }
        house.addWall(new Wall(interiorWallMaterial));
        return this;
    }
    public HouseBuilder addWindows(){
        for (int i = 0; i < numWindows-1; i++){
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }
    public HouseBuilder addRoof(){
        house.addRoof(new Roof(roofMaterial));
        return this;
    }
    public House build(){
        System.out.println("Stick everything together with mortar");
        return house;
    }
}