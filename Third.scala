package com.knoldus.Demo
trait QueueDemo     
{
def enqueue(lst:List[Int],x:Int):List[Int]
def dequeue(lst:List[Int]):List[Int]


}

class DoubleQueue extends  QueueDemo
{

def enqueue(lst:List[Int],x:Int):List[Int]=
{
val doub = x*2
var ls =lst
ls=ls:+doub
ls

}
def dequeue(lst:List[Int]):List[Int]=
{
var ls = lst.tail
ls

}

}
class SquareQueue extends  QueueDemo
{
def enqueue(lst:List[Int],y:Int):List[Int]=
{
val doub = y*y
var ls=lst
ls=ls:+doub
ls


}
def dequeue(lst:List[Int]):List[Int]=
{
var ls = lst.tail
ls

}
}
object Third
{
def main(args:Array[String])
{
var lst =List[Int]() //Creating of blank list
var obj1 = new DoubleQueue
var obj2 =new SquareQueue

lst = obj1.enqueue(lst,5) //Entering element
lst = obj2.enqueue(lst,5) //Entering element
println(lst)
lst =obj1.dequeue(lst)
println(lst)

}

}
