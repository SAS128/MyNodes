package com.example.mynodes;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Date;
import java.util.Calendar;
public class CustomDialogFragment extends DialogFragment {
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
                        .setTitle("Выберете точную дату со временем!")
                        .setMessage(String.valueOf(currentTime))
                        .setIcon(R.drawable.ic_launcher_background)
                        .setPositiveButton("OK", null)
                        .setNegativeButton("Cancel", null)
                        .create();

    }
}
