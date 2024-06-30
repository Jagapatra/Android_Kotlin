fun main() {
    var l="Android Batch 2"
    isPalindrome(l)
}
fun isPalindrome(str:String ) 
{
    var temp=str
    var a=0
    var i=0
    var sum=str.length
    print("String '$str' is ")
    /*for(a in temp)
    {
        sum++
    }*/
    for (a in temp)
    {
        if(temp[i]!=temp[sum-1-i])
        {
            print("Not a palindrome")
            break
        }
        i++
        
    }
    if(i==sum)
    	println("Is a palindrome")
}











































