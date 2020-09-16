package co.tiagoaguiar.clone.googleplay.util

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.util.LruCache
import android.widget.ImageView
import androidx.core.graphics.drawable.RoundedBitmapDrawable
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import co.tiagoaguiar.clone.googleplay.R
import java.net.HttpURLConnection
import java.net.URL

object ImageDownloader {

    private var memoryCache: LruCache<String, Bitmap>

    init {
        val maxMemory = (Runtime.getRuntime().maxMemory() / 1024).toInt()

        // Use 1/8th of the available memory for this memory cache.
        val cacheSize = maxMemory / 8

        memoryCache = object : LruCache<String, Bitmap>(cacheSize) {
            override fun sizeOf(key: String, bitmap: Bitmap): Int {
                // The cache size will be measured in kilobytes rather than
                // number of items.
                return bitmap.byteCount / 1024
            }
        }
    }

    fun download(imageView: ImageView, url: String, cornerScale: Int = 0) {
        val imageKey = url

        val bitmap: Bitmap? = getBitmapFromMemCache(imageKey)?.also {
            imageView.setImageBitmap(it)
        } ?: run {
            //imageView.setImageResource(R.drawable.image_placeholder)


            Thread {
                val conn = URL(url).openConnection() as HttpURLConnection
                try {
                    val responseCode = conn.responseCode
                    if (responseCode == 200) {
                        val inputStream = conn.inputStream
                        val bitmap = BitmapFactory.decodeStream(inputStream)

                        val dr: RoundedBitmapDrawable = RoundedBitmapDrawableFactory.create(
                            imageView.resources,
                            bitmap
                        )
                        dr.cornerRadius = (bitmap.width / cornerScale).toFloat()

                        imageView.setImageDrawable(dr)

                        memoryCache.put(imageKey, bitmap)
                    } else {

                    }
                } catch (e: Exception) {

                }
            }.start()

            null
        }

    }

    private fun getBitmapFromMemCache(imageKey: String): Bitmap? {
        return memoryCache[imageKey]
    }

}