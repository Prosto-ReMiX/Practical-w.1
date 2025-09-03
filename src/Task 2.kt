fun main() {
    val list: List<Int> = listOf(2, 2, 3, 4, 5)
    val mutableList: MutableList<Int> = list.toMutableList()
    val minOfList: Int? = mutableList.minOrNull()

    for (i in mutableList.indices) {
        if (mutableList[i] == minOfList) {
            mutableList[i] *= mutableList[i]
        }
    }
    mutableList.forEach { print("$it") }
}