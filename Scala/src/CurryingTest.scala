

object CurryingTest extends App{
     def add1(a:Int) = { b:Int => a + b }
      println ("1.1: " + add1(5)(6))
      val f = add1(5) 
     // println(f);
       println("1.2: " + f(6) )
       println()
       def add2(a:Int)(b:Int) = {a + b}
  // 2.1
      println ("2.1: " + add2(5)(6))
       
      val f1 =  add2(5)_
        println("2.2: " + f(6) )
}