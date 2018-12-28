package br.com.tokenlab.kotlinrichtextandroid

import android.graphics.drawable.Drawable
import br.com.tokenlab.kotlinrichtext.UpdateSpan
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.transition.Transition

class CustomGlideTarget (private val span: UpdateSpan): SimpleTarget<Drawable>() {
    override fun onResourceReady(resource: Drawable, transition: Transition<in Drawable>?) {
        span.update(resource)
    }
}