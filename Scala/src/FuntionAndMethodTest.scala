

object FuntionAndMethodTest extends App {
  val addfunc = (x: Int, y: Int) => x + y
  println(addfunc(2,3))
  
  val getvaluefunc = () => 23
  println(getvaluefunc())
  
  def addmethod(x:Int, y:Int):Int = x+y;
  println(addmethod(2,3))
  
  def addAndMulMethod(x:Int, y:Int)(z:Int):Int = {(x+y) * (z)}
  println("addAndMulMethod " +  addAndMulMethod(2,3)(5))
  
  
  def nameMethod: String = System.getProperty("name")
  println("nameMethod " + nameMethod);
}