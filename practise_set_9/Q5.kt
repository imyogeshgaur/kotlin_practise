class Sphere {
    var sphereRadius = 0
        set(value) {
            field = value
        }
        get() {
            return field
        }
}

fun main() {
    val sp = Sphere()
    sp.sphereRadius = 4
    println("The Radius of the Sphere is : " + sp.sphereRadius)
}
