import java.util.Scanner;
/*
 Program: Java Letters
 Author: Ted Green
 */
public class JavaLetters {

	public static void main(String[] args) {
	
		
	
        // Takes in a user inputed String
        String str;
        Scanner sc = new Scanner(System.in);
        		
        System.out.println("Enter a string"); 
 		str = sc.nextLine();  
		//System.out.println("You entered String "+s);
 		
 		//loop that will run through the entire string
 		for (int i = 0; i < str.length(); i++) {
 			//gets the current character in the string
 			char c = str.charAt(i);
 			
 			if (c == 'a' || c =='A') {
 				System.out.println("    a    ");
 		        System.out.println("   a a   ");
 		        System.out.println("  aaaaa  ");
 		        System.out.println(" a     a ");
 		        System.out.println("a       a");
 		        System.out.println();
 			} else if (c == 'b' || c == 'B') {
 				System.out.println("bbbbb ");
 		        System.out.println("b    b");
 		        System.out.println("bbbbb ");
 		        System.out.println("b    b");
 		        System.out.println("bbbbb ");
 		        System.out.println();
 			} else if (c == 'c' || c == 'C') {
 				System.out.println("cccccc ");
 		        System.out.println("c      ");
 		        System.out.println("c      ");
 		        System.out.println("c      ");
 		        System.out.println("cccccc ");
 		        System.out.println();
 			} else if (c == 'd' || c == 'D') {
 				System.out.println("ddddd  ");
 		        System.out.println("d    d ");
 		        System.out.println("d     d");
 		        System.out.println("d    d ");
 		        System.out.println("ddddd  ");
 		        System.out.println();
 			} else if (c == 'e' || c == 'E') {
 				System.out.println("eeeeee ");
 		        System.out.println("e      ");
 		        System.out.println("eee    ");
 		        System.out.println("e      ");
 		        System.out.println("eeeeee ");
 		        System.out.println();
 			} else if (c == 'f' || c == 'F') {
 				System.out.println("ffffff ");
 		        System.out.println("f      ");
 		        System.out.println("ffff   ");
 		        System.out.println("f      ");
 		        System.out.println("f      ");
 		        System.out.println();
 			} else if (c == 'g' || c == 'G') {
 				System.out.println("gggggg ");
 		        System.out.println("g      ");
 		        System.out.println("g  ggg ");
 		        System.out.println("g    g ");
 		        System.out.println("gggggg ");
 		        System.out.println();
 			} else if (c == 'h' || c == 'H') {
 				System.out.println("h    h");
 		        System.out.println("h    h");
 		        System.out.println("hhhhhh");
 		        System.out.println("h    h");
 		        System.out.println("h    h");
 		        System.out.println();
 			} else if (c == 'i' || c == 'I') {
 				System.out.println(" iii ");
 		        System.out.println("  i  ");
 		        System.out.println("  i  ");
 		        System.out.println("  i  ");
 		        System.out.println(" iii ");
 		        System.out.println();
 			} else if (c == 'j' || c == 'J') {
 				System.out.println("jjjjjjj");
 		        System.out.println("   j   ");
 		        System.out.println("   j   ");
 		        System.out.println("j  j   ");
 		        System.out.println("jjjj   ");
 		        System.out.println();
 			} else if (c == 'k' || c == 'K') {
 				System.out.println("k  k ");
 		        System.out.println("k k  ");
 		        System.out.println("kk   ");
 		        System.out.println("k k  ");
 		        System.out.println("k  k ");
 		        System.out.println();
 			} else if (c == 'l' || c == 'L') {
 				System.out.println("l");
 		        System.out.println("l");
 		        System.out.println("l");
 		        System.out.println("l");
 		        System.out.println("llllll");
 		        System.out.println();
 			} else if (c == 'm' || c == 'M') {
 				System.out.println("mm   mm");
 		        System.out.println("m m m m");
 		        System.out.println("m  m  m");
 		        System.out.println("m  m  m");
 		        System.out.println("m  m  m");
 		        System.out.println();
 			} else if (c == 'n' || c == 'N') {
 				System.out.println("nn    n");
 		        System.out.println("n n   n");
 		        System.out.println("n  n  n");
 		        System.out.println("n   n n");
 		        System.out.println("n    nn");
 		        System.out.println();
 			} else if (c == 'o' || c == 'O') {
 				System.out.println("ooooooo");
 		        System.out.println("o     o");
 		        System.out.println("o     o");
 		        System.out.println("o     o");
 		        System.out.println("ooooooo");
 		        System.out.println();
 			} else if (c == 'p' || c == 'P') {
 				System.out.println("pppppp");
 		        System.out.println("p    p");
 		        System.out.println("pppppp");
 		        System.out.println("p");
 		        System.out.println("p");
 		        System.out.println();
 			} else if (c == 'q' || c == 'Q') {
 				System.out.println("qqqqqqq");
 		        System.out.println("q     q");
 		        System.out.println("q     q");
 		        System.out.println("q    qq");
 		        System.out.println("qqqqqqqqq");
 		        System.out.println();
 			} else if (c == 'r' || c == 'R') {
 				System.out.println("rrrrrr");
 		        System.out.println("r     r");
 		        System.out.println("rrrrrr");
 		        System.out.println("r r");
 		        System.out.println("r   r");
 		        System.out.println();
 			} else if (c == 's' || c == 'S') {
 				System.out.println("sssssss");
 		        System.out.println("s");
 		        System.out.println(" sssss ");
 		        System.out.println("      s");
 		        System.out.println("sssssss");
 		        System.out.println();
 			} else if (c == 't' || c == 'T') {
 				System.out.println("tttttttt");
 		        System.out.println("   t");
 		        System.out.println("   t");
 		        System.out.println("   t");
 		        System.out.println("   t");
 		        System.out.println();
 			} else if (c == 'u' || c == 'U') {
 				System.out.println("u     u");
 		        System.out.println("u     u");
 		        System.out.println("u     u");
 		        System.out.println("u     u");
 		        System.out.println("uuuuuuu");
 		        System.out.println();
 			} else if (c == 'v' || c == 'V') {
 				System.out.println("v       v");
 		        System.out.println(" v     v");
 		        System.out.println("  v   v");
 		        System.out.println("   v v");
 		        System.out.println("    v");
 		        System.out.println();
 			} else if (c == 'w' || c == 'W') {
 				System.out.println("w     w");
 		        System.out.println("w     w");
 		        System.out.println("w  w  w");
 		        System.out.println("w w w w");
 		        System.out.println("ww   ww");
 		        System.out.println();
 			} else if (c == 'x' || c == 'X') {
 				System.out.println("x   x");
 		        System.out.println(" x x");
 		        System.out.println("  x");
 		        System.out.println(" x x");
 		        System.out.println("x   x");
 		        System.out.println();
 			} else if (c == 'y' || c == 'Y') {
 				System.out.println("y   y");
 		        System.out.println(" y y ");
 		        System.out.println("  y  ");
 		        System.out.println("  y  ");
 		        System.out.println("  y  ");
 		        System.out.println();
 			} else if (c == 'z' || c == 'Z') {
 				System.out.println("zzzzzzz");
 		        System.out.println("     z ");
 		        System.out.println("   z   ");
 		        System.out.println(" z     ");
 		        System.out.println("zzzzzzz");
 		        System.out.println();
 			} else if(c == ' ') {
 				System.out.println();
 		        System.out.println();
 		        System.out.println();
 		        System.out.println();
 		        System.out.println();
 		        System.out.println();
 			}
 			else {
 				System.out.println("ERROR: Character not found.");
 			}
 		}
		
	}
}
