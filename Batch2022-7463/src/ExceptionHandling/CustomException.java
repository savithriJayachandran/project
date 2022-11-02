
package ExceptionHandling;
import java.util.Scanner;
class NegativeIntegerException extends Exception{
	public NegativeIntegerException() {
	System.out.println("Withdraw amount should be greater than zer0/Non -ve amount");}}
class InsufficientFundException extends Exception{
	public InsufficientFundException() {
	System.out.println("Insufficient");
	}}
class Account{
	private int balance=0;
	public Account(){}
	public Account(int balance){
		this.balance=balance;
	}
	public int getAccountBalance(){
		return this.balance;
	}
public int withdraw(int withdrawableAmount) throws NegativeIntegerException, InsufficientFundException {
	if (withdrawableAmount<0) {
		throw new NegativeIntegerException();
	}
	if (withdrawableAmount>this.balance) {
		throw new InsufficientFundException();
	}
	if (withdrawableAmount<this.balance) {
		int newBalance = this.balance-withdrawableAmount;
		System.out.println(newBalance);
		return newBalance;}
	return this.balance;}}
public class CustomException {
	public static void main(String[] args) throws  NegativeIntegerException, InsufficientFundException {
		Account ac=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Deposit Amount");
		int deposit=sc.nextInt();
		System.out.println("Enter your withdrawable Amount");
		int withdrawableAmount =sc.nextInt();
		ac.withdraw(withdrawableAmount);
		}}
