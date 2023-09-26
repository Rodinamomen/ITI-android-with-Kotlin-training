fun main(){
    var x : Int=1
    while(x in 1..20){
        if(x==15) break
        if(x%4==0){
            x++
            continue
        }
        println(x)
        x++
      }
}