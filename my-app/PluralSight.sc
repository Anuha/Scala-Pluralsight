/*

* EXPRESSIONS BLOCKS CAN HAVE NESTED SCOPES
*
*Both constants define PI
* The function's return value will take
* the outside PI value i.e scope 1
 */

val area = {
  val PI = 3.1
  val radius = 10.0
  println(s"Inside scope 1 , PI = $PI");
  {
    val PI = 3
    println(s"Inside scope 2, PI = $PI")
     PI * radius * radius
  }
  PI * radius * radius
}

  /* to print the value of the nested scope
     * comment out the outer return value
     * if you wanted to both outer scope and inner scope
     * just add:
     *  val j = PI * radius * radius
     *  print(j)
     *
     *  currently, the PI * r * r is a statement
     *  because there is no return value to the statemnt
     *
    */

/*
* Functional Programming
* IF/eLSE
* FOR LOOPS
* PATTERN MATCHING
*/

/*
*
* In this example, the for loop becomes an expression
* using 'YIELD'
* A for-loop with yield will "yield" a collection of
* the return values of each iteration of the loop
*
* The result should be
* weekDays: List[String] = List(Just another Monday, TUE, WED, THUR, FRI)
 */
val weekDays = List("MON", "TUE","WED","THUR","FRI")
val manicWeekDays = for (day <- weekDays) yield {
  day match {
    case "MON" => "Just another Monday"
    case otherDay =>  otherDay
  }
}

val daysofWeekList = List("MON", "TUE","WED","THUR","FRI")
for {i <- 0 until 3
      h <- daysofWeekList}
  {
    println(s"$i,$h")
  }



