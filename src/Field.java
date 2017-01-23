/**
 * @author Elissa
 * 
 * Represents a variable field in a class: contains its type, name, ...
 */
public class Field extends Variable {
	private String type;
	private String fieldName;
	private Attributes attributes;
	private String possibleValue;

	/**
	 * Constructor
	 */
	public Field(Builder builder) {
		this.type = builder.type;
		this.fieldName = builder.fieldName;
		this.attributes = builder.attributes;
		this.possibleValue = builder.possibleValue;
	}

	/** 
	 * @author Elissa
	 *
	 * Builder for Field
	 */
	public class Builder {
		private String type;
		private String fieldName;
		private Attributes attributes;
		private String possibleValue;

		public Builder(String type, String fieldName) {
			this.type = type;
			this.fieldName = fieldName;
			attributes = new Attributes();
			possibleValue = null;
		}
		
		public Builder withValue(String possibleValue) {
			if (attributes.isFinal()) {
				this.possibleValue = possibleValue;
			}
			return this;
		}
		
		public Field build() {
			return new Field(this);
		}
	}
}