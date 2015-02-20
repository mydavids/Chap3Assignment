package za.ac.cput.mydavids.atminterface;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import za.ac.cput.mydavids.atminterface.config.AppConfig;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/19.
 */
public class ATMServiceImplWithdrawAndDepositTest {

    ATMService atm;

    @Before
    public void setUp() throws Exception {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        atm = (ATMService) ctx.getBean("atm");

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

        assertEquals(200, atm.deposit(50));

    }
}
