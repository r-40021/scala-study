object Distance extends App {
  val kilometersPerHours = 11
  val minutes = 100
  var distance = kilometersPerHours * minutes / 60.0
  println(s"走った距離は${distance}kmです")
}