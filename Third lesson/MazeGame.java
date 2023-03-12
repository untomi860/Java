 class MazeGame {
 	public Maze CreateMaze() {	
 		Maze aMaze = this.MakeMaze();

		Room r1 = MakeRoom(1);
	 	Room r2 = MakeRoom(2);
 		Door theDoor = MakeDoor(r1, r2);

 		aMaze.AddRoom(r1);
 		aMaze.AddRoom(r2);

 		r1.SetSide(Direction.North, MakeWall());
 		r1.SetSide(Direction.East, theDoor);
 		r1.SetSide(Direction.South, MakeWall());
 		r1.SetSide(Direction.West, MakeWall());

 		r2.SetSide(Direction.North, MakeWall());
 		r2.SetSide(Direction.East, MakeWall());
 		r2.SetSide(Direction.South, MakeWall());
 		r2.SetSide(Direction.West, theDoor);

 		return aMaze;
	}
 	public virtual Maze MakeMaze() {
 		return new Maze();
 	}	

 	public virtual Room MakeRoom(int number) {
 		return new Room(number);
 	}

 	public virtual Wall MakeWall() {
 		return new Wall();
 	}

 	public virtual Door MakeDoor(Room r1, Room r2) {
 		return new Door(r1, r2);
 	}
 }