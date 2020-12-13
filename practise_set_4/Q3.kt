fun main() {
    print("Enter the Salary : ")
    val salary: Int = Integer.valueOf(readLine())

    if (salary <250000) {
        print("You are exempted from Tax !!!")
    } else if (salary >= 250000 && salary <500000) {
        val taxPayed:Int = salary / 20
        print("The Tax paid by You is : " + taxPayed)
    } else if (salary >= 500000 && salary <1000000) {
        val taxPayed:Int  = salary / 5
        print("The Tax paid by You is : " + taxPayed)
    } else {
        val taxPayed:Double  = salary * 0.3
        print("The Tax paid by You is : " + taxPayed)
    }
}
