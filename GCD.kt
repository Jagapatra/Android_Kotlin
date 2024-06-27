fun main() {
    var a=270
    var b=111
    var temp=0
    var num1=a
    var num2=b
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    
    if(num1==num2)
    {
        println("$num1 is the GCD of  $num1 and $num2")
    }
    else if(num1==0 )
    {
        println("$num2 is the GCD of $num1 and $num2")
    }
    else if(num2==0)
    {
        println("$num1 is the GCD of $num1 and $num2")
    }
    else
    {
        println("$a is the GCD of $num1 and $num2")
    }
}
