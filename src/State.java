import java.util.*;

/**
 * @author Elissa
 * 
 *         Represents the state part of a class. It's defined mainly as a list
 *         of fields with all their corresponding attributes.
 */
public class State {
	Map<String, Field> fields;

	/**
	 * Constructor for the class State
	 * 
	 * @param builder
	 */
	public State(Builder builder) {
		this.fields = builder.fields;
	}

	/**
	 * @return the fields
	 */
	public Collection<Field> getFields() {
		return fields.values();
	}
	
	public String getFieldType(String fieldName) {
		Field wantedField = fields.get(fieldName);
		if (wantedField == null) {
			throw new IllegalArgumentException("The class contains no field with the specified name.");
		}
		return wantedField.getVariableType();
	}

	// TODO add hash and equal

	@Override
	public String toString() {
		return "State [fields=" + fields + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class State
	 */
	public class Builder {
		Map<String, Field> fields;

		/**
		 * Constructor for the Builder of State
		 */
		public Builder() {
			fields = new HashMap<String, Field>();
		}

		/**
		 * add a field to the state of the class
		 * 
		 * @param field
		 * @return builder for chained calls
		 */
		public Builder withField(Field field) {
			fields.put(field.getVariableName(), field);
			return this;
		}

		/**
		 * add fields to the state of the class
		 * 
		 * @param paramFields
		 * @return builder for chained calls
		 */
		public Builder withFields(Field... paramFields) {
			for (Field field : paramFields) {
				fields.put(field.getVariableName(), field);
			}
			return this;
		}

		/**
		 * build method
		 * 
		 * @return State
		 */
		public State build() {
			return new State(this);
		}
	}
}