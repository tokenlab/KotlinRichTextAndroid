<h1>Rich Text Parser Example</h1>
                <p>This shows the basic use of this lib</p>
                <ul>
                <li>&nbsp; It shows a <i>HTML text</i> as a <strong>formatted text</strong></li>
                <li>&nbsp; It accepts tags <b>b</b> <strong>strong</strong> <i>i</i> <em>em</em> 
                <u>u</u> <sub>sub</sub> <strike>strike</strike> <sup>sup</sup></li>
                <li>&nbsp; <span style="color: blue">Inlined style</span> works too</li>
                <li>&nbsp; It also accepts clickable link: <a href="https://github.com/tokenlab/KotlinRichTextAndroid">our GitHub</a></li>
                <li>&nbsp; It can even be configured to show images!</li>
                </ul>
                <img src="https://semcomp.icmc.usp.br/21/media/empresas/tokenlab_dAbUzoS.png.400x130_q85.png">
                <p>Easy to use with any image downloader you like.<br>
                Check this example to see how to use with <a href="https://github.com/bumptech/glide">Glide</a></p>
                <div>
                <h5 style="text-align: center;">How to use</h5>
                <p>Add this line on your <em>build.gradle</em> file: <br>
                <small><b>
                repositories {<br>
                &nbsp;&nbsp;maven { url "https://jitpack.io" }<br>
                }
                </b></small></p>
                <p>Import the lib: <br>
                <small><b>implementation 'com.github.tokenlab:KotlinRichTextAndroid:x.x.x'</b></small></p>
                <p>Create a URLImageParser:<br>
                <small><b>
                val imageDownloader = URLImageParser {<br>
                &nbsp;&nbsp;updateSpan, image -> ...<br>
                }
                </b></small></p>
                <p>Create a RichTextParser:<br>
                <small><b>val richTextParser = RichTextParser(imageDownloader)</b></small></p>
                <p>Use it:<br>
                <small><b>richTextParser.parse(textView, htmlText, isClickable)</b></small></p>
                </div>
