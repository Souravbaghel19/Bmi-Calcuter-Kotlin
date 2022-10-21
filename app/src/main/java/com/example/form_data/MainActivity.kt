package com.example.form_data
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

var tvResult:TextView? = null
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)

        val etfName = findViewById<EditText>(R.id.et_fname)
        val etlName = findViewById<EditText>(R.id.et_lname)
        val etMobile = findViewById<EditText>(R.id.et_mobile)
        val etEmail = findViewById<EditText>(R.id.et_email)

        val rbGender = findViewById<RadioButton>(R.id.rb_male)
        val isMale = rbGender.text.toString()

        tvResult = findViewById(R.id.tvResult)
        val btSubmit = findViewById<Button>(R.id.bt_submit)

        btSubmit.setOnClickListener{
            val fName = etfName.text.toString()
            val lName = etlName.text.toString()
            val mobile = etMobile.text.toString()
            val email = etEmail.text.toString()
            displayResult(fName , lName, mobile , email, isMale)
        } }
    private fun displayResult(fName: String , lName: String , mobile :String ,email:String, isMale:String ){
        tvResult?.setText(fName + " "+ lName + "\n" + mobile + "\n" + email +"\n" + isMale )
    } }