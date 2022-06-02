/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

fun main() {
  val n = readInt()
    val a = readInts()
    val b = a.withIndex().sortedByDescending { it.value }
    var res = 0
    for(i in 0 until n){
        res+=b[i].value*i + 1
    }
    println(res)
    println(b.joinToString (" "){ "${it.index +1 }"})
}


private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }