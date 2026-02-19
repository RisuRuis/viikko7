package main;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        Library library = new Library();

        while (!exit) {
            System.out.println("1) Lisää kirja");
            System.out.println("2) Listaa kirjat");
            System.out.println("3) Lainaa fiktiokirja");
            System.out.println("4) Palauta fiktiokirja");
            System.out.println("0) Lopeta ohjelma");

            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {
                    case 1:
                        System.out.println("Minkä kirjan haluat lisätä kirjastoon? 1) Fiktiokirja, 2) Tietokirja");
                        int choice = Integer.parseInt(sc.nextLine());
                        System.out.println("Anna kirjan nimi: ");
                        String title = sc.nextLine();
                        System.out.println("Anna kirjailijan nimi: ");
                        String author =  sc.nextLine();
                        System.out.println("Anna sivumäärä: ");
                        int pages = Integer.parseInt(sc.nextLine());
                        System.out.println("Anna kirjojen määrä: ");
                        int copies = Integer.parseInt(sc.nextLine());

                        if (choice == 1) {
                            Book fictionbook = new FictionBook(title, author, pages, copies);
                            library.addBook(fictionbook);
                            System.out.println("kirja lisätty kirjastoon!");
                            break;
                            }
                        if (choice == 2) {
                            Book NonFictionBook = new NonFictionBook(title, author, pages, copies);
                            library.addBook(NonFictionBook);
                            System.out.println("Kirja lisätty kirjastoon!");
                            break;
                            }
                                
                        else {
                            System.out.println("Virheellinen kirjavalinta.");
                            break;
                        }
                        
                        
                        
                    case 2:
                        library.listBooks();
                        break;
                    
                    case 3:
            
       

                        break;

                    case 4:
                        
                        break;
                   
                    case 0:
                        System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;
                    }

            }


        }

    sc.close();
    }
}
