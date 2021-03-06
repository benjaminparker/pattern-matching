object PM {

  def main(args: Array[String]) = {
    println(matchByValue(1))

    //    val john = Adult("John", "NZ652287X")
    //    val johnny = Child("Johnny")

    //    println(matchByType(john))
    //    println(matchByType(johnny))
  }

  // 1. matching on value
  def matchByValue(i: Int): String = i match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "something else"
  }

  // 2. add if guards for something negative and something positive

  // 3. matching on type
  abstract class Person(name: String)

  case class Child(name: String) extends Person(name)

  case class Adult(name: String, ni: String) extends Person(name)

  def matchByType(person: Person): String = person match {
    case a: Adult => "Adult with niNumber: " + a.ni
    case c: Child => "Child with name: " + c.name
    case _ => "Errrrmmm..."
  }

  // 4. Adult / Child using unapply with placeholders

  // 5. Use sealed abstract class to avoid impossible default case
}