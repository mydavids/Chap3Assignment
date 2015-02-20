package za.ac.cput.mydavids.wit;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.mydavids.wit.Impl.WithdrawImpl;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/19.
 */
public class WithdrawTest {

    private Withdraw withdraw;

    @Before
    public void setUp() throws Exception {
        withdraw = new WithdrawImpl();
    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testWithdraw() throws Exception {

        assertEquals(100, withdraw.withdraw(150, 50));

    }
}
