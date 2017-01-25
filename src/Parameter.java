/**
 * @author Elissa
 * 
 *         Represents a parameter in the signature of a method, passed as an
 *         argument by caller. It needs no more features than a variable to be
 *         defined.
 */
public class Parameter extends Variable {

	/**
	 * Constructor for the class Parameter
	 * 
	 * @param builder
	 */
	public Parameter(Builder builder) {
		super(builder);
	}
	
	@Override
	public String toString() {
		return "Parameter [parameterType=" + this.getVariableType()
				+ ", parameterName=" + this.getVariableName() + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Field
	 */
	public class Builder extends Variable.Builder {
		/**
		 * Constructor for the Builder of Parameter
		 * 
		 * @param parameterType
		 *            , parameterName
		 */
		public Builder(String parameterType, String parameterName) {
			super(parameterType, parameterType);
		}

		/**
		 * build method
		 * 
		 * @return Parameter
		 */
		public Parameter build() {
			return new Parameter(this);
		}
	}
}