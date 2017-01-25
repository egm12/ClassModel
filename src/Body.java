import java.io.File;

/**
 * @author Elissa
 * 
 *         Represents the body of a method: the actual code for it.
 */
public class Body {
	private File body;

	/**
	 * Constructor for the class Body
	 * 
	 * @param builder
	 */
	public Body(Builder builder) {
		this.body = builder.body;
	}

	/**
	 * @return the body
	 */
	public File getBody() {
		return body;
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Body
	 */
	public class Builder {
		private File body;

		/**
		 * Constructor for the Builder of Body
		 * 
		 * @param fileName
		 */
		public Builder(String fileName) {
			body = new File(fileName);
		}

		/**
		 * build method
		 * 
		 * @return Body
		 */
		public Body build() {
			return new Body(this);
		}
	}
}