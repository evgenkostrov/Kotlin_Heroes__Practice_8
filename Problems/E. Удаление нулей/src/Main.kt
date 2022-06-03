/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

fun main() {
    repeat(readInt()) {
        var s = readLine()!!
        val i = s.indexOf('1')
        if (i == -1) {
            println(0)
        } else {
            val j = s.lastIndexOf('1')
            val ans = s.substring(i until j).count { it == '0' }
            println(ans)
        }
    }
}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }