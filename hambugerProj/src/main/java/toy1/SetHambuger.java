package toy1;

public class SetHambuger {
	Buger buger;
	SideMenu sideMenu;
	Drink drink;
	public SetHambuger() {
		super();
	}
	
	public SetHambuger(Buger buger, SideMenu sideMenu, Drink drink) {
		super();
		this.buger = buger;
		this.sideMenu = sideMenu;
		this.drink = drink;
	}

	public void setBuger(Buger buger) {
		this.buger = buger;
	}

	public void setSideMenu(SideMenu sideMenu) {
		this.sideMenu = sideMenu;
	}

	public void setDrink(Drink drink) {
		this.drink = drink;
	}

	public Buger getBuger() {
		return buger;
	}

	public SideMenu getSideMenu() {
		return sideMenu;
	}

	public Drink getDrink() {
		return drink;
	}
	
	
	
	
}
