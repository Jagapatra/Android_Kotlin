fun main() {
    var l=5000
    var acc1=BankAccount(10,l)
    println("Current balance ${acc1.getBalance()}")
    println("Depositing 500rs")
    println("Current balance ${acc1.deposit(500)}")
    println("Withdrawing 6000rs")
    println("Current balance ${acc1.withdraw(6000)}")
}
class BankAccount(accountNumber :Int,balance:Int)
{
    var bal=balance
    fun deposit(a:Int):Int
    {
        bal=bal+a
        return bal
    }
    fun withdraw(a:Int):Int{
        if (a>bal)
            println("Low balance \nTransaction failed")
        else
            bal=bal-a
        return bal
    }
    fun getBalance():Int=bal;
}
