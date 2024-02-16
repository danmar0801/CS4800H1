public class Main {
    public static void main(String[] args) {
        Employee employee1 = new SalariedEmployee("Joe","Jones","111-11-1111",2_500);
        Employee employee2 = new HourlyEmployee("Stephanie","Smith","222-22-2222",25,32);
        Employee employee3 = new HourlyEmployee("Mary","Quin","333-33-3333",19,47);
        Employee employee4 = new CommisionEmployee("Nicole","Dior","444-44-4444",15,50_000);
        Employee employee5 = new SalariedEmployee("Renwa","Chanel","555-55-5555",1_700);
        Employee employee6 = new BaseEmployee("Mike","Davenport","666-66-6666",95_000);
        Employee employee7 = new CommisionEmployee("Mahnaz","Vaziri","777-77-7777",22,40_000);

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println(employee5);
        System.out.println(employee6);
        System.out.println(employee7);
    }
}