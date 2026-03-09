package com.study.barakahfocus.ui.dashboard;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.widget.TextView;
import com.study.barakahfocus.R;
import com.study.barakahfocus.ui.timer.TimerActivity;

public class DashboardActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        TextView tvTotalStudy = findViewById(R.id.tv_total_study);
        TextView tvNextRoutine = findViewById(R.id.tv_next_routine);
        TextView tvUpcomingTask = findViewById(R.id.tv_upcoming_task);
        TextView tvNextPrayer = findViewById(R.id.tv_next_prayer);
        CardView btnStartStudy = findViewById(R.id.btn_start_study);

        // Dummy data
        tvTotalStudy.setText("Today: 2h 15m");
        tvNextRoutine.setText("Next: Math Study at 4:00 PM");
        tvUpcomingTask.setText("Task: Finish Physics HW");
        tvNextPrayer.setText("Next Prayer: Asr 3:30 PM");

        btnStartStudy.setOnClickListener(v -> {
            startActivity(new Intent(this, TimerActivity.class));
        });
    }
}
