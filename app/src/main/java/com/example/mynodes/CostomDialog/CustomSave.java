package com.example.mynodes.CostomDialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import com.example.mynodes.R;

import java.util.Date;
import java.util.Calendar;
public class CustomSave extends DialogFragment {
    @NonNull
    public Dialog onCreateDialog(Bundle savedInst)
    {   Date currentTime = Calendar.getInstance().getTime();

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        return
//                builder.setView(R.layout.activity_main)
//                        .setTitle("Test title")
//                        .setMessage("This is same test...")
//                        .setIcon(R.drawable.ic_launcher_background)
//                        .setPositiveButton("+", null)
//                        .setNegativeButton("-", null)
//                        .create();

                builder.setTitle(String.valueOf(currentTime))
                        .setTitle("Saved")
                        .setIcon(R.drawable.ic_launcher_background)
                        .setPositiveButton("OK", null)
                        .create();

    }
}