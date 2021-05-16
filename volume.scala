import scala.math
object volume extends App{
  def findvol(r:Double):Double=4/3*math.Pi*math.pow(r,3);
  printf("%.2f",findvol(5));
  print("\n");
}
