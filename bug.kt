fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3)
    mutableList.add(4)
    mutableList.add(5)
    val resultMutable = mutableList.map { it * 2 }
    println(resultMutable) // Output: [2, 4, 6, 8, 10] 
}