/**
 * @author Elissa
 * 
 *         Represents a variable in a class. User-defined by its type and name.
 *         Can be either a field in the state of a class or an argument passed
 *         in the parameters of a method.
 */
public class Variable {
	private String variableType;
	private String variableName;

	/**
	 * Constructor for the class Variable
	 * 
	 * @param builder
	 */
	public Variable(Builder builder) {
		this.variableType = builder.variableType;
		this.variableName = builder.variableName;
	}

	/**
	 * @return the variableType
	 */
	public String getVariableType() {
		return variableType;
	}

	/**
	 * @return the variableName
	 */
	public String getVariableName() {
		return variableName;
	}

	@Override
	public String toString() {
		return "Variable [variableType=" + variableType + ", variableName="
				+ variableName + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Variable
	 */
	public class Builder {
		private String variableType;
		private String variableName;

		/**
		 * Constructor for the Builder of Variable
		 * 
		 * @param variableType
		 *            , variableName
		 */
		public Builder(String variableType, String variableName) {
			this.variableType = variableType;
			this.variableName = variableName;
		}

		/**
		 * build method
		 * 
		 * @return Variable
		 */
		public Variable build() {
			return new Variable(this);
		}
	}
}