
class Person(val name: String):
  var age = 0
  
  def incrementAge: Unit = 
    age += 1
    age match
      case 13 => println("I'm a teenager")
      case 18 => println("I'm an adult!")
      case _ => 
  
  override def toString: String = 
    s"$name is $age years old"