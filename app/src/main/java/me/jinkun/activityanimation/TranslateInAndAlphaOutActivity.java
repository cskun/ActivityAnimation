package me.jinkun.activityanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TranslateInAndAlphaOutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_translate_in_and_alpha_out);
    }

    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.anim_alpha_in, R.anim.anim_alpha_out);
    }
}
