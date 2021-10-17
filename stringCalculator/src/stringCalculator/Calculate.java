package stringCalculator;

public class Calculate {
	private final String delimeter = ",|\n|;";

	public long add(String input) throws Exception {

		String[] numbers = input.split(delimeter);

		if (isEmpty(input)) {
			// Empty string returns 0 to pass the test
			return 0;
		}
		// for checking single value test
		if (input.length() == 1) {
			return stringToInt(input);
		} else { // check sum of two numbers with default delimeter
			return getSum(numbers);
		}

	}

	// Checking for negative number
	@SuppressWarnings("unused")
	private void negativeNumbersException(String[] numbers) throws CustomExceptionHandler {

		for (String curr : numbers) {
			if (stringToInt(curr) < 0) {
				throw new CustomExceptionHandler("Negative Number not allowed");
			}

		}
	}

	// checking for multiple custom delimiters and contains negative value
	public int getSum(String numbers) throws CustomExceptionHandler {
		int sum = 0;

		char[] ch = numbers.toCharArray();
		if (numbers.contains("-")) {
			throw new CustomExceptionHandler("Negative value not allowed");
		} 
		else {
			for (int i = 0; i < ch.length; i++) {

				int ascii = (int) ch[i];

				if (ascii >= 48 && ascii <= 57) {
					int num = Character.getNumericValue(ch[i]);

					sum += num;

				}
			}
		}
		return sum;
	}

	// returning the sum
	private int getSum(String[] numbers) throws CustomExceptionHandler {

		int sum = 0;
		for (String curr : numbers) {

			if (stringToInt(curr) > 1000) // check input is >1000
			{
				continue;
			}
			sum += stringToInt(curr);
		}

		return sum;
	}

	// check string is empty
	private boolean isEmpty(String input) {
		return input.isEmpty();
	}

	// convert string to int
	private int stringToInt(String input) {
		return Integer.parseInt(input);
	}

}
