fun main(){
   checkNull(null)

}
fun checkNull(name :String?){
    println("Length is ${name?.length}")
    println("Length is ${name?.length?:0}")
    if(name!=null){
        println("Length is ${name?.length}")
    }
    name?.let {
        println("Length is ${name?.length}")
    }

}