fun main(){
   var nums  = listOf(1.2f,2.3f,3.4f,4.5f,5.6f)
   var sum:Float = 0.0f
   for(i in nums){
       sum += i
   }
   println("The Sum is ${sum}")
}