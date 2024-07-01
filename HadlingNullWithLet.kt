fun main() {
    
    var len="Android Batch 2"
    println("String: $len")
    
    //Using user defined function
    print("String after Upper function: ")
    var upper=HandlingNullWithLet(len)  
}

fun HandlingNullWithLet(str:String?)
{
    if(str!=null)
    {
        var upperStr = str.let { it.toUpperCase() }
        print("$upperStr")
    }
    else
    	println("String is null.")
}
