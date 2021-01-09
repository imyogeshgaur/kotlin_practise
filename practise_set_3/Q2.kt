import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter the String : ")
    var originalString = sc.nextLine()
    var newString = originalString.replace(" ", "_")
    print("The new String is : " + newString)
}
