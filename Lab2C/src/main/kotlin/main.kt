fun main(){
  var  familyName: String = "mobark"
  var name : String= familyName.greet(firstName = "rodina", lastName = "momen")
    println(name)

}
fun String.greet(firstName: String, lastName: String, ) :String {
    return "$firstName $lastName $this"
}