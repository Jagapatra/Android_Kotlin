fun main() {
    var List=listOf(Person("Jagannath",19)
    ,Person("Satya",20)
    ,Person("Arpit",20)
    ,Person("Sandip",18)) 
    
    //Using user defined function
    var assendingByAge=List.sortedWith(compareBy({ it.Age }, { it.Name }))
    println(assendingByAge)
    
}

data class Person(var Name:String,var Age:Int)

