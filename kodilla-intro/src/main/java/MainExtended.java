public class MainExtended {
    public static void main(String[] args){
        String title = "As always";
        String author = "Miłoszewski";
        char firstDigitName = 'Z';
        int pageNo = 452;
        double index = pageNo/100;
        boolean isGoodBook = true;

        System.out.println("It's a nice book to read '"+title+"' by "+firstDigitName+". "+author+".");
        System.out.println("Number of pages: "+pageNo);
        System.out.println("Index: "+index);
        System.out.println("Recommended: "+isGoodBook);
    }
}
