fun main(){
    println("please enter your name")
    val name : String = readln()
    println("Please enter the temperature in numbers")
    val degree : String = readln()
    println("please enter unit of temperature measurement you want to convert to fr for Fahrenheit and cel for Celsius")
    val unit : String = readln()
    println("Your name is $name")
    if( unit == "fr"){
        val  fahrenheitDegree : Double =(degree.toDouble()*(1.8))+32.0
        println("The degree in Fahrenheit is $fahrenheitDegree")
    } else if ( unit == "cel"){
        // ليه لما حطيت 5/9 في اقواس جابلي 0 يعني عاملها انها int
        val celsiusDegree : Double = (degree.toDouble()-32.0) * (5.0/9)
        println("The degree in Celsius is $celsiusDegree")
    } else {
        println("The degree should be fr or cel")
    }

}