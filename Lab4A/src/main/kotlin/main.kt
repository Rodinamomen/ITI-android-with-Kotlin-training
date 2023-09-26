fun main(){
    var R = Rectangle()
    R.setDim(50.0)
    R.setHight(50.5)
    println("Rectangle area ${R.calcArea()}")
    var C= Circle()
    C.setDim(30.0)
    println("Circle area ${C.calcArea()}")
    var T= Triangle()
    T.setBase(70.0)
    T.setDim(40.0)
    println("Triangle area ${T.calcArea()}")
    var p = Picture()
    println("Total area ${p.sumAreas(T,R,C)}")
}

 abstract class Shape (private var dim:Double){
  constructor():this(0.0)
   private var dimension: Double=0.0
     fun getDim(): Double{
         return dimension
     }
    fun setDim(value: Double) {
        if(value>0) {
            dimension = value
        }
     }
     abstract fun calcArea() : Double
}
class Rectangle(private var width: Double, private var height:Double) :Shape(width) {
    constructor() : this(0.0, 0.0)
    private var heightof: Double = 0.0
    fun getHight(): Double {
        return heightof
    }
    fun setHight(value: Double) {
        if (value > 0) {
            heightof = value
        }/* else {
            println("height Must be greater than 0")
        }*/
    }


    override fun calcArea(): Double {
        return this.heightof * getDim()
    }
}

class Circle(private var R: Double): Shape(R) {
    constructor() : this(0.0)
    override fun calcArea(): Double {
        return 3.14 * getDim()* getDim()
    }

}
class Triangle(private var base: Double ,private var height:Double ): Shape(height) {
    constructor() : this(0.0, 0.0)
    private var baseOf :Double =0.0
    fun setBase(value:Double){
        if(value>0){
            baseOf=value
        }/*else{
            println("Base must be greater than zero")
        }*/
    }
    fun getBase():Double{
        return baseOf
    }

    override fun calcArea(): Double {
        return 0.5 * getDim() * this.baseOf
    }
}
class Picture(){
    fun sumAreas( Shape1 : Shape ,Shape2: Shape ,  Shape3:Shape): Double {

        return Shape1.calcArea()+Shape2.calcArea()+Shape3.calcArea()
    }
}


