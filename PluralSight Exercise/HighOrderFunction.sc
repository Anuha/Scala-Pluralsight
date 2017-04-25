
/*
*
* High order methods collections take in function objects
* and apply those methods to the contents of those collections.
*
* Map, Foreach and Filter work on one element at a time
* Scan, Fold and Reduce work on multiple elements.
*/


 /*
* Using the high order method 'foreach'
* Invoke teh foreach method and pass in the print procedure
* The print procedure should print each element of the list.
* '_' underscore placeholder = tells scala that in each element in the list,
*  substitute the corresponding element.
*/// create a simple list
val weekDays = List("Mon","Tue","Wed","Thu","Fri")
weekDays.foreach(println(_))



/*
* Invoke map passing a function - a condition to check value is Monday.
* If the condition is fulfilled that element in result should be set to True
* where it is Monday.
*
*/


val printValue = (x:Any) => {println(x)}:Unit
weekDays.map(_ == "Mon")

// different way of doing the above function.
val IsManicMonday = (x:String) => {x == "Mon"}:Boolean
weekDays.map(IsManicMonday)

// filter is a condition - where the element is true
// that return value will be the element which is true - here it is Mon
weekDays.filter(IsManicMonday)
weekDays.map(_ != "Mon")

// Partition is based on returning 2 lists
// first list will contain all the elements from origianl collection that satisfy the condition
// I.e Mon is the only value that is true so that first list will contain Mon
// Second list will contain all the values that are false - didin't satisfy the condtion
// i.e Tue, Wed, Thur, Fri

weekDays.partition(IsManicMonday)

/*
*
* Sort by
*
*
*
 */


weekDays.sortBy(_(0))




/*
*
* 
*
*
*
 */

val someNumbers = List(10,20,30,40,50,60)

someNumbers.scanRight(0)(_ - _)
someNumbers.scanLeft(0)(_ - _)
someNumbers.scan(0)(_ - _)

someNumbers.foldRight(0)(_ - _)
someNumbers.foldLeft(0)(_ - _)
someNumbers.fold(0)(_ - _)

someNumbers.reduceRight(_ - _)
someNumbers.reduceLeft(_ - _)
someNumbers.reduce(_ - _)

