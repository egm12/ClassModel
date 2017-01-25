/**
 * @author Elissa
 * 
 *         Represents a method in the behavior part of a class. A method is
 *         characterized mainly by its signature (includes the return type) and
 *         its body (core implementation).
 */
public class Method {
	private Signature signature;
	private Body body;

	/**
	 * Constructor for the class Method
	 * 
	 * @param builder
	 */
	public Method(Builder builder) {
		this.signature = builder.signature;
		this.body = builder.body;
	}

	/**
	 * @return the signature
	 */
	public Signature getSignature() {
		return signature;
	}

	/**
	 * @return the body
	 */
	public Body getBody() {
		return body;
	}

	@Override
	public String toString() {
		return "Method [signature=" + signature + ", body=" + body + "]";
	}

	/**
	 * @author Elissa
	 * 
	 *         Represents a builder for the class Method
	 */
	public class Builder {
		private Signature signature;
		private Body body;

		/**
		 * Constructor for the Builder of Method
		 * 
		 * @param signature
		 *            , body
		 */
		public Builder(Signature signature, Body body) {
			this.signature = signature;
			this.body = body;
		}

		/**
		 * build method
		 * 
		 * @return Method
		 */
		public Method build() {
			return new Method(this);
		}
	}
}