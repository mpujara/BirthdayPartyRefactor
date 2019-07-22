package com.lendup.birthdayparty.model;

public class Balloons {

	private final Enum<Color> color; 
	private final String material; 
	private final int quantity;
	
	public Balloons(Enum<Color> color, String material, int quantity) {
		this.color = color;
		this.material = material;
		this.quantity = quantity;
	}

	public String getColor() {
		return color.toString();
	}

	public String getMaterial() {
		return material;
	}

	public int getNumber() {
		return quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + quantity;
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
		Balloons other = (Balloons) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (quantity != other.quantity)
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Balloon [color=");
		builder.append(color);
		builder.append(", material=");
		builder.append(material);
		builder.append(", number=");
		builder.append(quantity);
		builder.append("]");
		return builder.toString();
	}

}
