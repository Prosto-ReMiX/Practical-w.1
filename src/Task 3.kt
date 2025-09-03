fun main() {
    val array1: Array<Int> = arrayOf(1, 2, 3, 4, 5, 3, 1)
    val array2: ArrayList<Int> = arrayListOf()

    array1.forEach {
        if (!array2.contains(it)) {
            array2.add(it)
        }
    }
    array2.forEach { print("$it\t") }
}