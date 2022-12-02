package ca.georgiancollege.comp3025_f2022_week12a

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class FragmentOne: Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_one, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var tvShows = (activity as MainActivity).TVShows
        tvShows.add(TVShow("2", "Star Trek: Strange New World", "Paramount+"))

        for (tvShow in tvShows)
        {
            Log.i("TVSHow", tvShow.toString())
        }

        var FragmentOneToTwoButton = getView()?.findViewById<Button>(R.id.fragment_one_to_two_button)

        FragmentOneToTwoButton?.setOnClickListener{
            (activity as MainActivity).supportFragmentManager.commit{
                replace<FragmentTwo>(R.id.fragment_container)
            }
        }

        (activity as MainActivity).showDialog()
    }
}