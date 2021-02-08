package fr.isen.escousse.androidrestaurant

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setSupportActionBar(findViewById(R.id.toolbar))

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }

        var androidlyButton = Button(this)
        androidlyButton.apply {
            layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            text = "Double the value"
            setAllCaps(false)
            textSize = 20f
            id = R.id.btnDouble
        }
        androidlyButton.setOnClickListener(this)
        linearLayout.addView(androidlyButton)

        androidlyButton = Button(this)
        androidlyButton.apply {
            layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            text = "RESET"
            textSize = 20f
            setTextColor(ContextCompat.getColor(this@MainActivity, R.color.Dark))
            id = R.id.btnReset
            setOnLongClickListener {
                txtCounter.text = 0.toString()
                true
            }
        }
        androidlyButton.setOnClickListener(this)
        linearLayout.addView(androidlyButton)

    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnDouble -> {
                txtCounter.text = (txtCounter.text.toString().toInt() * 2).toString()
            }
            R.id.btnReset -> {
                txtCounter.text = (-100).toString()
            }
            else -> {
            }
        }
    }

    fun addOne(view: View) {
        txtCounter.text = (txtCounter.text.toString().toInt() + 1).toString()
    }
    }
}