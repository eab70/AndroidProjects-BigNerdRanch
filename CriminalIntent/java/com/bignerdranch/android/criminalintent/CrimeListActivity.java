package com.bignerdranch.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by eabac on 7/24/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
