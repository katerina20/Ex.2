public class Ex1
{
  public static void main (String [] args) {

  int a=Integer.parseInt(args[0]);
  float t=(float)a/100;
  if ((t<0.1)||(t>1))
   System.out.println ("Chislo ne vhodit v diapozon");
  else
  {
   int lft=a/10;
   int rght=a%10;
  System.out.println ("Levoe chislo = "+lft +"; Pravoe chislo = "+rght);
  }
 }
}