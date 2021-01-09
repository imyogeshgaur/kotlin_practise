fun main() {
    var num = listOf(1, 2, 3, 4, 5)
    println("Enter the Number You Wanna Find : ")
    var numToFind: Int = Integer.valueOf(readLine())
    if (num.contains(numToFind)) {
        println("The number ${numToFind} is Present in Array !!!")
    } else {
        println("The number ${numToFind} is not Present in Array !!!")
    }
}
