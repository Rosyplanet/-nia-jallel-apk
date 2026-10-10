package com.jallel.nia;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
@Override
public void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);

    LinearLayout layout = new LinearLayout(this);
    layout.setOrientation(LinearLayout.VERTICAL);
    layout.setGravity(Gravity.CENTER);
    layout.setPadding(32, 32, 32, 32);
    layout.setBackgroundColor(Color.rgb(10, 20, 42));

    TextView title = new TextView(this);
    title.setText("NIA Jallel");
    title.setTextSize(32);
    title.setTextColor(Color.rgb(0, 220, 210));
    title.setGravity(Gravity.CENTER);

    TextView subtitle = new TextView(this);
    subtitle.setText("Votre intelligence, toujours à vos côtés.");
    subtitle.setTextSize(16);
    subtitle.setTextColor(Color.WHITE);
    subtitle.setGravity(Gravity.CENTER);
    subtitle.setPadding(0, 24, 0, 0);

    layout.addView(title);
    layout.addView(subtitle);
    setContentView(layout);
}

}