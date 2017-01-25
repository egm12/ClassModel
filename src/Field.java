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