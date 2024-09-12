package dev.f04c.myawesomeresume;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    TextView objectiveDetails;
    TextView experienceDetails;
    TextView firstCourse;
    TextView secondCourse;
    TextView gitText;
    TextView htmlText;
    TextView mySQLText;

    SeekBar gitSeekBar;
    SeekBar htmlSeekBar;
    SeekBar mySQLSeekBar;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        checkBox = findViewById(R.id.objectiveCheckbox);
        checkBox2 = findViewById(R.id.experienceCheckbox);
        checkBox3 = findViewById(R.id.educationCheckbox);
        checkBox4 = findViewById(R.id.skillsCheckbox);
        objectiveDetails = findViewById(R.id.objectiveDetails);
        experienceDetails = findViewById(R.id.experienceDetails);
        firstCourse = findViewById(R.id.firstCourse);
        secondCourse = findViewById(R.id.secondCourse);
        gitText = findViewById(R.id.gitText);
        htmlText = findViewById(R.id.htmlText);
        mySQLText = findViewById(R.id.mySQLText);

        gitSeekBar = findViewById(R.id.gitSeekBar);
        htmlSeekBar = findViewById(R.id.htmlSeekBar);
        mySQLSeekBar = findViewById(R.id.mysqlSeekBar);


        gitSeekBar.setOnTouchListener((v, event) -> true);
        htmlSeekBar.setOnTouchListener((v, event) -> true);
        mySQLSeekBar.setOnTouchListener((v, event) -> true);
//        gitSeekBar.setEnabled(false);
//        htmlSeekBar.setEnabled(false);
//        mySQLSeekBar.setEnabled(false);

//
        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                objectiveDetails.setVisibility(View.INVISIBLE);
            } else {
                objectiveDetails.setVisibility(View.VISIBLE);
            }
        });

        checkBox2.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                experienceDetails.setVisibility(View.INVISIBLE);
            } else {
                experienceDetails.setVisibility(View.VISIBLE);
            }
        });

        checkBox3.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                firstCourse.setVisibility(View.INVISIBLE);
                secondCourse.setVisibility(View.INVISIBLE);
            } else {
                firstCourse.setVisibility(View.VISIBLE);
                secondCourse.setVisibility(View.VISIBLE);
            }
        });


        checkBox4.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                gitText.setVisibility(View.INVISIBLE);
                gitSeekBar.setVisibility(View.INVISIBLE);
                htmlText.setVisibility(View.INVISIBLE);
                htmlSeekBar.setVisibility(View.INVISIBLE);
                mySQLText.setVisibility(View.INVISIBLE);
                mySQLSeekBar.setVisibility(View.INVISIBLE);
            }
            else {
                gitText.setVisibility(View.VISIBLE);
                gitSeekBar.setVisibility(View.VISIBLE);
                htmlText.setVisibility(View.VISIBLE);
                htmlSeekBar.setVisibility(View.VISIBLE);
                mySQLText.setVisibility(View.VISIBLE);
                mySQLSeekBar.setVisibility(View.VISIBLE);
            };
        });
    }


}
