fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    //This will print [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3,4,5)
    mutableList.map{ it * 2}
    println(mutableList) //This will print [1,2,3,4,5], because map doesn't modify the original list
    mutableList.mapTo(mutableListOf()){it * 2} //This will print a new list with doubled values
}