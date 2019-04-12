package org.MethodReplacer.beans;

public interface Bank {
	 public void diposite(int amount);
	 public void withdraw(int amount);
	 public void calculateInterest(int loanAmount,double months);
	 public void viewBalance();
	 public void openAccount();
	 public void afterBanking();
}
