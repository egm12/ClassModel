/**
 * @author Elissa
 * 
 *         Represents the overall model of a class to be created. Has a name and
 *         a programming language: both specified beforehand for the final
 *         output product. Composed of 2 main characteristics: its state and
 *         behavior: both to be combined/filled.
 */
public class ClassModel {
	private String className;
	private String programmingLanguage;
	private State state;
	private Behavior behavior;

	/**
	 * Constructor for the class ClassModel
	 * 
	 * @param builder
	 */
	public ClassModel(Builder builder) {
		this.className = builder.className;
		this.programmingLanguage = builder.programmingLanguage;
		this.state = builder.state;
		this.behavior = builder.behavior;
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @return the programmingLanguage
	 */
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}

	/**
	 * @return the behavior
	 */
	public Behavior getBehavior() {
		return behavior;
	}

	// TODO add hash and equal

	@Override
	public String toString() {
		return "ClassModel [className=" + className + ", programmingLanguage="
				+ programmingLanguage + ", state=" + state + ", behavior="
				+ behavior + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class ClassModel
	 */
	public class Builder {
		private String className;
		private String programmingLanguage;
		private State state;
		private Behavior behavior;

		/**
		 * Constructor for the Builder of ClassModel
		 * 
		 * @param className
		 */
		public Builder(String className) {
			this.className = className;
		}

		/**
		 * set the programming language of the class
		 * 
		 * @param programmingLanguage
		 * @return builder for chained calls
		 */
		public Builder withProgrammingLanguage(String programmingLanguage) {
			this.programmingLanguage = programmingLanguage;
			return this;
		}

		/**
		 * set the state of the class
		 * 
		 * @param state
		 * @return builder for chained calls
		 */
		public Builder withState(State state) {
			this.state = state;
			return this;
		}

		/**
		 * set the behavior of the class
		 * 
		 * @param behavior
		 * @return builder for chained calls
		 */
		public Builder withBehavior(Behavior behavior) {
			this.behavior = behavior;
			return this;
		}

		/**
		 * build method
		 * 
		 * @return ClassModel
		 */
		public ClassModel build() {
			return new ClassModel(this);
		}
	}
}