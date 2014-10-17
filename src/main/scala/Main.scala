object Main extends App {
  import Mappable._
  case class Person(name: String, age: Int)

  def mapify[T: Mappable](t: T) = implicitly[Mappable[T]].toMap(t)
  def materialize[T: Mappable](map: Map[String, Any]) = implicitly[Mappable[T]].fromMap(map)

  val person = Person("john", 24)
  assert {
    mapify(person) == Map("name" -> "john", "age" -> 24)
  }

  val map = Map("name" -> "bob", "age" -> 22)
  assert {
    materialize[Person](map) == Person("bob", 22)
  }
}
