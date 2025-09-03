import kotlinx.coroutines.flow.*

suspend fun main() {
    val list: List<List<Int>> = listOf(
        listOf(1, 2, 3),
        listOf(2, 3, 4),
        listOf(0, 0, 0)
    )
    val selectedIndex: Int = readln().toInt() - 1

    val tempMutableList: MutableList<Int> = mutableListOf()
    for (j in list.indices) {
        tempMutableList.add(list[selectedIndex][j])
    }
    val sumSelectedRow = tempMutableList.asFlow()
    println("сумма строки ${sumSelectedRow.reduce { a, b -> a + b }}")
    tempMutableList.clear()

    for (i in list.indices) {
        tempMutableList.add(list[i][selectedIndex])
    }
    val sumSelectedCol = tempMutableList.asFlow()
    println("сумма столбца ${sumSelectedCol.reduce { a, b -> a + b }}")

    var sumRow: Int = 0
    var sumCol: Int = 0

    for (j in list.indices) {
        sumRow += list[selectedIndex][j]
    }
    println(sumRow)
    for (i in list.indices) {
        sumCol += list[i][selectedIndex]
    }
    println(sumCol)
}