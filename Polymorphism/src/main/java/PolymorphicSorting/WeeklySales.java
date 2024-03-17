package PolymorphicSorting;

/*
    WeeklySales.java
    Sorts the sales staff in ascending and descending order by sales.
*/

public class WeeklySales {
    public static void main(String[] args) {
        Salesperson[] salesStaff = new Salesperson[10];
        
        salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        salesStaff[2] = new Salesperson("James", "Jones", 3000);
        salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
        
        // Ascending
        Sorting.insertionSort(salesStaff);
        System.out.println("\n[ insertion : ascending ]");
        System.out.println("Ranking of Sales for the Week");
        for(Salesperson s: salesStaff){
            System.out.println(s);
        }
        
        // Descending
        Sorting.insortDesc(salesStaff);
        System.out.println("\n[ insertion : descending ]");
        System.out.println("Ranking of Sales for the Week");
        for(Salesperson s: salesStaff){
            System.out.println(s);
        }
    }
    
}
