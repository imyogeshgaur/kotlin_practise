import java.util.Scanner

fun main() {
    var sc = Scanner(System.`in`)
    print("Enter the Domain of Websire : ")
    var domainName = sc.nextLine()
    if (domainName.contains(".com")) {
        print("It is a Comercial Website !!")
    } else if (domainName.contains(".org")) {
        print("It is a Orgnisation Website !!")
    } else if (domainName.contains(".in")) {
        print("It is a Indian Website !!")
    } else {
        print("Undetectable Domain Extension!!")
    }
}
