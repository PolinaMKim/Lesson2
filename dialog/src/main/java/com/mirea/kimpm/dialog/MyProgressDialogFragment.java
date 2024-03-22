package com.mirea.kimpm.dialog;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.text.Html;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class MyProgressDialogFragment extends DialogFragment {
    private ProgressDialog progressDialog;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage(Html.fromHtml("<big>Загружается...</big>"));
        progressDialog.setTitle("Ожидайте, мы стараемся");
        progressDialog.setIndeterminate(true);
        return progressDialog;
    }
}
