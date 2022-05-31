/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

fun main() {
    repeat(readInt()){
        val (a,b)=readInts()
        println(a+b)
    }

}

private fun readInt()=readLine()!!.toInt()
private fun readInts()= readLine()!!.split(" ").map{it.toInt()}