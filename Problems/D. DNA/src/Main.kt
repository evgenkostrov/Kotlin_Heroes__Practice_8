/**
 * Вы имеете стажировку с биологической иследовательской группой изучающей ДНК.
 * Одиночная нитка ДНК состоит из множества ген, которые попадают в различные категории, называемые генотипы.
 * Генотипы ограничены специфическими последовательностями нуклеотидов известные как генные маркеры.
 * Каждый генотип i имеет уникальный стартовый маркер si и уникальный конечный маркер ei
 * После множества грязной работы (растущие бактерии, извлечение ячеек, белковая инженерия и т.д.)
 * ваша исследовательская группа может конвертировать ДНК в форму состоящую только из генных маркеров
 * удаляя весь генетический материал лежащий между маркерами.
 * Ваша
 *
 * i
 *
 *
 */

fun main() {
  readLine()
    val data = readLine()!!.split(" ").map{it.startsWith("s") to it.drop(1).toInt()}
    val genes = data.map{it.second}.toSet()
    val balance = IntArray(genes.max()!! + 1)
    val minBalance = IntArray(balance.size)
    val possible = BooleanArray(balance.size)
    fun impact(gene:Int)=if (possible[gene]&& balance[gene]==minBalance[gene]) 1 else 0
    fun process(atZero:Int)=data.scan(atZero){acc, (isStart,gene)->
        val impactBefore = impact(gene)
        balance[gene]+=if (isStart) 1 else -1
        minBalance[gene]=minOf(minBalance[gene], balance[gene])
        acc - impactBefore+ impact(gene)
    }
    process(0)
    genes.filter{balance[it]==0}.forEach{possible[it]=true}
    val atZero = genes.sumBy{impact(it)}
    val answer = process(atZero).withIndex().maxBy{it.value}!!
    println("${answer.index + 1} ${answer.value}")
}