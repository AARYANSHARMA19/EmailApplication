//compile this code wherever u want. 


import java.io.*;
import java.lang.*;
import java.util.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
    InputStreamReader I=new InputStreamReader(System.in);
   
    BufferedReader B=new BufferedReader(I);
    System.out.print("Enter function (SignUp, Login, Compose): ");
    String ch=B.readLine();
    ch = ch.toLowerCase();
    if(ch.equals("signup"))
    {
    }
    else
    System.out.println("Wrong choice!");
    }
    }
