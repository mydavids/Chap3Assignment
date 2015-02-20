package za.ac.cput.mydavids.atminterface;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/19.
 */
public class ATMWithdrawAndDepositTest {

    ATMService atm;

    @Before
    public void setUp() throws Exception {

        atm = new ATM(150);

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testWithdraw() throws Exception {

        assertEquals(100, atm.withdraw(50));
    }

    @Test
    public void testDeposit() throws Exception {

        assertEquals(150, atm.deposit(50));

    }
}
