enum Configuration {
	config1, config2
};

public class Garage {

	String garagename;
	String garageaddress;
	Configuration configuration;
	int Garagenumberslots;

	// ArrayList<Slot> slot = new ArrayList<Slot>();

	public Garage() {
	}

	public Garage(String garagename, String garageaddress) {
		this.garagename = garagename;
		this.garageaddress = garageaddress;
	}

	public String getGaragename() {
		return garagename;
	}

	public void setGaragename(String garagename) {
		this.garagename = garagename;
	}

	public String getGarageaddress() {
		return garageaddress;
	}

	public void setGarageaddress(String garageaddress) {
		this.garageaddress = garageaddress;
	}

	public void setGaragenumberslots(int n) {
		Garagenumberslots = n;
	};

	public void setDimensionslots(int w, int d) {
		new Slot(d, w);

	};

	public void setConfiguration(Configuration c) {
		configuration = c;
	};

	public Configuration getConfiguration() {
		return configuration;
	};

};
