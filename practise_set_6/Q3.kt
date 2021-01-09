fun main() {
  val marks = arrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
  var sum = 0
  for (i in marks) {
    sum += i
  }
  val avg = sum / 10
  println("The Average of the Numner is : " + avg)
}
