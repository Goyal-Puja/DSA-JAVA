package comparingAndSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompanyIdComparator implements Comparator<Company>{

    @Override
    public int compare(Company c1, Company c2) {
        return c1.companyId - c2.companyId;
    }
}
class Company{
    public int companyId;
    public String companyName;

    public Company(int companyId, String companyName) {
        this.companyId = companyId;
        this.companyName = companyName;
    }

    @Override
    public String toString(){
        return this.companyId + " " + this.companyName;
    }
}

public class ComparatorInterface {
    public static void main(String[] args){
        ArrayList<Company> companies = new ArrayList<>();
        companies.add(new Company(121, "Infosys"));
        companies.add(new Company(101, "IBM"));
        companies.add(new Company(111, "Wipro"));
        companies.add(new Company(100, "Capgemini"));

        Collections.sort(companies, new CompanyIdComparator());   // Sorting company depending on the company id

        for(Company company : companies){
            System.out.println(company);
        }
    }
}
