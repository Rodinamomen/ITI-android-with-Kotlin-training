fun main(){
    var l = Librarian()
    var b= LibararyDataBase()
    var flag =1
   while(flag==1) {
       println("Hello ${l.getPersonName()} with you ")
       println(
           "1  add a book \n" +
                   " 2 view the available book\n" +
                   " 3 search for any book\n" +
                   " 4 track loaned books\n" +
                   " 0 to finish "
       )
       var valueEnterd: String = readln()

       if (valueEnterd == "1") {
           println("Please enter the book you want to add")
           var newBook: String = readln()
           b.addBook(newBook)
       } else if (valueEnterd == "2") {
           println(b.viewAvilableBooks())
       } else if (valueEnterd == "3") {
           println("Please enter the book you want to search")
           var searchBook: String = readln()
           b.searchForABook(searchBook)
       } else if (valueEnterd == "4") {
           println("Please enter the book name ")
           var lendedBookName = readln()
           b.keepTrackofLendedBooks(lendedBookName)
       } else if(valueEnterd =="0"){
           flag=0
       }
       else {
           println("unavailable input ")
       }
   }
}
//***************************////***************************//
  class Book(private var Title:String){
    constructor():this("Default Title")
      var availableBooks= mutableSetOf<String>("book1","Book2")
      var borrowedBooks= mutableMapOf<String, String>("book3" to "ahmed" )
    private var bookTitle :String = "Default Title"
    fun getBookTitle() : String{
        return bookTitle
    }
    fun setBookTitle(value:String){
        value.toString()
        bookTitle = value
        availableBooks.add(bookTitle.toString())
        println(availableBooks)
    }
    fun lend (userName:String, BookName: String){
        availableBooks.remove(BookName)
        borrowedBooks.put(BookName,userName)
        println("The avilable books after adding is $availableBooks \n and the borrowedBook after adding is $borrowedBooks")
    }

    fun isAvailable(bookKey:String):Boolean{
        return availableBooks.contains(bookKey)
    }
}
//***************************////***************************//
 open class Person(private var name: String ,private var id: Int){
     constructor():this("Librarian ", 0)
     private var personName : String = "Librarian"
     fun getPersonName() : String{
         return personName
     }
     fun setPersonName(value:String){
         personName=value
     }
     private var personId :Int = 0
     fun getPersonId () : Int{
         return personId
     }
     fun setPersonId (value:Int){
         personId =value
     }
 }
//***************************////***************************//
open class Librarian(private var password :String ): Person("The librarian", 0){
    constructor():this("password")
    private var librarianPassword="librarian"
    fun setLibrarianPassword(value:String){
        librarianPassword=value
        }
    fun getLibrarianPassword():String{
        return  librarianPassword
    }

}
//***************************////***************************//
open class User(private var job :String):Person("Default name ", 0){
    constructor():this(" Default job")
    private var userJob="Default Job"
    fun setUserJob(value:String){
        userJob=value
    }
    fun getUserJob():String{
        return  userJob
    }
}
//***************************////***************************//
open class LibararyDataBase(){
    var currentLibrarian= Librarian().getPersonName()
    var availableBooksDB=Book()
    var borrowedBooksDB = Book()
    fun addBook(bookNameAdded:String){
        availableBooksDB.setBookTitle(bookNameAdded)
    }
    fun viewAvilableBooks():MutableSet<String> {
        return availableBooksDB.availableBooks

    }
   fun searchForABook(bookSearch:String){
       if(availableBooksDB.isAvailable(bookSearch)){
           println("book $bookSearch is Available")
       }else {
           println("book $bookSearch is not Available")
       }
    }
    fun keepTrackofLendedBooks(lendedBookName:String) {
        if (borrowedBooksDB.borrowedBooks.contains(lendedBookName)) {
            println("book: $lendedBookName with ${borrowedBooksDB.borrowedBooks[lendedBookName]} ")
        } else {
            println(" The book has not been borrowed ")
        }
    }
}
