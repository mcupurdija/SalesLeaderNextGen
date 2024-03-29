package com.intelisale.core.dialogFragment;

import android.os.Bundle;
import android.text.TextUtils;

import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/**
 * This object should be used in activities and fragments in order to manage dialogs.
 */
@UiThread
public class DialogFragmentManager {

    /**
     * Whenever a dialog is shown with non-empty "id", the provided id will be stored in
     * arguments Bundle under this key.
     */
    public static final String ARGUMENT_DIALOG_ID = "ARGUMENT_DIALOG_ID";

    /**
     * In case Activity or Fragment that instantiated this DialogFragmentManager are re-created (e.g.
     * in case of memory reclaim by OS, orientation change, etc.), we need to be able
     * to get a reference to dialog that might have been shown. This tag will be supplied with
     * all DialogFragment's shown by this DialogFragmentManager and can be used to query
     * {@link FragmentManager} for last shown dialog.
     */
    private static final String DIALOG_FRAGMENT_TAG = "DIALOG_FRAGMENT_TAG";


    private FragmentManager mFragmentManager;
    private DialogFragment mCurrentlyShownDialog;

    public DialogFragmentManager(FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;

        // there might be some dialog already shown
        Fragment fragmentWithDialogTag = fragmentManager.findFragmentByTag(DIALOG_FRAGMENT_TAG);
        if (fragmentWithDialogTag != null
                && DialogFragment.class.isAssignableFrom(fragmentWithDialogTag.getClass())) {
            mCurrentlyShownDialog = (DialogFragment) fragmentWithDialogTag;
        }
    }

    /**
     * @return a reference to currently shown dialog, or null if no dialog is shown.
     */
    @Nullable
    public DialogFragment getCurrentlyShownDialog() {
        return mCurrentlyShownDialog;
    }

    /**
     * Obtain the id of the currently shown dialog.
     *
     * @return the id of the currently shown dialog; empty string if no dialog is shown, or the currently
     * shown dialog has no id
     */
    public String getCurrentlyShownDialogId() {
        if (mCurrentlyShownDialog == null || mCurrentlyShownDialog.getArguments() == null ||
                !mCurrentlyShownDialog.getArguments().containsKey(ARGUMENT_DIALOG_ID)) {
            return "";
        } else {
            return mCurrentlyShownDialog.getArguments().getString(ARGUMENT_DIALOG_ID);
        }
    }

    /**
     * Check whether a dialog with a specified id is currently shown
     *
     * @param id dialog id to query
     * @return true if a dialog with the given id is currently shown; false otherwise
     */
    public boolean isDialogCurrentlyShown(String id) {
        String shownDialogId = getCurrentlyShownDialogId();
        return !TextUtils.isEmpty(shownDialogId) && shownDialogId.equals(id);
    }

    /**
     * Dismiss the currently shown dialog. Has no effect if no dialog is shown. Please note that
     * we always allow state loss upon dismissal.
     */
    public void dismissCurrentlyShownDialog() {
        if (mCurrentlyShownDialog != null) {
            mCurrentlyShownDialog.dismissAllowingStateLoss();
            mCurrentlyShownDialog = null;
        }
    }

    /**
     * Show dialog and assign it a given "id". Replaces any other currently shown dialog.
     *
     * @param dialog dialog to show
     * @param id     string that uniquely identifies the dialog; can be null
     */
    public void showDialogWithId(DialogFragment dialog, @Nullable String id) {
        dismissCurrentlyShownDialog();
        setId(dialog, id);
        showDialog(dialog);
    }

    private void setId(DialogFragment dialog, String id) {
        Bundle args = dialog.getArguments() != null ? dialog.getArguments() : new Bundle(1);
        args.putString(ARGUMENT_DIALOG_ID, id);
        dialog.setArguments(args);
    }

    private void showDialog(DialogFragment dialog) {
        mFragmentManager.beginTransaction()
                .add(dialog, DIALOG_FRAGMENT_TAG)
                .commitAllowingStateLoss();
        mCurrentlyShownDialog = dialog;
    }
}
