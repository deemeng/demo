
@main def hello: Unit =
  val person1 = Person("Lucy")
  println(person1.toString)
  for i <- 1 to 20 do
    person1.incrementAge
  val person2 = Person("Sean")
  val couple = Couple(person1, person2)
  println(couple.toString)
