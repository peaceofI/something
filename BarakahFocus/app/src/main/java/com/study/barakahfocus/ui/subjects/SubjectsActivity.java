package com.study.barakahfocus.ui.subjects;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.study.barakahfocus.R;

public class SubjectsActivity extends AppCompatActivity {
    private ListView listView;
    private String[] subjects = {"Mathematics", "Physics", "Chemistry", "Biology"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subjects);

        listView = findViewById(R.id.list_subjects);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, subjects);
        listView.setAdapter(adapter);
    }
}
