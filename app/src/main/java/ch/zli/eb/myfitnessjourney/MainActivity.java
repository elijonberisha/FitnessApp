package ch.zli.eb.myfitnessjourney;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // VIEW ELEMENTS AS PROPERTIES
    ProgressBar progressBar;

    TextView stepsStatus;
    TextView todaysGoalDesc;

    Button historyButton;
    Button progressButton;
    Button currentButton;
    Button createButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // ASSIGNING VIEW ELEMENTS TO PROPERTIES
        progressBar = findViewById(R.id.progressbar);

        stepsStatus = findViewById(R.id.stepsStatus);
        todaysGoalDesc = findViewById(R.id.goalDesc);

        historyButton = findViewById(R.id.historyButton);
        progressButton = findViewById(R.id.progressButton);
        currentButton = findViewById(R.id.currentButton);
        createButton = findViewById(R.id.createButton);

    }

    // HANDLES createButton CLICK -> REDIRECTS TO CREATE ACTIVITY
    public void redirectToCreateActivity(View v) {
        Intent createForm = new Intent(getApplicationContext(), CreateActivity.class);
        startActivity(createForm);
    }

    // HANDLES currentButton CLICK -> REDIRECTS TO LIST ACTIVITY
    public void redirectToListActivityCurrent(View v) {
        Intent listActivity = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(listActivity);
    }

    // HANDLES currentButton CLICK -> REDIRECTS TO LIST ACTIVITY
    public void redirectToListActivityHistory(View v) {
        Intent listActivityHistory = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(listActivityHistory);
    }
}