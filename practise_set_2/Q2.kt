fun main(){
    print("Enter the Grade of the Student : ")
    var originalGrade:Int = Integer.valueOf(readLine())
    var encryptedGrade:Int = originalGrade+8
    print("The Encrypted Grade is : "+encryptedGrade)
    print("\nThe Decrypted Grade is : "+originalGrade)
}