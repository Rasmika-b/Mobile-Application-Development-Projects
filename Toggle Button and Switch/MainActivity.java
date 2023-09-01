package com.example.button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
 ToggleButton tb;
 Switch s;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 tb=findViewById(R.id.tb);
 s=findViewById(R.id.s);
 tb.setTextOn("TV is on");
 tb.setTextOff("TV is off");
 s.setTextOn("AC is on");
 s.setTextOff("AC is off");
 tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() 
{
 @Override
 public void onCheckedChanged(CompoundButton buttonView, boolean 
isChecked) {
 if(isChecked){
 Toast.makeText(getApplicationContext(),tb.getTextOn(), 
Toast.LENGTH_LONG).show();
 }
 else {
 Toast.makeText(getApplicationContext(),tb.getTextOff(), 
Toast.LENGTH_LONG).show();
 }
 }
 });
 s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() 
{
 @Override
 public void onCheckedChanged(CompoundButton buttonView, boolean 
isChecked) {
 if(isChecked){
 Toast.makeText(getApplicationContext(),s.getTextOn(), 
Toast.LENGTH_LONG).show();
 }
 else {
 Toast.makeText(getApplicationContext(),s.getTextOff(), 
Toast.LENGTH_LONG).show();
 }
 }
 });
 }
}
