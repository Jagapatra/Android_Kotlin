import kotlinx.coroutines.*

fun main() {
    val people = listOf(
        "Jagannath" to 19,
        "Arpit" to 23,
        "Satya" to 22,
        "Adyasha" to 18
    )
    val sort = people.sortedBy { it.second }
    println("People sorted by age:")
    sort.forEach { (name, age) -> println("$name age is $age ")
    }
}
