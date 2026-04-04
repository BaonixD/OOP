package PRACTICE5;

import java.util.*;


import java.util.*;

public class Example4 {
   public static void main(String[] args) {
      double leftOperand, result, rightOperand;
      String leftString, operator, rightString;
      StringTokenizer tokenizer;
      Scanner in = new Scanner(System.in);

      while (in.hasNextLine()) {
         String line = in.nextLine().trim();
         if (line.isEmpty()) break;

         String[] expressions = line.split("\\s+");

         for (String expr : expressions) {
            tokenizer = new StringTokenizer(expr, "+-*/", true);

            try {
               leftString = tokenizer.nextToken();
               operator = tokenizer.nextToken();
               rightString = tokenizer.nextToken();

               try {
                  leftOperand = Double.parseDouble(leftString);
               } catch (NumberFormatException nfe) {
                  System.out.println("Left operand is not a number: " + leftString);
                  continue;
               }

               try {
                  rightOperand = Double.parseDouble(rightString);
               } catch (NumberFormatException nfe) {
                  System.out.println("Right operand is not a number: " + rightString);
                  continue;
               }

               result = 0.0;
               switch (operator) {
                  case "+": result = leftOperand + rightOperand; break;
                  case "-": result = leftOperand - rightOperand; break;
                  case "*": result = leftOperand * rightOperand; break;
                  case "/":
                     if (rightOperand == 0) {
                        System.out.println("Cannot divide by zero");
                        continue;
                     }
                     result = leftOperand / rightOperand;
                     break;
               }

               System.out.println("Result: " + result);

            } catch (NoSuchElementException nsee) {
               System.out.println("Invalid syntax: " + expr);
            }
         }
      }

      in.close();
   }
}