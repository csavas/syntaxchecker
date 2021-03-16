//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.util.Stack;
import java.util.Map;
import java.util.TreeMap;
import static java.lang.System.*;

public class SyntaxChecker
{
 private String exp;
 private Stack<Character> symbols;

 public SyntaxChecker()
 {
   setExpression("");
   symbols = new Stack<Character>();
 }

 public SyntaxChecker(String s)
 {
   this();
   setExpression(s);
   checkExpression();
 }
 
 public void setExpression(String s)
 {
   exp = s;
 }

 public boolean checkExpression()
 {
   String op ="[{<(";
   String clo ="})>]";
   for(char ch : exp.toCharArray()){
     for(char i : op.toCharArray()){
       for(char a : clo.toCharArray()){
         if(ch==i){
         symbols.push(i);
         }
         else if(ch==a){
           if(symbols.size()>0){
             if((int)symbols.pop() != (int)ch -1){
               
             }
           }
           else{
             return false;
           }
         }
       }
     }
   }
   if(symbols.size()>0){
   return false;}
  return true;
 }

 public String toString(){
   if(checkExpression()){
     return ""+exp + " is correct.";
   }
   return ""+exp+" is incorrect.";
 }
}