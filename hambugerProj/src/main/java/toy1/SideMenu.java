package toy1;

public class SideMenu {
	String sideName, sideType, sideCalo, sideSize;

	public void setSideName(String sideName) {
		this.sideName = sideName;
	}

	public void setSideType(String sideType) {
		this.sideType = sideType;
	}

	public void setSideCalo(String sideCalo) {
		this.sideCalo = sideCalo;
	}

	public void setSideSize(String sideSize) {
		this.sideSize = sideSize;
	}

	@Override
	public String toString() {
		return "SideMenu [sideName=" + sideName + ", sideType=" + sideType + ", sideCalo=" + sideCalo + ", sideSize="
				+ sideSize + "]";
	}
	
}
