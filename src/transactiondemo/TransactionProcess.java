package transactiondemo;

public class TransactionProcess {
    CreditCard creditCard=new CreditCard();
    public double paymentProcess(String cardNum,double amount){

      //  creditCard.cardNum="34678";
        if (creditCard.cardNum.equals(cardNum) && amount <=creditCard.limit){
            System.out.println("transaction successfull");
            creditCard.limit=creditCard.limit-amount;
            System.out.println(" Remaining limitbalence = "+creditCard.limit);

        }
        return creditCard.limit;

    }

    public double rePay(String cardNum,double amount){
        if (creditCard.cardNum.equals(cardNum)){
            creditCard.limit=creditCard.limit+amount;
            System.out.println("Remaining limitbalence="+creditCard.limit);
        }
        return creditCard.limit;
    }
}
