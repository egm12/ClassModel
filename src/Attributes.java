import Field.Builder;

/**
 * @author Elissa
 *
 */
public class Attributes {
	private String accessModifier;
	private boolean isStatic;
	private boolean isFinal;
	
	/**
	 * 
	 */
	public Attributes() {
		
	}
	
	
	
	public String getAccessModifier() {
		return accessModifier;
	}



	public void setAccessModifier(String accessModifier) {
		this.accessModifier = accessModifier;
	}



	public boolean isStatic() {
		return isStatic;
	}



	public void setStatic(boolean isStatic) {
		this.isStatic = isStatic;
	}



	public boolean isFinal() {
		return isFinal;
	}



	public void setFinal(boolean isFinal) {
		this.isFinal = isFinal;
	}



	public class Builder {
		private String accessModifier;
		private boolean isStatic;
		private boolean isFinal;
		
		public Builder withAccessModifier(String accessModifier) {
			this.accessModifier = accessModifier;
			return this;
		}
		
		public Builder isStatic(boolean isStatic) {
			this.isStatic = isStatic;
			return this;
		}
		
		public Builder isFinal(boolean isFinal) {
			this.isFinal = isFinal;
			return this;
		}
	}

}
