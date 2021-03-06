package br.com.tokenlab.kotlinrichtext

import android.os.Build
import android.text.Html
import android.text.method.LinkMovementMethod
import android.widget.TextView

class RichTextParser(private val urlImageParser: URLImageParser) {

    fun parse(textView: TextView, text: String, clickable: Boolean = true) {
        urlImageParser.textView = textView

        textView.text = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            Html.fromHtml(text, 0, urlImageParser, Html.TagHandler { _, _, _, _ ->  })
        } else {
            @Suppress("DEPRECATION")
            Html.fromHtml(text, urlImageParser, Html.TagHandler { _, _, _, _ ->  })
        }

        if (clickable) {
            textView.movementMethod = LinkMovementMethod.getInstance()
        }
    }
}