/**
 * Accomplished using the EduTools plugin by JetBrains https://plugins.jetbrains.com/plugin/10081-edutools
 *
 * To modify the template, go to Preferences -> Editor -> File and Code Templates -> Other
 */

fun main() {
    var a1 = readInt()
    var a2 = readInt()
    var k1 = readInt()
    var k2 = readInt()
    val n = readInt()
    // идеальная для "минимальной" ситуация когда все игроки "висят" на карточках, то есть получили по к - 1 карточке
    val min = maxOf(0, n - ((k1 - 1) * a1 + (k2 - 1) * a2))

    //далее находим команду где условия для получения карточек и удаления самые жесткие- т.е минимум карточек нужно
    //для удаления (и поэтому вероятность что в этой команда максимальное число гроков удалено)
    //и если это не так изначально то меняем команды местами.
    if (k1 > k2) {
        a1 = a2.also { a2 = a1 }
        k1 = k2.also { k2 = k1 }
    }

    // и далее рассматриваем 2 условия когда все удаленные игроки будут из этой команды
    //и второе когда ко всем удаленным игрокам из первой команды прибавим сколькото из второй

    val max = if (n <= a1 * k1) {
        n / k1
    } else {
        (a1 + (n - a1 * k1) / k2)
    }

    println("$min $max")

}

private fun readInt() = readLine()!!.toInt()
private fun readInts() = readLine()!!.split(" ").map { it.toInt() }