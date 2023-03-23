package day11_SwitchStatements;
/*
First ask the user about the screen size**
> Select screen size:
> - For a screen size of `13.3`, add `$200` to the total price
> - For a screen size of `15.0`, add `300` to the total price
> - For screen size of `17.3`, add `$400` to the total price

**Then ask the user about the CPU**
> Select CPU type:
> - For a CPU of `i3`, add `$150` to the total price
> - For a CPU of `i5`, add `$250` to the total price
> - For a CPU of `i7`, add `$350` to the total price

**Then ask the user about the RAM size**
> Select RAM size:
> - Add `$50` to the total price for every 4GB of ram. Assume the ram amounts will be divisible by 4

**Then ask the user about the storage type and amount**
> Select storage type:

> Select storage size:

> - For `HDD`, add `$50` to the total price for every 500GB
> - For `SSD`, add `$100` to the total price for every 500GB

**Then ask the user about the screen resolution**
> Select screen resolution:
> - For `FULLHD`, add `$100` to the total price
> - For `4K`, add `$200` to the total price

** At the end display the total price of the custom computer**
> Laptop price is: $amount

Main topics: conditional statements, primitive variables, operators, Scanner

**Example Flows:**

```
  Select screen size:
    13.3
  Select CPU type:
    i7
  Select RAM size:
    8
  Select storage type:
    SSD
  Select storage size:
    1000
  Select screen resolution:
    4K
  Final price is: $1050.0
```

```
  Select screen size:
    13.3
  Select CPU type:
    i3
  Select RAM size:
    4
  Select storage type:
    HDD
  Select storage size:
    500
  Select screen resolution:
    FULLHD
  Final price is: $550.0

 */
public class NameOfMonth {
    public static void main(String[] args) {

        int month = 12;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month number");

        }


    }
}
