package predicatedemo;

import pagination.Pagination;
import pagination.PaginationTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        Payment payment1=new Payment();

        payment1.accountNumber="234567";
        payment1.status="transaction success";
        payment1.amount=1000;

        Payment payment2=new Payment();

        payment2.accountNumber="234567";
        payment2.status="transaction failed";
        payment2.amount=2000;

        Payment payment3=new Payment();

        payment3.accountNumber="234567";
        payment3.status="payment error";
        payment3.amount=5000;

        List<Payment>paymentList=new ArrayList<>();
        paymentList.add(payment1);
        paymentList.add(payment2);
        paymentList.add(payment3);

        Predicate<Payment>predicateFunction=(predicatePayment) ->
                predicatePayment.status.equals("payment error");

       Iterator<Payment> paymentIterator=paymentList.iterator();
        for (;paymentIterator.hasNext();){
            Payment payment=paymentIterator.next();
            System.out.println(payment3);

            if (predicateFunction.test(payment3)){
                System.out.println(" predicate test condition loop " +payment3.status);
            }

        }

        if (predicateFunction.test(payment1)){
            System.out.println(" predicate test for if " + payment1.status);
        }else {
            System.out.println(" predicate test for else  :");
        }


    }
}
