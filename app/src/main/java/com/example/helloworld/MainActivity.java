package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.util.TypedValue;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    // On definit les ViewGroup(LinearLayout, RadioGroup.. ), et les Views (TextView, EditText,..)
    private LinearLayout layout;
    private TextView text1;
    private TextView text2;
    private EditText editText1;
    private EditText editText2;
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private RadioGroup radioGroup;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    private Spinner spinner;
    private ArrayAdapter adapter;
    private String[] pays = {"France", "Espagne", "Italie", "Ukraine"};

    private ToggleButton toggleButton1;
    private ToggleButton toggleButton2;

    private ImageView imageView;

    LinearLayout.LayoutParams layoutParams; // define dimensions

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // init Layout
        layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        // TextView
        text1 = new TextView(this);
        text1.setText("Text 1");
        text2 = new TextView(this);
        text2.setText("Text 2");

        // EditText
        editText1 = new EditText(this);
        editText2 = new EditText(this);

        // CheckBox
        checkBox1 = new CheckBox(this);
        checkBox1.setText(R.string.francais);
        checkBox2 = new CheckBox(this);
        checkBox2.setText(R.string.anglais);

        // RadioGroup
        radioGroup = new RadioGroup(this);
        radioGroup.setOrientation(LinearLayout.HORIZONTAL);
        radioButton1 = new RadioButton(this);
        radioButton1.setText(R.string.marie);
        radioButton2 = new RadioButton(this);
        radioButton2.setText(R.string.celibataire);
        radioGroup.addView(radioButton1);
        radioGroup.addView(radioButton2);

        // init model for spinner
//        String [] pays = {this.getString(R.string.francais),
//                            this.getString((R.string.anglais)),
//                                    this.getString((R.string.italie))};
        String [] pays = getResources().getStringArray(R.array.list);
        // Spinner
        spinner = new Spinner(this);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, pays);
        spinner.setAdapter(adapter);

        // ToggleButton
        toggleButton1 = new ToggleButton(this);
        toggleButton1.setText("Active");
        toggleButton2 = new ToggleButton(this);
        toggleButton2.setText("Off");

        // ImageView
        imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.raw);

        layoutParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        editText1.setLayoutParams(layoutParams);
        // SP est une unité indépendante de la résultion de l'écran qui
        // depend des preferences utilisatuer que on applique aux taille de caractères
        // size in float
        text1.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f);
        text1.setTextColor(Color.BLUE);

        // add view into viewGroup
        layout.addView(text1);
        layout.addView(text2);
        layout.addView(editText1);
        layout.addView(editText2);
        layout.addView(checkBox1);
        layout.addView(checkBox2);
        layout.addView(radioGroup);
        layout.addView(spinner);
        layout.addView(toggleButton1);
        layout.addView(toggleButton2);
        layout.addView(imageView);

        setContentView(layout);
//        setContentView(R.layout.activity_main);
    }
}