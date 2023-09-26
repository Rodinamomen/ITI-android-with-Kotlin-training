fun main(){
    println("please enter your first name")
    val firstName: String = readln()
    println("please enter your second name")
    val secondName: String = readln()
    println("Your first name is $firstName with length ${firstName.length} ")
    println("Your second name is $secondName with length ${secondName.length} ")
    println("The full name is $firstName $secondName with total length = ${firstName.length+secondName.length}")
}