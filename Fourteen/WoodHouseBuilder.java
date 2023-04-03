class WoodHouseBuilder extends HouseBuilder {
    public int numWalls = 6;
    public int numWindows = 10;
    public String windowMaterial = "Temperede glass";
    public String wallMaterial = "Wood, 4*6";
    public String interiorWallMaterial = "Wood, 2*4";
    public String roofMaterial = "Metal";

    public WoodHouseBuilder(){
        this.builderName = "Wood House Builder";
        setHouseType(HouseType.WOOD);
    }
    public HouseBuilder addWalls(){
        for (int i = 0; i < 4; i++){
            house.addWall(new Wall(wallMaterial));
        }

        for (int i = 0; i < numWalls - 4; i++){
            house.addWall(new Wall(interiorWallMaterial));
        }

        house.addWall(new Wall(interiorWallMaterial));
        return this;
    }
    public HouseBuilder addWindows(){
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
        System.out.println("Stick everything together with mortar");
        return house;
    }
}