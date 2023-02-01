

public class Address {
	private int houseNum;
	private String colonyName;
	private int pinCode;
	private String landMark;
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	public String getColonyName() {
		return colonyName;
	}
	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	@Override
	public String toString() {
		return "Address [houseNum=" + houseNum + ", colonyName=" + colonyName + ", pinCode=" + pinCode + ", landMark="
				+ landMark + "]";
	}
	
}
