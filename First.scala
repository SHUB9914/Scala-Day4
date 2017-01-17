class Person(val name: String, val age: Int) extends Ordered[Person]{ //here ordered trait program
def compare(that : Person) = {
	if(this.name == that.name)
		this.age - that.age 
	else
		this.name.length - that.name.length 
}
}
object Persons extends App{
	val firstPerson = new Person("shubham",20)
	val secondPerson = new Person("shubham",21)
	println( firstPerson < econdPersono)
	}
