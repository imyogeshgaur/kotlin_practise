class CellPhone() {
  fun vibrate() {
    print("Ringing.....!!! \n")
  }
  fun ring() {
    print("Vibrating....!!!")
  }
}

fun main() {
  val cell = CellPhone()
  cell.vibrate()
  cell.ring()
}
