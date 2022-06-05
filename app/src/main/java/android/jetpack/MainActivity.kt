package android.jetpack

import android.graphics.Color
import android.os.Bundle
import android.util.TypedValue
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    // On definit les ViewGroup(LinearLayout, RadioGroup.. ), et les Views (TextView, EditText,..)
    private var layout: LinearLayout? = null
    private var text1: TextView? = null
    private var text2: TextView? = null
    private var editText1: EditText? = null
    private var editText2: EditText? = null
    private var checkBox1: CheckBox? = null
    private var checkBox2: CheckBox? = null
    private var radioGroup: RadioGroup? = null
    private var radioButton1: RadioButton? = null
    private var radioButton2: RadioButton? = null
    private var spinner: Spinner? = null
    private var adapter: ArrayAdapter<*>? = null
    private val pays = arrayOf("France", "Espagne", "Italie", "Ukraine")
    private var toggleButton1: ToggleButton? = null
    private var toggleButton2: ToggleButton? = null
    private var imageView: ImageView? = null
    var layoutParams // define dimensions
            : LinearLayout.LayoutParams? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // init Layout
        layout = LinearLayout(this)
        layout!!.orientation = LinearLayout.VERTICAL

        // TextView
        text1 = TextView(this)
        text1!!.text = "Text 1"
        text2 = TextView(this)
        text2!!.text = "Text 2"

        // EditText
        editText1 = EditText(this)
        editText2 = EditText(this)

        // CheckBox
        checkBox1 = CheckBox(this)
        checkBox1!!.setText(R.string.francais)
        checkBox2 = CheckBox(this)
        checkBox2!!.setText(R.string.anglais)

        // RadioGroup
        radioGroup = RadioGroup(this)
        radioGroup!!.orientation = LinearLayout.HORIZONTAL
        radioButton1 = RadioButton(this)
        radioButton1!!.setText(R.string.marie)
        radioButton2 = RadioButton(this)
        radioButton2!!.setText(R.string.celibataire)
        radioGroup!!.addView(radioButton1)
        radioGroup!!.addView(radioButton2)

        // init model for spinner
//        String [] pays = {this.getString(R.string.francais),
//                            this.getString((R.string.anglais)),
//                                    this.getString((R.string.italie))};
        val pays = resources.getStringArray(R.array.list)
        // Spinner
        spinner = Spinner(this)
        adapter = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, pays)
        spinner!!.adapter = adapter

        // ToggleButton
        toggleButton1 = ToggleButton(this)
        toggleButton1!!.text = "Active"
        toggleButton2 = ToggleButton(this)
        toggleButton2!!.text = "Off"

        // ImageView
        imageView = ImageView(this)
        imageView!!.setImageResource(R.drawable.raw)
        layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        editText1!!.layoutParams = layoutParams
        // SP est une unité indépendante de la résultion de l'écran qui
        // depend des preferences utilisatuer que on applique aux taille de caractères
        // size in float
        text1!!.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
        text1!!.setTextColor(Color.BLUE)

        // add view into viewGroup
        layout!!.addView(text1)
        layout!!.addView(text2)
        layout!!.addView(editText1)
        layout!!.addView(editText2)
        layout!!.addView(checkBox1)
        layout!!.addView(checkBox2)
        layout!!.addView(radioGroup)
        layout!!.addView(spinner)
        layout!!.addView(toggleButton1)
        layout!!.addView(toggleButton2)
        layout!!.addView(imageView)
        setContentView(layout)
        //        setContentView(R.layout.activity_main);
    }
}