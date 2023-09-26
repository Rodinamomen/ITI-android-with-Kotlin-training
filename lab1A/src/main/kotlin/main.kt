fun main(){
    println("calculator")
    println("please enter the first number")
    val no1 : String = readln()
    println("please enter the second number")
    val no2 : String = readln()
    println("please enter one operator from those * - + /")
    val operator : String = readln()
    if (operator == "+"){
        val sumResult : Double = no1.toDouble() + no2.toDouble();
        println( "$no1 + $no2 = $sumResult" )
    }else if (operator == "*"){
        val mulResult : Double = no1.toDouble() * no2.toDouble();
        println( "$no1 * $no2 = $mulResult" )
    } else if (operator == "-"){
        val subResult : Double = no1.toDouble() - no2.toDouble();
        println( "$no1 - $no2 = $subResult" )
    } else if (operator == "/"){
        val divideResult : Double = no1.toDouble() / no2.toDouble();
        if(no2.toDouble()!=0.0){
            println( "$no1 / $no2 = $divideResult" )
        } else{
            println("You can not divide over zero")
        }
    }
}