package br.com.tokenlab.kotlinrichtext

import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.text.Html
import android.widget.TextView

class URLImageParser(var callback: (UpdateSpan, String) -> Unit) : Html.ImageGetter{

    lateinit var textView: TextView

    override fun getDrawable(url: String): Drawable {
        val urlDrawable = UrlDrawable(textView)

        callback(urlDrawable, url)
        return urlDrawable
    }

    class UrlDrawable(val textView: TextView) : BitmapDrawable(), UpdateSpan {
        var drawable: Drawable? = null
        override fun draw(canvas: Canvas) {
            if (drawable != null)
                drawable!!.draw(canvas)
        }

        override fun update(drawable: Drawable) {
            textView.post {
                val w = textView.width
                val hh = drawable.intrinsicHeight
                val ww = drawable.intrinsicWidth
                val newHeight = hh * w / ww
                val rect = Rect(0, 0, w, newHeight)
                drawable.bounds = rect
                this.bounds = rect
                this.drawable = drawable
                textView.text = textView.text
                textView.invalidate()
            }
        }
    }
}