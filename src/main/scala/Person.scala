class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {

    val res = this.name == that.name

    if (res == true)
      this.age - that.age

    else
      this.name.length - that.name.length
  }
}

object Person extends App {

  {
    val personOne = new Person("Test123", 25)
    val personTwo = new Person("Test123", 25)
    println(personOne.compare(personTwo))
  }
}






