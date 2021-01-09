class Cyllinder1 {
    var radiusOfCyllinder = 0
    var heightOfCyllinder = 0
        set(value) {
            field = value
        }
        get() {
            return field
        }
    fun calculateArea() {
        val areaOfCyllinder =
                2 * Math.PI * radiusOfCyllinder * (heightOfCyllinder + radiusOfCyllinder)
        print("The Area of the Cyllinder is : $areaOfCyllinder")
    }
    fun calculateVolume() {
        val volumeOfCyllinder = Math.PI * radiusOfCyllinder * radiusOfCyllinder * heightOfCyllinder
        print("The Area of the Cyllinder is : $volumeOfCyllinder")
    }
}

fun main() {
    val p = Cyllinder1()
    p.radiusOfCyllinder = 42
    p.heightOfCyllinder = 45
    p.calculateArea()
    p.calculateVolume()
}
