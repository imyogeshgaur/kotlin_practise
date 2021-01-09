import java.util.Scanner

fun main() {
   print("Enter The String : ")
   val sc = Scanner(System.`in`)
   var originalString = sc.nextLine()
   var newString = originalString.toLowerCase()
   print("The New String is : " + newString)
}
