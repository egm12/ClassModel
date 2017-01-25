/**
 * @author Elissa
 * 
 *         Represents a field item in the state part of a class. Other than its
 *         type and name, a field has different attributes such as: access
 *         modifier, static or not, final or not...
 */
public class Field extends Variable {
	private Attributes attributes;
	private String value; // used only if the field is static and final

	/**
	 * Constructor for the class Field
	 * 
	 * @param builder
	 */
	public Field(Builder builder) {
		super(builder);
		this.attributes = builder.attributes;
		this.value = builder.value;
	}

	/**
	 * @return the attributes
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * @return the value if relevant
	 */
	public String getValue() {
		return value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((attributes == null) ? 0 : attributes.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (attributes == null) {
			if (other.attributes != null)
				return false;
		} else if (!attributes.equals(other.attributes))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Field [" + super.toString() + ", attributes=" + attributes
				+ ", value=" + value + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Field
	 */
	public class Builder extends Variable.Builder {
		private Attributes attributes;
		private String value; // used only if the field is static and final

		/**
		 * Constructor for the Builder of Field
		 * 
		 * @param variableType
		 *            , variableName
		 */
		public Builder(String variableType, String variableName) {
			super(variableType, variableName);
		}

		/**
		 * add the different attributes of the field
		 * 
		 * @param attributes
		 * @return builder for chained calls
		 */
		public Builder withAttributes(Attributes attributes) {
			this.attributes = attributes;
			return this;
		}

		/**
		 * add the value if relevant
		 * 
		 * @param value
		 * @return builder for chained calls
		 */
		public Builder withValue(String value) {
			if (!attributes.isFinal() || !attributes.isStatic())
				throw new IllegalArgumentException(
						"You can't initialize the field as it is declared now.");
			this.value = value;
			return this;
		}

		/**
		 * build method
		 * 
		 * @return Field
		 */
		public Field build() {
			return new Field(this);
		}
	}
}