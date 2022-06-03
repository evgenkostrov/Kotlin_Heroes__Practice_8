/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

fun main() {
var n =readInt()
    val s = HashSet<Int>()
    while (!s.contains(n)){ //while(s.add(n))
        s.add(n)
        n +=1
        while (n%10 == 0 ){
            n/=10
        }
    }
    println(s.size)
}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }