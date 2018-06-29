
public class Plane {
	private String Model;
	private String producer;
	private int Maximumpassenger;

	private String getModel() {
		return Model;
	}

	private void setModel(String model) {
		Model = model;
	}

	private String getProducer() {
		return producer;
	}

	private void setProducer(String producer) {
		this.producer = producer;
	}

	private int getMaximumpassenger() {
		return Maximumpassenger;
	}

	private void setMaximumpassenger(int maximumpassenger) {
		Maximumpassenger = maximumpassenger;

	}

	public Plane(String m, String p, int ma) {
		Model = m;
		producer = p;
		Maximumpassenger = ma;
	}

	public static void main(String[] args) {

	}

}
