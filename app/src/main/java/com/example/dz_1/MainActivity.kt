package com.example.dz_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val top1 = this.findViewById<Button>( R.id.button );
        val bot1 = this.findViewById<Button>( R.id.button2 );
        val bot2 = this.findViewById<Button>( R.id.button3 );

        top1.setOnClickListener(buttonClick);
        bot1.setOnClickListener(buttonClick);
        bot2.setOnClickListener(buttonClick);

    }

    val buttonClick: View.OnClickListener = View.OnClickListener {
        view -> run {
            val tag = view.tag.toString();
            Log.d("CLICK", tag );
            Toast.makeText(view.context, tag, Toast.LENGTH_SHORT).show();
        }
    };

}