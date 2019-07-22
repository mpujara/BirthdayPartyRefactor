package com.lendup.birthdayparty.model;

public class Cake {

	private final Enum<Flavor> flavor;
	private final Enum<Flavor> frostingFlavor;
	private final Enum<Shape> shape;
	private final Enum<Size> size;
	private final Enum<Color> color; 

	public Cake(Enum<Flavor> flavor, Enum<Flavor> frostingFlavor, Enum<Shape> shape, Enum<Size> size, Enum<Color> color) {
		this.flavor = flavor;
		this.frostingFlavor = frostingFlavor;
		this.shape = shape;
		this.size = size;
		this.color = color;
	}

	public Enum<Flavor> getFlavor() {
		return flavor;
	}

	public Enum<Flavor> getFrostingFlavor() {
		return frostingFlavor;
	}

	public Enum<Shape> getShape() {
		return shape;
	}

	public Enum<Size> getSize() {
		return size;
	}

	public Enum<Color> getColor() {
		return color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((flavor == null) ? 0 : flavor.hashCode());
		result = prime * result + ((frostingFlavor == null) ? 0 : frostingFlavor.hashCode());
		result = prime * result + ((shape == null) ? 0 : shape.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Cake other = (Cake) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (flavor == null) {
			if (other.flavor != null)
				return false;
		} else if (!flavor.equals(other.flavor))
			return false;
		if (frostingFlavor == null) {
			if (other.frostingFlavor != null)
				return false;
		} else if (!frostingFlavor.equals(other.frostingFlavor))
			return false;
		if (shape == null) {
			if (other.shape != null)
				return false;
		} else if (!shape.equals(other.shape))
			return false;
		if (size == null) {
			if (other.size != null)
				return false;
		} else if (!size.equals(other.size))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cake [flavor=");
		builder.append(flavor);
		builder.append(", frostingFlavor=");
		builder.append(frostingFlavor);
		builder.append(", shape=");
		builder.append(shape);
		builder.append(", size=");
		builder.append(size);
		builder.append(", color=");
		builder.append(color);
		builder.append("]");
		return builder.toString();
	}
	
}
