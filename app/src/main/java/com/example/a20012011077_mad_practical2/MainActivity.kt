package com.example.a20012011077_mad_practical2

import android.os.Bundle
import android.util.Log
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }

    override fun onStart() {
        super.onStart()
        Log.d("My Log","onStart Function Call")
       Toast.makeText(this,"onStart Function Call",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("My Log","onResume Function Call")
        Snackbar.make(findViewById(R.id.parent),"onResume Function call",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("My Log","onPause Function Call")
        Toast.makeText(this,"onPause Function Call",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("My Log","onStop Function Call")
        Toast.makeText(this,"onStop Function Call",Toast.LENGTH_SHORT).show()
    }

}