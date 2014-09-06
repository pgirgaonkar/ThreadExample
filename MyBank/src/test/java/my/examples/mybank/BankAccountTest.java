package my.examples.mybank;


import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;


public class BankAccountTest {

    @Test
    public void creitHundredRuppesstoAccount(){
        BankAccount ba = new BankAccount(1, 0 );

        ba.credit(100.0);

        assertEquals(100.00, ba.getBalance(),0.1);
    }


    @Test
    public void creitFiveHundredRuppesstoAccount(){
        BankAccount ba = new BankAccount(1, 100 );

        ba.credit(500.0);

        assertEquals(600.00, ba.getBalance(),0.1);
    }

    @Test
    public void debitFiveHundredRuppessFromAccount(){
        BankAccount ba = new BankAccount(1, 600 );

        ba.debit(500.0);

        assertEquals(100.00, ba.getBalance(),0.1);
    }

    @Test
    public void debitmoreAmountThanBalance(){
        BankAccount ba = new BankAccount(1, 100 );

        assertFalse( ba.debit(500.0));
        assertEquals(100.00, ba.getBalance(),0.1);
    }

}