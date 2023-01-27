public abstract class Beverage{
	protected String description = "Неизвестный напиток";
	public String getDescription(){
		return description;
	}
	public abstract double cost();
}