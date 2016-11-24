package com.verifone.kail1.androidlifeperiodtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by KaiL1 on 2016/11/24.
 */

public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.normal_layout);
    }
}
