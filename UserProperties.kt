fun main() {
    
    var user1=User("Jaga","jagapatra40")
    var user2=User("Arpit",null)
    var user3=User("Sandip","dashsandip")
    
    //Using user defined function
    properties(user1)
    properties(user2)
    properties(user3)
}

data class User(var Name:String?,var Email:String?)

fun properties(user:User)
{
    println("Details:")
    var arg=0
    if(user.Name==null || user.Email==null)
    {
        println("Incomplete details\n")
    }
    else{
        println("$user\n")
    }
    
}
