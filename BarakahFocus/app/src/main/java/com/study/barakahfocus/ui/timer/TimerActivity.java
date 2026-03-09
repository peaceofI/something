package com.study.barakahfocus.ui.timer;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.study.barakahfocus.R;

public class TimerActivity extends AppCompatActivity {
    private TextView tvTimer;
    private Button btnStart;
    private CountDownTimer timer;
    private boolean isRunning = false;
    private long timeLeft = 25 * 60 * 1000; // 25 minutes default

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        tvTimer = findViewById(R.id.tv_timer);
        btnStart = findViewById(R.id.btn_start);

        updateTimerText();

        btnStart.setOnClickListener(v -> {
            if (isRunning) {
                pauseTimer();
            } else {
                startTimer();
            }
        });
    }

    private void startTimer() {
        timer = new CountDownTimer(timeLeft, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timeLeft = millisUntilFinished;
                updateTimerText();
            }

            @Override
            public void onFinish() {
                isRunning = false;
                btnStart.setText("Start");
                // Play sound, notify, etc.
            }
        }.start();
        isRunning = true;
        btnStart.setText("Pause");
    }

    private void pauseTimer() {
        timer.cancel();
        isRunning = false;
        btnStart.setText("Start");
    }

    private void updateTimerText() {
        int minutes = (int) (timeLeft / 1000) / 60;
        int seconds = (int) (timeLeft / 1000) % 60;
        tvTimer.setText(String.format("%02d:%02d", minutes, seconds));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (timer != null) timer.cancel();
    }
}
