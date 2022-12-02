package ca.georgiancollege.comp3025_f2022_week12a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var FragmentOneButton = findViewById<Button>(R.id.fragment_one_button)
        var FragmentTwoButton = findViewById<Button>(R.id.fragment_two_button)

        FragmentOneButton.setOnClickListener{
            supportFragmentManager.commit {
                replace<FragmentOne>(R.id.fragment_container)
            }
        }

        FragmentTwoButton.setOnClickListener {
            supportFragmentManager.commit{
                replace<FragmentTwo>(R.id.fragment_container)
            }
        }
    }
}