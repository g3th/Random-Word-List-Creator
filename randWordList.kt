import java.io.*

fun main(){

	// Place Dictionary on Desktop

    val userDir = System.getProperty("user.home") + "/Desktop/"
    var counter = 0
    val readFile = File("${userDir}words.txt").readLines()
    val directory = mutableListOf<String>()
    val query = mutableListOf<String>()
    println("number of words (max. 466550): ")
    val n = readln().toInt()
    while (counter != n){
        directory.add(readFile.random())
        counter += 1
    }
    counter = 0
    for (i in directory) {
        File("${userDir}random_words").appendText("${i.lowercase()}\n")
    }
    val readRandomWordsFile = File("${userDir}random_words").readLines()
    println("number of queries (max: (${directory.size -1}): ")
    val q = readln().toInt()
    while (counter != q){
        query.add(readRandomWordsFile.random())
        counter +=1
    }
    for (j in query){
        File("${userDir}queries").appendText("${j.lowercase()}\n")
    }
}
