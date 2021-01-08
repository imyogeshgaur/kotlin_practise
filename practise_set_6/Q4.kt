fun main(){
    val row = 2
    val column=3
    val mat1 = arrayOf(intArrayOf(2,3,4),intArrayOf(5,2,3))
    val mat2 = arrayOf(intArrayOf(1,7,9),intArrayOf(6,2,0))

    val res = Array(row) {IntArray(column)}
    for(i in 0..row-1){
       for(j in 0..column-1){
           res [i][j] = mat1[i][j]+mat2[i][j];
       }
    } 
    println("The Resultant of the Matrix is : ")
    for(i in res){
        for(j in i){
            print("$j   ")
        }
        println()
    }

}