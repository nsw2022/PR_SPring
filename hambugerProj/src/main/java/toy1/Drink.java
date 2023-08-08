package toy1;

public class Drink {
	String drinkName, drinkCalo;

	@Override
	public String toString() {
		return "Drink [drinkName=" + drinkName + ", drinkCalo=" + drinkCalo + "]";
	}
	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public void setDrinkCalo(String drinkCalo) {
		this.drinkCalo = drinkCalo;
	}
	public String getDrinkName() {
		return drinkName;
	}
	public String getDrinkCalo() {
		return drinkCalo;
	}
	
	
	
	
}
