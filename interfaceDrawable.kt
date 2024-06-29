fun main() {
    val sq = Square()
    val tri = Triangle()
    sq.drawinfo()
    tri.drawinfo()
}

interface Drawable {
    fun drawinfo()
}

class Square : Drawable {
    override fun drawinfo() {
        println("Inside Square class drawinfo function")
    }
}

class Triangle : Drawable {
    override fun drawinfo() {
        println("Inside Triangle class drawinfo function")
    }
}
