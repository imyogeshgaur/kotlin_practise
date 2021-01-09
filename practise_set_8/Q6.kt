class Circle(radius: Int) {
    var radiusOfCircle = radius
    fun findArea() {
        var areaOfCircle = Math.PI * radiusOfCircle * radiusOfCircle
        print("The Area of the Circle is : $areaOfCircle")
    }
    fun findPerimeter() {
        var perimeterOfCircle = 2 * radiusOfCircle * Math.PI
        print("The Area of the Circle is : $perimeterOfCircle")
    }
}

fun main() {
    val sq = Circle(2)
    sq.findPerimeter()
    sq.findArea()
}
