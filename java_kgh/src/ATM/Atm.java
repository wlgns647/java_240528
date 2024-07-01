package ATM;

import java.util.Objects;

public class Atm {

	private String AccountName;
	private int AccountNum1; // 앞자리
	private int AccountNum2; // 중간자리 
	private int AccountNum3; // 뒷자리
	private int AccountPM;
	
	public Atm(String AccountName,int AccountNum1,int AccountNum2,  int AccountNum3, int AccountPM) {
		this.AccountName =AccountName;
		this.AccountNum1 =AccountNum1;
		this.AccountNum2 =AccountNum2;
		this.AccountNum3 =AccountNum3;
		this.AccountPM =AccountPM;
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(AccountName, AccountNum1, AccountNum2, AccountNum3, AccountPM);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atm other = (Atm) obj;
		return Objects.equals(AccountName, other.AccountName) && AccountNum1 == other.AccountNum1
				&& AccountNum2 == other.AccountNum2 && AccountNum3 == other.AccountNum3 && AccountPM == other.AccountPM;
	}
	
	
}
