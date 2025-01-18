fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) //This will print [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3,4,5)
    val doubledMutableList = mutableList.map{it * 2} //This is still not modifying the original list
    println(doubledMutableList) //This will print [2, 4, 6, 8, 10]
    println(mutableList) //This will print [1,2,3,4,5]

    //To modify the original mutable list, use mapTo
    mutableList.mapTo(mutableList){it * 2}
    println(mutableList) //This will print [2, 4, 6, 8, 10]
    
    //Another approach is to use forEach and modify the mutable list.
    val anotherMutableList = mutableListOf(1,2,3,4,5)
    anotherMutableList.forEachIndexed{index, value -> anotherMutableList[index] = value * 2}
    println(anotherMutableList) //This will print [2,4,6,8,10]
} 