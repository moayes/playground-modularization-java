/**
 * Copyright (c) 2016 Soheil Moayedi Azarpour
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package playground;
import java.util.Scanner;

/**
 * This is a helper class for Scanner to refactor common code.
 * THe purpose of is this class to provide a helper function that will validate
 * user input before returning.
 */
public class ScannerHelper {
  
  /**
   * This is a private instance variable to read user's input from standard
   * console. Since you need only 1 scanner object, you instantiate an instance
   * here and you'll reuse throughout this module for as long as you need it.
   * The keyword final means input variable can only be initialized once.
   */
  private final Scanner input = new Scanner(System.in);
  
  /**
   * This is a public instance method for Scanner Helper. It reads user input
   * and validate it to be a String of English alphabets only. If the input
   * is invalid, it will prompt user to enter again.
   * The method will not return unless user enters a valid English word.
   * 
   * @param purpose is an input parameter and is displayed to user. Purpose tells
   * user about the purpose of query. For example, it tells user you're asking
   * for a subject.
   * 
   * @return A string that's validated to be only English alphabets
   */
  public String readAndValidateUserInputWithPurpose(String purpose) {
    
    // Prompt user to enter something. Also display the purpose so that user knows
    // what they're being asked for.
    System.out.println("Enter " + purpose + ":");
    
    // Use the private instance variable, input, to get user's input.
    String valueEntered = input.next();
    
    // Validate it.
    if (valueEntered.matches("[a-zA-Z]*") == false) {
      
      // Prompt user that the value was not acceptable.
      System.out.println("The value you entered was not an acceptable " + purpose + ". Try again...");
      
      // If it's not valid, make a recursive call to the same method,
      // readAndValidateUserInputWithPurpose() and ask user to try again.
      return readAndValidateUserInputWithPurpose(purpose);
    }
    
    // Here, you know that the input was valid.
    // So return it to the caller.
    return valueEntered;
  }
}
