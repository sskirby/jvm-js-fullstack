import kotlinx.browser.document
import react.child
import react.dom.render

fun main() {
//    document.getElementById("root")?.innerHTML = "Hello, Kotlin/JS! Modified by someone!"
    render(document.getElementById("root")) {
        child(App)
    }
}
