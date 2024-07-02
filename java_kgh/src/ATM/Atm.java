package ATM;

import java.util.Objects;

import lombok.Data;
@Data
public class Atm {

	private String AccountName;
	private int AccountNum1; // 앞자리
	private int AccountNum2; // 중간자리
	private int AccountNum3; // 뒷자리
	private int AccountPM;

	public Atm(String AccountName, int AccountNum1, int AccountNum2, int AccountNum3, int AccountPM) {
		this.AccountName = AccountName;
		this.AccountNum1 = AccountNum1;
		this.AccountNum2 = AccountNum2;
		this.AccountNum3 = AccountNum3;
		this.AccountPM = AccountPM;
	}

	@Override
	public int hashCode() {
		return Objects.hash(AccountName, AccountNum1, AccountNum2, AccountNum3, AccountPM);
	}
	public String AccountName() {
		return AccountName;
	}

	public int getAccountPM() {
		return AccountPM;

	}

	public int getAccountNum1() {
		return AccountNum1;
	}

	public int getAccountNum3() {
		return AccountNum3;
	}

	public int getAccountNum2() {
		return AccountNum2;
	}
}
