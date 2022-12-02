package ca.georgiancollege.comp3025_f2022_week12a

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class FragmentTwo: Fragment(R.layout.fragment_two)
{
    override fun onViewCreated(view: View, savedInstanceState: Bundle?)
    {
        super.onViewCreated(view, savedInstanceState)

        var FragmentTwoToOneButton = getView()?.findViewById<Button>(R.id.fragment_two_to_one_button)

        FragmentTwoToOneButton?.setOnClickListener{
            (activity as MainActivity).supportFragmentManager.commit{
                replace<FragmentOne>(R.id.fragment_container)
            }
        }
    }
}