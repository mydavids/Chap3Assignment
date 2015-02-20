package za.ac.cput.mydavids.phonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by student on 2015/02/19.
 */
public class Phonebook {

    private static Map book = new HashMap();
    private static List listBook = new ArrayList();

    public Phonebook(){
        book.put("Lamees Baker", "0724212006");
        book.put("Yusiry Davids", "0742229999");
        book.put("Rahin Davids", "0711187215");

        listBook.add("Lamees Baker");
        listBook.add("Yusiry Davids");
        listBook.add("Rahin Davids");
    }

    public static int getSize(){
        return book.size();
    }

    public static String search(String a){
        return (String) book.get(a);
    }

    public static void delete(String a){
        book.remove(a);
    }

    public static int getListSize(){
        return listBook.size();
    }

    public static String history(int i){
        return (String) listBook.get(i);
    }

}
