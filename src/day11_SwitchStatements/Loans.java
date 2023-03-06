package day11_SwitchStatements;
/*6. Create a class called Loans, Given two variables salary and credit score, use those given info t
o determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.*/
public class Loans {
    public static void main(String[] args) {

        int salary = 100000;
        int credit_score =40;
        String loan = (salary>60000 && credit_score >50)? "loan Approved " : "loan Denied";
        System.out.println(loan);



    }
}
