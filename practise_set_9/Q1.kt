class Cyllinder {
    var radiusOfCyllinder = 0
    var heightOfCyllinder = 0
        set(value) {
            field = value
        }
        get() {
            return field
        }
}

fun main() {
    val p = Cyllinder()
    p.radiusOfCyllinder = 42
    p.heightOfCyllinder = 45
    println("The radius of the Cyllinder is : " + p.radiusOfCyllinder)
    println("The height of the Cyllinder is : " + p.heightOfCyllinder)
}
