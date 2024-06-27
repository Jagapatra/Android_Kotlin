fun main() {
    var i=0
    var j=0
    var num=1634
    var arm=0
    var temp=num
    var a=0
    while(num>0)
    {
        i++
        num=num/10
    }
    num=temp
    for(j in 1..i)
    {
        a=temp%10
        arm += Math.pow(a.toDouble(), i.toDouble()).toInt()
        temp=temp/ 10
        
    }
    if(arm==num)
    {
        println("$num is an Armstrong number")
    }
}
