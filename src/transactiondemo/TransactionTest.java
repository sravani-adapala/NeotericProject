package transactiondemo;

public class TransactionTest {
    public static void main(String[] args) {
        TransactionProcess transactionProcess=new TransactionProcess();
        transactionProcess.paymentProcess("34678",500);

        TransactionProcess transactionProcess1=new TransactionProcess();
        transactionProcess1.paymentProcess("34678",1500);

        TransactionProcess transactionProcess2=new TransactionProcess();
        transactionProcess2.rePay("34678",1000);



    }
}
