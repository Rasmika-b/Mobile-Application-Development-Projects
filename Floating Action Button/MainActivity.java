package com.example.animation;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
public class MainActivity extends AppCompatActivity {
 FloatingActionButton fab1,fab2,fab3,fab4,fab5,fab6,fab7,fab8,fab9,fab10;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 fab1=findViewById(R.id.fab1);
 fab2=findViewById(R.id.fab2);
 fab3=findViewById(R.id.fab3);
 fab4=findViewById(R.id.fab4);
 fab5=findViewById(R.id.fab5);
 fab6=findViewById(R.id.fab6);
 fab7=findViewById(R.id.fab7);
 fab8=findViewById(R.id.fab8);
 fab9=findViewById(R.id.fab9);
 fab10=findViewById(R.id.fab10);
 fab1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 fab2.setVisibility(View.VISIBLE);
 fab3.setVisibility(View.VISIBLE);
 fab4.setVisibility(View.VISIBLE);
 fab2.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View v) {
 fab5.setVisibility(View.VISIBLE);
 fab6.setVisibility(View.VISIBLE);
 }
 });
 fab3.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View v) {
 fab7.setVisibility(View.VISIBLE);
 fab8.setVisibility(View.VISIBLE);
 }
 });
 fab4.setOnClickListener(new View.OnClickListener() {
 @Override
public void onClick(View v) {
 fab9.setVisibility(View.VISIBLE);
 fab10.setVisibility(View.VISIBLE);
 }
 });
 }
 });
 }
}
