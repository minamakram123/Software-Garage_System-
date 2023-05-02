import java.util.ArrayList;

public class ReservedSlots extends Vehicle {
	final ArrayList<Integer> depthr = new ArrayList<Integer>();
	final ArrayList<Integer> widthr = new ArrayList<Integer>();
	final ArrayList<Integer> SlotArea_Reserved = new ArrayList<Integer>();

	public void select_slot() {
		Configuration c = getConfiguration();
		if (c.equals("config1")) {
			for (Integer number : SlotArea) {
				if (getAreaV() <= SlotArea.get(number)) {
					SlotArea_Reserved.add(SlotArea.get(number));
					depthr.add(depth.get(number));
					widthr.add(width.get(number));
					SlotArea.remove(number);
					depth.remove(number);
					width.remove(number);
				}
			}
		} else {
			int temp = 4000;
			int index = 0;
			for (Integer number : SlotArea) {
				if (getAreaV() <= SlotArea.get(number)
						&& SlotArea.get(number) < temp) {
					temp = SlotArea.get(number);
					index = number;
				}
			}
			SlotArea_Reserved.add(SlotArea.get(index));
			depthr.add(depth.get(index));
			widthr.add(width.get(index));
			SlotArea.remove(index);
			depth.remove(index);
			width.remove(index);
		}
	}

	// public void return_slot(){
	// if(parkout){
	// SlotArea.add(SlotArea_Reserved.get(index));
	// depthr.add(depth.get(index));
	// widthr.add(width.get(index));
	// SlotArea.remove(index);
	// depth.remove(index);
	// width.remove(index);
	// }
	// }
}
