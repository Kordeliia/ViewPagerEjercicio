package com.example.viewpager

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.size
import androidx.fragment.app.FragmentFactory
import androidx.viewpager.widget.ViewPager
import com.example.viewpager.databinding.FragmentFavoriteBinding


class FavoriteFragment : Fragment() {
    private var binding: FragmentFavoriteBinding? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        binding?.let{return it.root}
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val source = arrayOf("https://upload.wikimedia.org/wikipedia/en/d/da/SAC_Namibia-desert-3.jpg",
            "https://live.staticflickr.com/1100/1155225799_54edad365f_b.jpg",
            "https://pixnio.com/free-images/nature-landscapes/underwater/colorful-underwater-landscape-of-a-coral-reef-725x483.jpg")

        val galleryAdapter = GalleryAdapter(source)
        binding?.let {bind ->
            bind.vpGallery.adapter = galleryAdapter
            bind.idBefore.setOnClickListener { beforeImage(bind.vpGallery) }
            bind.idNext.setOnClickListener { nextImage(bind.vpGallery) }
        }
    }
    private fun beforeImage(viewPager: ViewPager){
        if(viewPager.currentItem > 0) viewPager.currentItem -= 1
    }
    private fun nextImage(viewPager: ViewPager){
        if(viewPager.currentItem < viewPager.size -1) viewPager.currentItem += 1
    }
}