package com.example.animation;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity {
 ImageView shinchan;
 ImageView shinchan1;
 public void animate1(View view){
 shinchan.animate().scaleX(1f).scaleY(1f).translationYBy(-
110).setDuration(2000);
 shinchan1.animate().scaleX(0.5f).scaleY(0.5f).translationYBy(-
110).setDuration(2000);
 }
 public void animate2(View view){ 
shinchan.animate().scaleX(0.5f).scaleY(0.5f).translationYBy(110).setDuration(2000)
; 
 
shinchan1.animate().scaleX(1f).scaleY(1f).translationYBy(110).setDuration(2000);
 }
//can be done both ways(anim1.xml,anim2.xml or in direct java code).
 @Override
 protected void onCreate(Bundle savedInstanceState)
 {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 shinchan=findViewById(R.id.shin);
 shinchan1=findViewById(R.id.chan);
 }
}
