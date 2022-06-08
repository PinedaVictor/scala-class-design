package user;

enum HairColor:
  case Red, Blue, Brown, Black, Blonde

class User(
    age: Int,
    firstName: String,
    lastName: String,
    hairColor: HairColor,
    pets: List[String]
) {
  def getAge() = age;
  def getFullName() = s"${firstName} ${lastName}";
  def getFirstName() = firstName;
  def getLastName() = lastName;
  def getHairColor() = hairColor;
  def getPets() = pets;
}
