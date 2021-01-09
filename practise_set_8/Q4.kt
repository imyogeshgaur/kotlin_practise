class Rectangle(length: Int, breadth: Int) {
    var lengthOfRectangle = length
    var breadthOfRectangle = breadth
    fun findArea() {
        var areaOfRectangle = lengthOfRectangle * breadthOfRectangle
        print("The Area of Rectangle is : $areaOfRectangle")
    }
    fun findPerimeter() {
        var perimeterOfRectangle = 2 * (lengthOfRectangle + breadthOfRectangle)
        print("The Area of Rectangle is : $perimeterOfRectangle")
    }
}

fun main() {
    val rect = Rectangle(4, 5)
    rect.findPerimeter()
    rect.findArea()
}
