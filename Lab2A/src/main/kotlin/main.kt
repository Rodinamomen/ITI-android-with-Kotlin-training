fun main(){
   /* val finishNumber=5
    val startNumber=1
        for (rowsCounter in startNumber..finishNumber) {
            var starsCounter = startNumber
            while (starsCounter <= rowsCounter) {
                print("*")
                starsCounter++
            }
            println()
        }*/
    //*****************************************************************//

    /*val finishNumber =5
    val startNumber=1
    var finishSpaceNumber=5
    for (rowsCounter in startNumber..finishNumber) {
        var starsCounter = startNumber
        var spaceCounter = startNumber
        while (spaceCounter <= finishSpaceNumber) {
            print(" ")
            spaceCounter++
        }
        finishSpaceNumber--
        while (starsCounter <= rowsCounter) {
            print("* ")
            starsCounter++
        }
        println()
    }*/

    //*****************************************************************//

    val finishNumber =5
    val startNumber=1
    var finishSpaceNumber=5
    for (rowsCounter in startNumber..finishNumber){
        var starsCounter =  startNumber
        while(starsCounter<=rowsCounter){
            print("*")
            starsCounter++
        }
        println()
    }
        for (rowsCounter in startNumber..finishNumber){
            var starsCounter =  startNumber
            var spaceCounter=startNumber
            while(spaceCounter<=finishSpaceNumber){
                print(" ")
                spaceCounter++
            }
            finishSpaceNumber--
            while(starsCounter<=rowsCounter){
                print("* ")
                starsCounter++
            }
            println()
    }
}