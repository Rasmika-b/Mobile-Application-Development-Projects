package com.example.currency;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
 EditText t1, t2;
 Button b1,b2,b3,b4;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
   super.onCreate(savedInstanceState);
   setContentView(R.layout.activity_main);
   t1=findViewById(R.id.T1);
   t2=findViewById(R.id.T2);
   b1=findViewById(R.id.B1);
   b2=findViewById(R.id.B2);
   b3=findViewById(R.id.B3);
   b4=findViewById(R.id.B4);
 b1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
   String value1=t1.getText().toString();
   int a=Integer.parseInt(value1);
   double usdd= a*0.014;
   t2.setText(String.valueOf(usdd));
 }
 });
 b2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
   String value1=t1.getText().toString();
   int a=Integer.parseInt(value1);
   double eurr= a*0.011;
   t2.setText(String.valueOf(eurr));
 }
 });
 b3.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
   String value1=t1.getText().toString();
   int a=Integer.parseInt(value1);
   double jpyy= a*1.44;
   t2.setText(String.valueOf(jpyy));
 }
 });
 b4.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
   String value1=t1.getText().toString();
   int a=Integer.parseInt(value1);
   double cadd= a*0.017;
   t2.setText(String.valueOf(cadd));
 }
 });
 }
}
