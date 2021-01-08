class Square(side:Int){
    var sideOfSquare = side
    fun findArea(){
       var areaOfSquare = sideOfSquare*sideOfSquare
       print("The Area of the Square is : $areaOfSquare")
    }
    fun findPerimeter(){
       var perimeterOfSquare = 4*sideOfSquare
       print("The Area of the Square is : $perimeterOfSquare")
    }

}

fun main(){
    val sq = Square(5)
    sq.findPerimeter()
    sq.findArea()
}