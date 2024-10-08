import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    val div = document.createElement("div")
    div.innerHTML = "Hello World"
    document.body?.appendChild(div)
}