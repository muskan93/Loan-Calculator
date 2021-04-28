import java.util.Scanner ;

public class ComputeLoan {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print( " Enter Annual Interest rate (eg : 7.25%) = ");
		double annualInterest = input.nextDouble();
		
		System.out.print(" Enter Loan Amount = ");
		double loanAmount = input.nextDouble() ;
		
		System.out.print(" Enter number of years (eg : 5) = ");
		int years = input.nextInt() ;
		
		double monthly = (annualInterest / 1200.0) * loanAmount  ;
		double yearly = loanAmount / years  ;
		double net = yearly /12 ;
		
		double montlyPayment = monthly + net ;
		double totalPayment = montlyPayment * years * 12 ;
		
		System.out.println("  Monthly Payment : Rs. " +  ((int)montlyPayment * 100) / 100.0  );
		System.out.println(" ----------------------------------------- ");
		System.out.println(" Total Payment : Rs." +  (int) (totalPayment * 100 )/ 100.0  );
		
		
	}

}
