package za.ac.cput.mydavids.wit.Impl;

import za.ac.cput.mydavids.wit.Withdraw;

/**
 * Created by student on 2015/02/19.
 */
public class WithdrawImpl implements Withdraw {

    @Override
    public int withdraw(int a, int b) {
        return a - b;
    }
}
