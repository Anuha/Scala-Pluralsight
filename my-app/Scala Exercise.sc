def sumInts(a: Int, b: Int): Int =
  if (a > b) 0 else a + sumInts(a + 1, b)
sumInts(1,3)




// should be 55
def sum(f: Int => Int, a: Int, b: Int): Int = {
  def loop(x: Int, acc: Int): Int = {
    if (x > b) acc
    else loop(x + , acc + f(x))
  }
  loop(a, )
}
sum(x => x, 1, 10) //shouldBe 55