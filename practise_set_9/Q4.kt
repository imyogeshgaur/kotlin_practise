class Rectangle2(var length: Int = 4, var breadth: Int = 5) {
    val lengthOfRectangle = length
    val breadthOfRectangle = breadth
}

fun main() {
    val rect = Rectangle2()
    println(rect.lengthOfRectangle)
    println(rect.breadthOfRectangle)
}
