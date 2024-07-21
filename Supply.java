package placement_course;

public class Supply {
	private int type;
	private String foodType,foodName,sticker;
	
	public void Foodin(int type,String foodName,String sticker) {
		this.type=type;
		this.foodName=foodName;
		this.sticker=sticker;
		this.foodType=getType(sticker);
	}
	
	private String getType(String sticker) {
		sticker=sticker.toLowerCase();
		if((sticker)=="green")
			return "Vegetarian";
		else if(sticker=="red")
			return "Non-Vegetarian";
		else if((sticker)=="yellow")
			return "Contains Egg";
		else return "error";
		
	}
	public String Foodout() {
		return "Supply [type=" + type + ", foodType=" + foodType + ", foodName=" + foodName + ", sticker=" + sticker
				+ "]";
	}
	
}
