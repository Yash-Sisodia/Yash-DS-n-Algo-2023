/* Check odd even Program */

// import java.util.*;
// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         if(n%2==0) {
//             System.out.println("Even");
//         } else {
//             System.out.println("Odd");
//         }
//         System.out.println("Hardwork is better than smart work");
//     }
// }


/* Print the greeting 
 * Button 1 -> Hello
 * Button 2 -> Namaste
 * Button 3 -> Bonjour
*/
// import java.util.*;
// public class conditionals {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
        
//         if(button==1) {
//             System.out.println("Hello");
//         } else if(button==2) {
//             System.out.println("Namaste");
//         } else if(button==3) {
//             System.out.println("Bonjour");
//         } else {
//             System.out.println("Invalid input");
//         }
//     }
// }

/* Print the greeting program using switch case 
* Button 1 -> Hello
 * Button 2 -> Namaste
 * Button 3 -> Bonjour
 */

 import java.util.*;
 public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        switch(button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid input");
        }
    }
 }