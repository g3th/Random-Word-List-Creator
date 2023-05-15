import java.io.*

fun main(){
	
	// Choose your own directories, no Path for now.

    var counter = 0
    val readFile = File("words.txt").readLines()
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
        File("random_words").appendText("${i.lowercase()}\n")
    }
    val readRandomWordsFile = File("random_words").readLines()
    println("number of queries (max: (${directory.size -1}): ")
    val q = readln().toInt()
    while (counter != q){
        query.add(readRandomWordsFile.random())
        counter +=1
    }
    for (j in query){
        File("queries").appendText("${j.lowercase()}\n")
    }
}
