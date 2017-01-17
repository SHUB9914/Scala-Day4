class FirstName(val fname: String) extends AnyVal {            //Defining Value class
override def toString() = s"$fname"
}
class 	LastName(val lname : String) extends AnyVal {      
override def toString() = s"$lname"
}
class Age(val age: Int) extends AnyVal {    
override def toString() = s"$age"
}
class Display
{
def displayDetails(first:FirstName,last:LastName,age:Age)= s"$first $last is of $age"      //Using String Interpolation

}
object Second
{
def main(args:Array[String])
{

val x =new FirstName("parashant")  
val y =new LastName("goel")
val z =new Age(25)

val t =new Display
println(t.displayDetails(x,y,z))  //calling displayDetails method and passing all three values




}
}
