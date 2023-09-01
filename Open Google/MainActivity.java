package com.example.intent;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
 Button b1;
 ImageView i1;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 b1=(Button) findViewById(R.id.button);
 i1=(ImageView) findViewById(R.id.imageView2);
 b1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 gotoUrl("https://www.google.com");
 }
 });
 }
 private void gotoUrl(String s) {
 Uri uri=Uri.parse(s);
 startActivity(new Intent(Intent.ACTION_VIEW,uri));
 }
}
