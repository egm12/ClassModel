/**
 * @author Elissa
 * 
 *         Represents the attributes that may usually decorate a field. We will
 *         be using default values for each attribute defined below.
 */
public class Attributes {
	private String accessModifier;
	private boolean isStatic;
	private boolean isFinal;

	/**
	 * Constructor for the class Attributes
	 * 
	 * @param builder
	 */
	public Attributes(Builder builder) {
		this.accessModifier = builder.accessModifier;
		this.isStatic = builder.isStatic;
		this.isFinal = builder.isFinal;
	}

	/**
	 * @return the accessModifier
	 */
	public String getAccessModifier() {
		return accessModifier;
	}

	/**
	 * @return the isStatic
	 */
	public boolean isStatic() {
		return isStatic;
	}

	/**
	 * @return the isFinal
	 */
	public boolean isFinal() {
		return isFinal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accessModifier == null) ? 0 : accessModifier.hashCode());
		result = prime * result + (isFinal ? 1231 : 1237);
		result = prime * result + (isStatic ? 1231 : 1237);
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
		Attributes other = (Attributes) obj;
		if (accessModifier == null) {
			if (other.accessModifier != null)
				return false;
		} else if (!accessModifier.equals(other.accessModifier))
			return false;
		if (isFinal != other.isFinal)
			return false;
		if (isStatic != other.isStatic)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Attributes [accessModifier=" + accessModifier + ", isStatic="
				+ isStatic + ", isFinal=" + isFinal + "]";
	}

	public class Builder {
		private String accessModifier;
		private boolean isStatic;
		private boolean isFinal;

		/**
		 * Constructor for the Builder of Attributes
		 */
		public Builder() {
			accessModifier = "public";
			isStatic = false;
			isFinal = false;
		}

		public Builder withAccessModifier(String accessModifier) {
			this.accessModifier = accessModifier;
			return this;
		}

		public Builder isStatic(boolean isStatic) {
			this.isStatic = isStatic;
			return this;
		}

		public Builder isFinal(boolean isFinal) {
			this.isFinal = isFinal;
			return this;
		}

		/**
		 * build method
		 * 
		 * @return Attributes
		 */
		public Attributes build() {
			return new Attributes(this);
		}
	}
}