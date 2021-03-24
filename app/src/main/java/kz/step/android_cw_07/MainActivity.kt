package kz.step.android_cw_07

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var textViewVersion: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
    }

    fun initializeViews(){
        textViewVersion = findViewById(R.id.textview_version)
        textViewVersion?.text = Build.VERSION.RELEASE
    }


}