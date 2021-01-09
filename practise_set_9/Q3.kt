class Cyllinder2(val radius: Double, val height: Double) {
    val radiusOfCyllinder = radius
    val heightOfCyllinder = height
}

fun main() {
    val cy = Cyllinder2(3.5, 4.6)
    println("The radius of the Cyllinder is : " + cy.radiusOfCyllinder)
    println("The heigth of the Cyllinder is : " + cy.heightOfCyllinder)
}
