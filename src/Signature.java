import java.util.*;

/**
 * @author Elissa
 * 
 *         Represents the signature of a method: its name, attributes (is it
 *         public? is it static? ...), return type and parameters passed.
 */
public class Signature {
	private String methodName;
	private String returnType;
	private Attributes attributes;
	private List<Parameter> parameters;

	/**
	 * Constructor for the class Signature
	 * 
	 * @param builder
	 */
	public Signature(Builder builder) {
		this.methodName = builder.methodName;
		this.returnType = builder.returnType;
		this.attributes = builder.attributes;
		this.parameters = builder.parameters;
	}

	/**
	 * @return the methodName
	 */
	public String getMethodName() {
		return methodName;
	}

	/**
	 * @return the returnType
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * @return the attributes
	 */
	public Attributes getAttributes() {
		return attributes;
	}

	/**
	 * @return the parameters
	 */
	public List<Parameter> getParameters() {
		return parameters;
	}

	@Override
	public String toString() {
		return "Signature [methodName=" + methodName + ", returnType="
				+ returnType + ", attributes=" + attributes + ", parameters="
				+ parameters + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Parameter
	 */
	public class Builder {
		private String methodName;
		private String returnType;
		private Attributes attributes;
		private List<Parameter> parameters;

		/**
		 * Constructor for the Builder of Parameter
		 * 
		 * @param methodName
		 */
		public Builder(String methodName, String returnType) {
			this.methodName = methodName;
			this.returnType = returnType;
			// TODO generate default attributes: generateDefaultAttributes();
			parameters = new ArrayList<Parameter>();
		}

		/**
		 * add the different attributes of the signature
		 * 
		 * @param attributes
		 * @return builder for chained calls
		 */
		public Builder withAttributes(Attributes attributes) {
			this.attributes = attributes;
			return this;
		}

		/**
		 * add a parameter to the list
		 * 
		 * @param parameter
		 * @return builder for chained calls
		 */
		public Builder withParamter(Parameter parameter) {
			parameters.add(parameter);
			return this;
		}

		/**
		 * add multiple parameters to the list
		 * 
		 * @param paramParameters
		 * @return builder for chained calls
		 */
		public Builder withParameters(Parameter... paramParameters) {
			for (Parameter parameter : paramParameters) {
				parameters.add(parameter);
			}
			return this;
		}

		/**
		 * build method
		 * 
		 * @return Signature
		 */
		public Signature build() {
			return new Signature(this);
		}
	}
}