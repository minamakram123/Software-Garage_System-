import java.util.ArrayList;

public class Slot extends Garage {

	final ArrayList<Integer> depth = new ArrayList<Integer>();
	final ArrayList<Integer> width = new ArrayList<Integer>();
	final ArrayList<Integer> SlotArea = new ArrayList<Integer>();

	// private static int i = 0;

	public Slot() {
	}

	public Slot(int depth, int width) {
		this.depth.add(depth);
		this.width.add(width);
		this.SlotArea.add(depth * width);
	}

	public ArrayList<Integer> getDepth() {
		return depth;
	}

	public ArrayList<Integer> getWidth() {
		return width;
	}

	public ArrayList<Integer> getSlotArea() {
		return SlotArea;
	}

	// public void setDepth(int depth) {
	// this.depth.add(depth);
	// }
	//
	// public void setWidth(int width) {
	// this.width.add(width);
	// }

	public boolean Availableslot() {
		boolean available = false;
		// Configuration c = getConfiguration();
		// if (c.equals("config1")) {
		if (depth.isEmpty()) {
			available = false;
			// System.out.print("No Available slots \nExit");
		} else {
			available = true;
			// System.out.print("There is available slots if you want to show it \nenter display ");
		}
		// }
		// else {
		// if (SlotArea.isEmpty()) {
		// System.out.print("No Available slots \nExit");
		// } else {
		// System.out
		// .print("There is available slots if you want to show it \nenter display ");
		// }
		// }
		return available;

	};

}
