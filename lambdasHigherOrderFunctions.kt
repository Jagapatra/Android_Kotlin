fun main() {
    val names = listOf("Android", "Batch", "Silicon")
    val upperNames = transformStrings(names) { it.uppercase() }

    println("Uppercase names: $upperNames")
}

fun transformStrings(strings: List<String>, transformation: (String) -> String): List<String> 
{
    return strings.map(transformation)
}
