package maharshi;

public class forspring {
	static void validate(int age) throws InvalidAgeException {
		try {
			if (age < 18)
				throw new InvalidAgeException("not valid");
			else
				System.out.println("welcome to vote");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String args[]) throws Exception {
		/*
		 * try { validate(13); }
		 * 
		 * catch(Exception e){ System.out.println(e);
		 * 
		 * }
		 */
		validate(78);
		System.out.println("rest of the code...");
	}
}
