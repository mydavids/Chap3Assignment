package za.ac.cput.mydavids.atminterface;

/**
 * Created by student on 2015/02/19.
 */
public class ATM implements ATMService {

    public int startBal = 0;

    public ATM(int b){
        startBal = b;
    }


    @Override
    public int withdraw(int b) {
        return startBal - b;
    }

    @Override
    public int deposit(int b) {
        return startBal + b;
    }
}
