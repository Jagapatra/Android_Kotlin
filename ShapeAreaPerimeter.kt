fun main() {
    var l1=50.25
    var l2=30.15
    var rad=35.56
    var rec=rectangle(l1,l2)
    var circle=circle(rad)
    println("Rectangle\nArea:${rec.area()}\nPerimeter:${rec.perimeter()}")
    println("Circle\nArea:${circle.area()}\nPerimeter:${circle.perimeter()}")

    }
abstract class shape{
    abstract fun area ():Double 
}

class rectangle(var side1:Double, var side2:Double):shape(){
    override fun area():Double {
        return side1*side2
    }
    
    fun perimeter():Double=2*side1+2*side2
}

class circle(var radius:Double):shape(){
    override fun area():Double {
        return 3.14*radius*radius
    }
    
    fun perimeter():Double=2*3.142*radius
}
