## Exercise: LetterSize (4 Points)

The project name of this exercise is **LetterSize**.

The purpose of this assignment is for you to write more of your own comments, use fundamental data types, and to use constants in your program.

### Problem Description

 Write a program that displays the dimensions of a letter-size (8.5 × 11 inches) sheet of paper in millimeters. Be sure to print it out so that there are two numbers after the decimal point for the conversions. There are 25.4 millimeters per inch. Use constants and comments in your program. 

_Hint_: When using `String.format` the format specifier for two digits is listed on page 50 (149 for Early Objects) of the book. The function there is called `printf`, but the format specifiers are the same. `String.format` returns a formatted string and `printf` sends a formatted string to the console.

### Getting Started

Like our last exercise, we are going to start by creating **LetterSize.java**. Using the techniques shown on the web page titled [How to Start Every Project in this Class](http://crowd.cs.sbcc.edu:7990/projects/CS105F2016/repos/allan.knight/browse/HowToStartEveryProject.md) create a source file called **LetterSize.java**.

**LetterSize.java** is where your source code will go. Replace the code in that file with the code in the grey box below:

```java
/**
 * CS 105 Theory & Practice I
 * CRN: [CHANGE THIS TO YOUR INFORMATION]
 * Assignment: LetterSize
 * 
 * Statement of code ownership: I hereby state that I have written all of this
 * code and I have not copied this code from any other person or source.
 * 
 * @author [CHANGE THIS TO YOUR INFORMATION]
 */
package edu.sbcc.cs105;

/**
 * This class tests the LetterSize object.
 *
 */
public class LetterSize {

    /**
     * Write source code to calculate the size of an 8.5 x 11 inch letter in millimeters.
     */
    public static String computeLetterSize() {
        // Put your code here.
    }
    
    public static void main(String[] args) {
		System.out.println(computeLetterSize());
    }
}
```

Now go through LetterSize.java and change the [CHANGE THIS TO YOUR INFORMATION] text to the proper items. There are two items to be changed. The CRN # is either 38063, for the Thu. night lab section, or 38064, for the Thu. morning lab section.

Next, write your code that creates a string with the computed letter size  in `public static String computeLetterSize` between the curly braces.

Once you've written your code run the code by single clicking on LetterSize.java in the package explorer and selecting **Run->Run** from the menu or using the keyboard shortcut. Examine the output. Does it do what you want? If not, how can you modify the code to do what you want?

### How to turn in this exercise

The first step of turning in your code is to commit and push your code to BitBucket. Once you've completed this step your code will be on BitBucket in your repository, not the repository for the class. This will allow you to use all your projects later as a portfolio.

To start the process write click your project and select **Team -> Commit...**. You should see the following dialog:

![Commit dialogue](https://www.dropbox.com/s/lojod76ghyzl626/commit-git.png?dl=1)

Now follow these steps to commit and push your code:

1. Select the files by check marking the files you want to commit. In this case **LetterSize.java**. 
2. Enter a commit message. The commit message can be anything, but should describe the changes that are begin committed. A good commit message in this case might be "Committing code to check in for assignment"
3. Press **Commit and Push**

You will see a few more dialogs (including ones that may ask for your BitBucket username and password) go by and then you will see something similar to the following:

![Push dialogue](https://www.dropbox.com/s/niao32p4abbx4k2/push-git.png?dl=1)

1. Push **OK** to complete the commit. You may get no confirmation, but you can check BitBucket to see if the code now exists there.

#### Completing the turn-in process

Now to complete the turn-in process, once you confirmed that your code is on BitBucket, you need to create a **pull request** in the class BitBucket repository. This action will indicate to the original project that you have finished your coding and it will create a place to give feedback on a line by line basis. 

Go to **your** repository for this assignment on BitBucket and click on the **Create pull request** icon. You should see something similar to this picture:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/create-pull-request.png" width="207" height="207" />

1\. Select **master**

The next screen then shows the source and destination of the pull request. Your code is the source and is listed at the top. The destination is the original project that you forked from. The only thing to do on this screen is to select the **master** branch for your project. When you first come to this screen you should see the following:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-screen-first.png" width="600" height="250" />

2\. Select **Select Branch** you should see something like this:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-master.png" width="600" height="250" />

3\. Select **master** 

4\. Press the **Continue** button.

This screen should look like this at the top:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-description.png" width="514" height="325" />

5\. Click on **Create**

After selecting **Create**, you code should build and be tested within a minute or so. If the test is successfull you will see something similar to the following screen:

<img src="https://dl.dropboxusercontent.com/u/7698973/cs105/EX01-HelloWorld/pull-request-submitted.png" width="740" height="350" />

Notice the part on the right hand of the screen that says **3 builds**. If the icon is green your good, if it failed, it will be red. **Note** This one says 3 builds, it might say another number. The important thing is whether it is green or red.

This final action "_turns_" in the assignment on BitBucket. It also causes your code to be unit tested on a separate server. The result should be exactly the same as when you ran it on your computer.

After grading the exercise, the pull request will be closed without merging back into the original project. This is the normal workflow and does not represent any problem with your code.

Finally, you should receive an email that has links to both the pull request and the results of running your code.
