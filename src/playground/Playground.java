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

/**
 * This is a playground to demo encapsulation and modularization.
 * In this playground, you'll ask user to enter 3 words. You want
 * to validate each word to ensure it's an English word and then
 * print out the result as a full sentence in the console.
 * 
 * For simplicity, it's assumed an English word is a word containing
 * only English alphabets.
 */
public class Playground {

  public static void main(String[] args) {
    
    // Create an instance of Scanner Helper. Scanner Helper is a stand-alone
    // module that will ask user to enter some text, validate it and return
    // the result as an English word.
    // Validation of user input is done inside Scanner Helper.
    ScannerHelper helper = new ScannerHelper();
    
    // Ask user to enter a word. The purpose of this word is for the __subject__
    // of a sentence you're going to make.
    String subject = helper.readAndValidateUserInputWithPurpose("subject");
    
    // Ask user to enter a word. The purpose of this word is for the __verb__
    // of a sentence you're going to make.
    String verb = helper.readAndValidateUserInputWithPurpose("verb");
    
    // Ask user to enter a word. The purpose of this word is for the __object__
    // of a sentence you're going to make.
    String object = helper.readAndValidateUserInputWithPurpose("object");
    
    // Create a sentence by instantiating Sentence data model.
    Sentence mySentence = new Sentence();
    
    // Update attributes of sentence with values that user entered.
    mySentence.subject = subject;
    mySentence.verb = verb;
    mySentence.object = object;
    
    // Tell sentence object to print it out in the console.
    mySentence.print();
  }
}
