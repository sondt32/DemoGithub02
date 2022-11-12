package vn.edu.spx.demogithub02;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        tv.setText("Test git");
        ObjectAnimator anim1 = ObjectAnimator.ofFloat(tv,"Rotation",0,360);
        anim1.setDuration(500);
        anim1.setRepeatCount(ValueAnimator.INFINITE);
        anim1.start();
    }
}