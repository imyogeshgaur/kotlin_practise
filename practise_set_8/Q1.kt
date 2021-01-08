class Employee(){
    fun setSalary(sal:Int){
       val salaryOfEmployee = sal
       println("The Salary of the Employee is : "+salaryOfEmployee)
    }
    fun setname(name:String){
      val nameOfEmployee = name
      println("The Name of the Employee is :"+nameOfEmployee)
    }
}

fun main(){
    val emp = Employee()
    emp.setname("Yogesh")
    emp.setSalary(56)
}