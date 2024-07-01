fun main() {
    var str="Jagannath"
    
    //Using user defined function
    var len=LengthOfString(str)
    println("Length of String '$str' : $len")
    
    var str1=null
    var len1=LengthOfString(str1)
    println("Length of String '$str1' : $len1")
}

fun LengthOfString(str :String?):Int
{
    if(str!=null)
    {
    var len=str.length
    return len
    }
    else
    return -1
}

