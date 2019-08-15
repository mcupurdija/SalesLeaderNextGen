package com.intelisale.core.notifications;

import android.content.Context;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class DialogManager {

    private final Context mContext;

    public DialogManager(Context mContext) {
        this.mContext = mContext;
    }

    public void showAlertDialog(String message) {
        new MaterialAlertDialogBuilder(mContext)
                .setTitle("Error")
                .setMessage(message)
                .setPositiveButton("Ok", null)
                .show();
    }
}
