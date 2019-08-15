package com.intelisale.core.util;

import android.content.Intent;

public class ActivityHelper {

    public static Intent intentTo(String className) {
        return new Intent(Intent.ACTION_VIEW).setClassName("com.intelisale.salesleader", className);
    }
}
