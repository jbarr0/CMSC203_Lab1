import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Movie object created 
		Movie m1 = new Movie();
		String choice ="";
		do {
				
		System.out.println("Enter the name of a movie: ");
		String movieName = scan.nextLine();
		m1.setTitle(movieName);
		
		System.out.println("Enter the rating of the movie: ");
		String ratingMovie = scan.nextLine();
		m1.setRating(ratingMovie);
		
		System.out.println("Enter the number of tickets sold for the movie: ");
		int ticSold = scan.nextInt();
		m1.setSoldTickets(ticSold);
		
		System.out.println(m1);
		
		System.out.println("Do you want to enter another? (y or n) ");
		scan.nextLine();
		choice = scan.nextLine();
		
		
		} while ( choice.equals("y"));
		
		System.out.println("Goodbye");
	}

}
