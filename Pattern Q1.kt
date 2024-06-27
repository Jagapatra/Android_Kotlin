fun main() {
    var i=0
    var j=0
    var num=5
    var a=0
    for(i in 0 .. num)
    {
        for(j in num-1 downTo i)
        {
            print(" ")
        }
        for(a in 0 .. 2*i)
        {
            print("*")
        }
        println()
    }
    for(i in num downTo 0)
    {
        for(j in num-1 downTo i)
        {
            print(" ")
        }
        for(a in 2*i downTo 0)
        {
            print("*")
        }
        println()
    }
}
