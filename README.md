## Exercise: LetterSize (25 Points)

The project name of this exercise is **LetterSize**.

### Problem Description

The purpose of this assignment is to practice what we learned about constants, variables and formatted output. 

Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. Be sure to print it out so that there are two numbers after the decimal point for the conversions. There are 25.4 millimeters per inch. Use constants and comments in your program. 

_Hint_: When using `System.out.printf` the format specifier for two digits is listed on page 40 in [Think Java](http://greenteapress.com/thinkjava6/thinkjava.pdf) . 

### Getting Started

The first thing you will need to do is accept the invitation to this assignment
from GitHub Classroom. You can click [here](https://classroom.github.com/a/UO9xHmbD) to accept the invitation, and then
follow the instructions [here](https://github.com/vc-csv40-spring2019/Course-Information/wiki)
to get started. 

Be sure that you accept the invitation first and use the URL from
the your new project when you clone it in Intellij.

Like our last exercise, we are going to start by creating a Java class. The file for this project is called **LetterSize.java**. Right click on `src` select `New -> Java Class` to create a class called **edu.vcccd.vc.csv40.LetterSize**.

That lass action will create a file named **LetterSize.java**. This file is where your source code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS V40 Beginning Java
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.vcccd.vc.csv40;

/**
 * This class tests the LetterSize object.
 *
 */
public class LetterSize {

    public static void main(String[] args) {
        // Put your code for this project here.
    }
}
```

Now go through **LetterSize.java** and change the [CHANGE THIS TO YOUR INFORMATION] text to your name and email address.

Next, write your code that prints a string to the console with the computed letter size in `public static void main` between the curly braces. The output
should first output the width in millimeters, and then the height in millimeters. The output should look something like:

```bash
000.00 mm X 000.00 mm
```

The zeroes should be replaced with the actual 8.5" X 11" converted to millimeters. This conversion should occur in your code.

Once you've written your code run the code by LetterSize in the target drop-down box and the pressing the play button. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

Next, make sure it also passes the Unit tests. To run the Unit tests select the LetterSizeTest target and press the play button. 


### How to turn in this exercise

Before submitting your code the first time, you will need to add a webhook to this project to trigger the build in the cloud. This process is simple, and only required once per assignment. First, go to the **Settings** tab at the top of this page. It's right next to **Insights**. Then along the left side select **Webhooks**. On the Webhooks page click **Add Webhook** and copy http://209.129.49.16:8080/github-webhook/ into the **Payload URL** input box and then click **Add Webhook**. That's it. Every time you push code now, a new build will test your latest changes. The results are pasted to the #build channel in slack.

First, right click on the project name, then select `Git -> Commit Directory...`. 
Make sure only the files you want to push are selected, `main.cc`. Then uncheck `Perform code analysis` and `Check TODO`. It's OK to leave them checked, but committing will take longer. Leave `Run git hooks` unchecked as well. Put a message in `Commit Message` and then press the **Commit** button. If anything goes wrong check the _Version Control_ view
in the lower left corner and select the _Console_ tab.
 
Finally, right click on the project name, then select `Git -> Repository -> Push...`. Follow the onscreen directions
and press **OK**. This step will then submit them to the cloud to have the tests run for grading. You can find your results
in the [#build](https://vc-csv40-spring2019.slack.com/messages/CFK9MU6GK) channel on slack.

If you do not understand these directions, or wish to do them on the command
line rather than in CLion, then read these [directions](https://github.com/vc-csv40-spring2019/Course-Information/wiki/How-to-Turn-In-Every-Project).
