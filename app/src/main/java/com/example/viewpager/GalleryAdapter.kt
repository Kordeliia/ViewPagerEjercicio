package com.example.viewpager

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy

class GalleryAdapter(private val urls: Array<String>): PagerAdapter() {
    override fun getCount(): Int = urls.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean = view == `object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val imageView = ImageView(container.context)
        Glide.with(container.context).load(urls[position]).diskCacheStrategy(DiskCacheStrategy.ALL).centerCrop().into(imageView)
        container.addView(imageView, 0)
        return super.instantiateItem(container, position)
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ImageView)
    }

}