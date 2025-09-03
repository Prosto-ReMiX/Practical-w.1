import kotlinx.coroutines.flow.*

suspend fun main() {
    val list: List<List<Int>> = listOf(
        listOf(1, 2, 3),
        listOf(2, 3, 4),
        listOf(0, 0, 0)
    )
    val selectedIndex: Int = readln().toInt() - 1
    val mutableListOfRow: MutableList<Int> = mutableListOf()
    for (j in list.indices) {
        mutableListOfRow.add(list[selectedIndex][j])
    }
    val sumSelectedRow = mutableListOfRow.asFlow()
    println("сумма строки ${sumSelectedRow.reduce { a, b -> a + b }}")
    mutableListOfRow.clear()

    for (i in list.indices) {
        mutableListOfRow.add(list[i][selectedIndex])
    }
    val sumSelectedCol = mutableListOfRow.asFlow()
    println("сумма столбца ${sumSelectedCol.reduce { a, b -> a + b }}")
}