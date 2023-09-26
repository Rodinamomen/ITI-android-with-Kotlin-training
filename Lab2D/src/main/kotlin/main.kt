fun main(){
    println(variableType("X"))
}
fun variableType(X: Any) : String {
    return when (X) {
        is String -> "$X is String"
        is Int -> "$X is Integer"
        is Double -> "$X is double"
        else-> "$X not String or Int or Double"

    }
}