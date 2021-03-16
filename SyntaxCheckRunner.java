//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.util.Stack;
import static java.lang.System.*;

public class SyntaxCheckRunner
{
 public static void main ( String[] args )
 {
  //add test cases 
   SyntaxChecker s = new SyntaxChecker("(abc(*def)");
   out.println(s);
   s = new SyntaxChecker("[{}]");
   out.println(s);
   s = new SyntaxChecker("[");
   out.println(s);
   s = new SyntaxChecker("[{<()>}]");
   out.println(s);
   s = new SyntaxChecker("{<html[value=4]*(12)>{$x}}");
   out.println(s);
   s = new SyntaxChecker("[one]<two>{three}(four)");
   out.println(s);
   s = new SyntaxChecker("car(cdr(a)(b)))");
   out.println(s);
    s = new SyntaxChecker("car(cdr(a)(b))");
   out.println(s);
   }
}