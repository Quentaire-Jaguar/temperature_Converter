import java.util.*;
import java.util.NoSuchElementException;

public class temperatureConversion
{
  static Scanner in;
  public static void main(String[]args)
  {
    in = new Scanner(System.in);

    char pick;
    Character choice = new Character('A');
    char pick_two;
    Character choice_two;

    double fahrenheitEntry;
    double celsiusEntry;
    boolean loop = true;

    try
    {
      do
      {
        System.out.print
        ("\n Enter 'F' to receive degrees\n"+
        " Fahrenheit, enter 'C' to receive\n"+
        " degrees Celsius or enter 'q' to\n"+
        " quit: ");
          pick = in.next().charAt(0);
          choice = new Character(pick);

          fahrenheitEntry = 0.0;
          celsiusEntry = 0.0;

          if(choice.equals('F') || choice.equals('f'))
          {
            System.out.print
            ("\n Enter the degrees Celsius: ");
              celsiusEntry = in.nextDouble();

            System.out.printf
            ("\n %.1f degrees Celsius\n"+
            " converts to %.1f degrees\n"+
            " Fahrenheit.\n", celsiusEntry,
            celsiusConv(celsiusEntry));
          }

          if(choice.equals('C') || choice.equals('c'))
          {
            System.out.print
            ("\n Enter the degrees Fahrenheit: ");
              fahrenheitEntry = in.nextDouble();
            System.out.printf
            ("\n %.1f degrees Fahrenheit\n"+
            " converts to %.1f degrees\n"+
            " Celsius.\n", fahrenheitEntry,
            fahrenheitConv(fahrenheitEntry));
          }

          if(choice.equals('Q') || choice.equals('q'))
          {
            loop = false;
          }

          /*
          else
          {
            System.out.println
            ("\n That is an invalid entry");
          }
          */
      } while (loop);
    }// end of try statement for
      //temperatureConversion function

      catch(InputMismatchException e)
      {
        System.err.println
        ("\n Invalid entry.\n"+
        " Please try again.");

        in.nextLine();
      }

  }//end of method main

  public static double celsiusConv(double entry)
  {
    return (9 * entry)/5 + 32;
  }

  public static double fahrenheitConv(double entry)
  {
    return (entry - 32) * 5/9;
  }
}
