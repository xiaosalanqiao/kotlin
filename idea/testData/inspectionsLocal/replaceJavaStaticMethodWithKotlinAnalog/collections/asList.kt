// WITH_RUNTIME
// FIX: Replace with `listOf` function
import java.util.Arrays

fun test() {
    val a = Arrays.<caret>asList(1, 3, null)
}