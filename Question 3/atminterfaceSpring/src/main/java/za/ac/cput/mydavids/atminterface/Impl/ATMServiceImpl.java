package za.ac.cput.mydavids.atminterface.Impl;

import za.ac.cput.mydavids.atminterface.ATMService;

/**
 * Created by student on 2015/02/19.
 */
public class ATMServiceImpl implements ATMService {

    public int startBal = 0;

    public ATMServiceImpl(int b){
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
