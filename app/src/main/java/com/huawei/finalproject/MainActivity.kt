package com.huawei.finalproject

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                val greetingTextView = findViewById<TextView>(R.id.studentID)
                val inputField = findViewById<EditText>(R.id.signIN)
                val submitButton = findViewById<Button>(R.id.btnEnter)
                submitButton.setOnClickListener{
                    val enteredName = inputField.text.toString()
                    if (enteredName != "2019866")
                        greetingTextView.text = "Please enter the correct ID, hint 2019866 ;)"
                    else {

                        val message = "Welcome $enteredName"
                        greetingTextView.text = message
                        inputField.text.clear()
                    }
            }
        }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}

