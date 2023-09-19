package com.example.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FavoriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val source = arrayOf("https://upload.wikimedia.org/wikipedia/en/d/da/SAC_Namibia-desert-3.jpg",
            "https://live.staticflickr.com/1100/1155225799_54edad365f_b.jpg",
            "https://pixnio.com/free-images/nature-landscapes/underwater/colorful-underwater-landscape-of-a-coral-reef-725x483.jpg")
    }
}