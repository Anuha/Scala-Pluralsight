

//map is function that takes an element and do something with each element
// DO NOT GET CONFUSED WITH MAPS THE COLLECTION TYPE -- LIKE LIST
// THIS IS A MAP function not a collection type

val myVec = Vector(1,2,3,4)
val a = (a: Int) => a + 1
myVec.map(a)

val addoneFunc = (eachNum: Int) => eachNum

myVec.map(eachNum => eachNum + 1)
myVec.map((eachNum: Int) => eachNum + 1)
myVec.map(_ + 1)
myVec.map(addoneFunc)


// split the values
// s.split("") tells the split the values are found within the ""
val initSeq = Seq("Now is ", "The time")
  .flatMap(s => s.split(""))


val secondSeq = Seq("Now is ", "The time")
  .flatMap(s => s.split(""))

// print the letter at position specified in the brackets
// in this example show the 13th and 11th value in the result list
//mres5: Unit = () <<<<<< 'm'res
//tres6: Unit = () <<<<<< 't'res

print(initSeq(13))
print(secondSeq(11))

/*val inSeq = Seq("Now is ", "The time")
  .map(s => s.split("")) */

// applies a boolean to the data structure and returns the boolean value
// in this example filter all elements less than 4 in the collection so 1,2,3
val myintList = Seq(1,2,3,4,5)
myintList.filter(p => p < 4)


