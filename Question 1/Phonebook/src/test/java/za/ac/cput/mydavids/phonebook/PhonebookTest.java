package za.ac.cput.mydavids.phonebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by student on 2015/02/19.
 */
public class PhonebookTest {


    Phonebook PK = new Phonebook();

    @Before
    public void setUp() throws Exception {



    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testInitial() throws Exception {

        assertEquals(3, PK.getSize());

    }

    @Test
    public void testSearch() throws Exception {

        assertEquals(PK.search("Lamees Baker"), "0724212006");

    }

    @Test
    public void testDelete() throws Exception {

        PK.delete("Yusiry Davids");
        assertEquals(2, PK.getSize());

    }

    @Test
    public void testHistory() throws Exception {

        assertEquals(3, PK.getListSize());

        for (int i = 0; i < PK.getListSize(); i++){
            System.out.println(PK.history(i));
        }
    }
}
