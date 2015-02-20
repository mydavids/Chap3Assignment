package za.ac.cput.mydavids.dep.impl;

import za.ac.cput.mydavids.dep.Deposit;

/**
 * Created by student on 2015/02/19.
 */
public class DepositImpl implements Deposit {

    @Override
    public int deposit(int a, int b) {
        return a + b;
    }
}

