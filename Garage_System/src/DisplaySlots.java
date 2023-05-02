public class DisplaySlots extends Slot {

	public void Display() {

		Configuration c = getConfiguration();
		if (c.equals("config1")) {
			for (int i = 0; i < depth.size(); i++) {
				System.out.print("slot no " + (i + 1));
				System.out.print(": " + depth.get(i) + " " + width.get(i));
				System.out.print("\n");
			}
		}
		// else
		// {
		// for (int i = 0;i<available_sl_dimensions.size();i++)
		// {
		// System.out.print("slot no: ");
		// System.out.print(i+1);
		// System.out.print(" depth= ");
		// System.out.print(available_sl_dimensions.get(i).first);
		// System.out.print(" width= ");
		// System.out.print(available_sl_dimensions.get(i).second);
		// System.out.print("\n");
		// }
		// }
	}

}
