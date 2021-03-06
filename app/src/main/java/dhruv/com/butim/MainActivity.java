package dhruv.com.butim;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.dhruv.timerbutton.TimerButton;

public class MainActivity extends AppCompatActivity {

    private static final long MILLIS_IN_FUTURE = 12000L;

    private TimerButton mTimerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button endAnimButton = findViewById(R.id.end_anim_button);
        mTimerButton = findViewById(R.id.timer_button);
//        mTimerButton.setBeforeAnimationText(getString(R.string.send_otp));
//        mTimerButton.setDynamicText(R.string.resend_otp_formatted);
//        mTimerButton.setOnAnimationCompleteText(getString(R.string.resend_otp));
//        mTimerButton.setButtonBackground(R.drawable.selector_button);
//        mTimerButton.setAnimationBackground(R.color.colorPrimaryTrans);
        mTimerButton.setDuration(MILLIS_IN_FUTURE);

        endAnimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTimerButton.reset();
            }
        });
    }
}
