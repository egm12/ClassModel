import java.util.*;

/**
 * @author Elissa
 * 
 *         Represents the behavior part of a class. It's defined mainly as a
 *         list of methods/functions with all their corresponding attributes:
 *         signature, body implementation... Grouped together, they define the
 *         functionalities that the class provides.
 */
public class Behavior {
	private List<Method> methods;

	/**
	 * Constructor for the class Behavior
	 * 
	 * @param builder
	 */
	public Behavior(Builder builder) {
		this.methods = builder.methods;
	}

	/**
	 * @return the methods
	 */
	public List<Method> getMethods() {
		return methods;
	}

	@Override
	public String toString() {
		return "Behavior [methods=" + methods + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Behavior
	 */
	public class Builder {
		private List<Method> methods;

		/**
		 * Constructor for the Builder of Behavior
		 */
		public Builder() {
			methods = new ArrayList<Method>();
		}

		/**
		 * add a method to the behavior of the class
		 * 
		 * @param method
		 * @return builder for chained calls
		 */
		public Builder withMethod(Method method) {
			methods.add(method);
			return this;
		}

		/**
		 * add multiple methods to the behavior of the class
		 * 
		 * @param paramMethods
		 * @return builder for chained calls
		 */
		public Builder wtihMethods(Method... paramMethods) {
			for (Method method : paramMethods) {
				methods.add(method);
			}
			return this;
		}

		/**
		 * build method
		 * 
		 * @return Behavior
		 */
		public Behavior build() {
			return new Behavior(this);
		}
	}
}