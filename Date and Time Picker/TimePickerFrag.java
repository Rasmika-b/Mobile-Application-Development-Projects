package com.example.picker;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import java.text.DateFormat;
import java.util.Calendar;
public class TimePickerFrag extends DialogFragment {
 @NonNull
 @Override
 public Dialog onCreateDialog(Bundle savedInstanceState) {
 Calendar c = Calendar.getInstance();
 int hour =c.get(Calendar.HOUR_OF_DAY);
 int minute = c.get(Calendar.MINUTE);
 return new TimePickerDialog(getActivity(), 
(TimePickerDialog.OnTimeSetListener) getActivity(),hour,minute, 
android.text.format.DateFormat.is24HourFormat(getActivity()));
 }
}
