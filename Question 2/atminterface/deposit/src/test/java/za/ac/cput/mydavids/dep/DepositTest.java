package za.ac.cput.mydavids.dep;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.mydavids.dep.impl.DepositImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/19.
 */
public class DepositTest {

    private Deposit deposit;

    @Before
    public void setUp() throws Exception {

    deposit = new DepositImpl();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testDeposit() throws Exception {

        assertEquals(150, deposit.deposit(100, 50));
    }
}
