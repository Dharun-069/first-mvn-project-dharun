package dharun.sampleprogs.ProjectObject;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

public class TestCaseForTransaction {

	// True validation test Account number start
	@Test
	void testValidateSender() {
		ValidaterTransaction.validateSender("1234567890123456");
	}

	// False validation test start
	@Test
	void ValidateSenderExceptionEmpty() {
		try {
			ValidaterTransaction.validateSender("");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}
	}

	@Test
	void ValidateSenderNumber() {

		try {
			ValidaterTransaction.validateSender("1234567890123459");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}
	}

	@Test
	void SenderbradyLengthNumber() {
		try {
			ValidaterTransaction.validateSender("1234567890");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}

	}

	@Test
	void testValidateSenderExcessNumber() {

		try {
			ValidaterTransaction.validateSender("1234567890907656");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}
	}

	// True validation test for phone number start
	@Test
	void matchReciverValidater() {
		ValidaterTransaction.validateReciver("1234567890", "1234567890");

	}

	// False validation test for phone number start
	@Test
	void nullTestValidateReciver() {

		try {
			ValidaterTransaction.validateSender("");

		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}
	}

	@Test
	void mismatchValidationExtraLength() {

		try {
			ValidaterTransaction.validateSender("1234567890907656");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("phone number cannot be empty or null", e.getMessage());
		}
	}

	@Test
	void ValidatePhoneNumber() {
		try {
			ValidaterTransaction.validateSender("1234567");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}

	}

	@Test
	void validateWrongNumber() {

		try {
			ValidaterTransaction.validateSender("2390564987");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("AccountNumber cannot be empty or null", e.getMessage());
		}
	}

	// True validate TEstCase is Start here
	@Test
	void bradySendingAmount() { // under
		ValidaterTransaction.validatesendingAmount(50, 1000);
	}

	// False validatesendingAmountAvailabilty TestCase start
	@Test
	void excessMoneySendException() {

		try {
			ValidaterTransaction.validatesendingAmount(5000, 1000);
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("You cannot have money to send", e.getMessage());
		}

	}

	// True validate TestCase is Start here
	@Test
	void matchReciverNumber() {
		ValidaterTransaction.validateReciverNumber("0987654321", "0987654321");
	}

	@Test
	void unmatchReciverNumber() {

		try {
			ValidaterTransaction.validateReciverNumber("234567987", "12345678");
		} catch (IllegalArgumentException e) {
			Assertions.assertEquals("Reciver is not there", e.getMessage());
		}
	}
}
