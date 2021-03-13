package entities;

import exceptions.AccountError;

public class Conta {
	
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	public Conta(Integer number, String holder, Double balance, Double withdrawLimit) {
		 
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	
	public void withdraw (Double amount) throws AccountError {
		 if (amount > withdrawLimit)
			 throw new AccountError(" The amount exceeds withdraw limit");
		 if (amount > balance)
			 throw new AccountError(" Not enough balance");
		  balance-=amount;
	}
	
	public void deposit (Double amount) {
		  balance+=amount;
	}
	 
	public String toString() {
		String s = "";
		s = "New balance: " + String.format("%.2f", balance);
		return s;
		
		
		
	}

}
