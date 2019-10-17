package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//:=extends
class MainActivity : AppCompatActivity() {

    //Appcreate=main()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Create the UI
        //R= resources
        setContentView(R.layout.activity_main)
        //TODO : Continue work here
        //val = value , var = variable
        //Java int x; Kolin val x:int
        //findViewById=link program to UI
        val buttonClickMe : Button = findViewById(R.id.buttonClickMe)
        buttonClickMe.setOnClickListener { showMessage() }

        val buttonReset : Button = findViewById(R.id.buttonReset)
        buttonReset.setOnClickListener({ showMessage() })
    }

    private fun showMessage() {
      val textViewMessage: TextView =findViewById(R.id.textViewMessage)
        textViewMessage.setText(getString(R.string.hello))
    }

}
