fun main() {
    val str: String = readln()
    val number: Int = str.toInt()

    if (number / 10 != 0) {
        print("$number - число трехзначное")
    }
    else if (number % 100 / 10 != 0) {
        print("$number - число двухзначное")
    }
    else if (number % 10 != 0) {
        print("$number - число однозначное")
    }
}