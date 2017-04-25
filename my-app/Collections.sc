//set, seq, map, vector, tuple

// Set is a collection that contains no duplicate statements.
// two kinds - mutable and immutable objects

Set(1,2,"3")

// Vector is an immutable collection. Elements can be added
// and updated to the collection

Vector (1,2,3)
//Empty vector
val vector = scala.collection.immutable.Vector.empty
println(vector)

//add new value at end of vector
val vector2 = vector :+ 5
println(vector2)

//add 2 new values at the end of vector
val vector3 = vector2 :+ 10 :+ 20
println(vector3)

//add new value at start of vector
val vector4 = 100 +: vector3
println(vector4)

// add elements from list of ints to end of vector
// if you change the vector[2],[3],[4] the list should updated accordingly
val v2 = vector4 ++ List(11,12,13)
println(v2)

//////// update ///////
val v = scala.collection.immutable.Vector.empty
println(v)

// add 3 strings to an empty vector
val v3 = v :+ "cat" :+ "bird" :+ "frog"
println(v3)

//update element at index 1
val changed = v3.updated(1,"fish")
println(changed)

// concatenates two collections '++'
val a = Seq(1,2,3)
val b = Seq(4,5,6)
val c = a ++ b

val seqNum = Seq(1,2,3,4)
seqNum :+ 44
44 +:  seqNum
println(seqNum)


//Tuple

val myTup = Tuple2(1, "test")
val myOtherTup = (1,2,"test")

val myMovie = ("IT", "Horror")
myMovie._2

val myMap =Map(1 -> "test", 2 -> "two")
print(myMap.getOrElse(3, "Fail"))