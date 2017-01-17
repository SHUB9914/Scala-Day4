class Higher
{
def sum(shap:String , a:Int,b:Int,f:(Int,Int)=>Int):Int=f(a,b) 
}
object Fourth
{
def main(args:Array[String])
{
val obj=new Higher
println("enter your choice squares, cubes,Intsc")

var str =readLine() //user input

var q=0
str match // Pattern Matching Concept
{
case "squares"=>(q=obj.sum("squares",5,4,(x,y)=>(x*x)+(y*y))) //Calling sum

case "cubes"=>(q=obj.sum("cubes",5,4,(x,y)=>(x*x*x)+(y*y*y))) 

case "Ints"=>(q=obj.sum("Ints",5,4,(x,y)=>x+y)) 

}
println(s"$str = $q") // Here final Result will print
}
}
