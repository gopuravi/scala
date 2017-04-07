

class ClassTest(name:String ,age:Int){
  
  def printdet(prefix:String): Unit={
    println(prefix+ " " + name+ " " + age);
  }
 
  
}
//case to create immutable class
case class Point(x: Int, y: Int){
val point = Point(1, 2)
val anotherPoint = Point(1, 2)
}

//trait similar to abstract class
trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

object Main{
  def main(args:Array[String]){
    println("Inside main method");
    
     val ct = new ClassTest("Gopu",29)
     ct.printdet("Hello");
  }
}