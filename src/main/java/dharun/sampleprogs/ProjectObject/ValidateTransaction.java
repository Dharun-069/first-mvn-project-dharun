
package dharun.sampleprogs.ProjectObject;

public class ValidateTransaction {

	String senderAccountNumber;
	String phoneNumber;
	String reciverNumber;
	double balance;
	double sendingAmount;
	String remarks;

	public String getSenderAccountNumber() {
		return senderAccountNumber;
	}

	public void setSenderAccountNumber(String senderAccountNumber) {
		this.senderAccountNumber = senderAccountNumber;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getAmount() {
		return sendingAmount;
	}

	public void setAmount(int sendingAmount) {
		this.sendingAmount = sendingAmount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getReciverNumber() {
		return reciverNumber;
	}

	public void setReciverNumber(String reciverNumber) {
		this.reciverNumber = reciverNumber;
	}

	public double getAvailablity() {
		return balance;
	}

	public void setAvailablity(int availablity) {
		this.balance = availablity;
	}

}
