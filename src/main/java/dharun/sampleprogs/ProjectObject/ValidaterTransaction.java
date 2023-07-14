package dharun.sampleprogs.ProjectObject;

public class ValidaterTransaction {

	public static boolean validateSender(String senderAccountNumber) throws IllegalArgumentException {
		if (senderAccountNumber == null || "".equals(senderAccountNumber.trim())
				|| senderAccountNumber.trim().length() != 16) {
			throw new IllegalArgumentException("AccountNumber cannot be empty or null");
		}

		return true;
	}

	public static boolean validateReciver(String phoneNumber, String reciverNumber) throws IllegalArgumentException {
		if (phoneNumber == null || "".equals(phoneNumber.trim()) || phoneNumber.length() != 10
				|| reciverNumber != phoneNumber) {
			throw new IllegalArgumentException("phone number cannot be empty or null");
		}

		return true;
	}

	public static boolean validatesendingAmount(int sendingAmount, int balance) throws IllegalArgumentException {
		if (sendingAmount > balance) {
			throw new IllegalArgumentException("You cannot have money to send");
		}

		return true;
	}

	public static boolean validateReciverNumber(String phoneNumber, String reciverNumber)
			throws IllegalArgumentException {
		if (phoneNumber.trim().equals(reciverNumber.trim())) {

			return true;
		}
		throw new IllegalArgumentException("Reciver is not there");

	}
}
