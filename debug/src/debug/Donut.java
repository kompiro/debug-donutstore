package debug;

public class Donut {

	public DonutType type;
	public int value = 100;

	public Donut(DonutType type) {
		this.type = type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Donut other = (Donut) obj;
		if (type != other.type)
			return false;
		return true;
	}
	
	

}
