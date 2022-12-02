package ca.georgiancollege.comp3025_f2022_week12a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.commit
import androidx.fragment.app.replace

open class MainActivity : AppCompatActivity() {

    open lateinit var TVShows: MutableList<TVShow>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TVShows = mutableListOf<TVShow>() // creates an empty List container

        TVShows.add(TVShow("1", "Andor", "DisneyPlus"))
    }

    fun showDialog()
    {
        val builder = AlertDialog.Builder(this)
        builder.setTitle("New Dialog")
        builder.setMessage("Example Dialog")
        builder.setPositiveButton("Ok"){dialog, _ ->
            dialog.dismiss()
        }
        builder.create().show()
    }
}