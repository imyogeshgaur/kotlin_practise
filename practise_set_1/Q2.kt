import java.lang.Math

fun main(){
    print("Enter the Marks in Subject 1 : ")
    var sub1:Int = Integer.valueOf(readLine())
    print("Enter the Marks in Subject 2 : ")
    var sub2:Int = Integer.valueOf(readLine())
    print("Enter the Marks in Subject 3 : ")
    var sub3:Int = Integer.valueOf(readLine())

    var totalMarks:Int = sub1+sub2+sub3
    var CGPA:Float = totalMarks/30.0f
    var newCGPA:Int  = Math.round(CGPA)
    print("The CGPA of the Student is : "+newCGPA)
}