
import user.User;
import user.HairColor;

@main def main = {
    println("In the main funciton");
    val n = new User(27, "Vic", "P", HairColor.Brown, List("Ringo"));
    println(n.getFullName());
    
}