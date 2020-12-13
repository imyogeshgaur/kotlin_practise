fun main() {
    print("Enter the Year : ")
    val year: Int = Integer.valueOf(readLine())
    if (year % 4 == 0) {
        print("The Year is a Leap Year !!!")
    }else{
        print("The Year is not Leap Year !!!")
    }
}
