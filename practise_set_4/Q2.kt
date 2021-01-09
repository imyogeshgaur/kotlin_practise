fun main() {
    print("Enter the Marks in Subject 1 : ")
    var sub1: Int = Integer.valueOf(readLine())
    print("Enter the Marks in Subject 2 : ")
    var sub2: Int = Integer.valueOf(readLine())
    print("Enter the Marks in Subject 3 : ")
    var sub3: Int = Integer.valueOf(readLine())

    val total: Int = sub1 + sub2 + sub3

    if (total / 3 > 40 && sub1 > 33) {
        print("You Are Passed !!!")
    } else if (total / 3 > 40 && sub2 > 33) {
        print("You Are Passed !!!")
    } else if (total / 3 > 40 && sub3 > 33) {
        print("You Are Passed !!!")
    } else {
        print("You are Fail !!!")
    }
}
