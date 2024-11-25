package InventorySystem;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class InventoryItem {
    private Integer id;
    private String name;
    private double cost;
    private int availableStock;

    public InventoryItem(Integer id, String name, double cost, int availableStock){
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.availableStock = availableStock;
    }

    public void setId(Integer id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setAvailableStock(int availableStock){
        this.availableStock = availableStock;
    }

    public Integer getId(){
        return id;
    }

    public String getName(){
        return name;
    }
    public double getCost(){
        return cost;
    }

    public int getAvailableStock(){
        return availableStock;
    }
}
class InventorySystem{

    Map<Integer, InventoryItem> items;

    public InventorySystem(){
        items = new HashMap<>();
    }

    public String createInventoryItem(Integer id, String name, double cost, int availableStock){
        InventoryItem item = new InventoryItem(id,name,cost,availableStock);
        items.put(id, item);
        return "added";
    }

    public String removeInventoryItem(Integer id){
        InventoryItem item = items.get(id);
        items.remove(item);
        return "removed";
    }

    public String updateInventoryItem(Integer id, int availableStock){
         InventoryItem item = items.get(id);
         if(item != null){
             int newStock = item.getAvailableStock()+availableStock;
             item.setAvailableStock(newStock);
             return "Stock Updated";
         }else {
             return "Item no found";
         }
    }

    public void generateReport(){
        for(Map.Entry<Integer, InventoryItem> itemEntry : items.entrySet()){
            System.out.println(itemEntry.getKey() + "--" + itemEntry.getValue().getAvailableStock() + itemEntry.getValue().getName());
        }
    }


}
public class Main {
    public static void main(String[] args){
       InventorySystem inventorySystem = new InventorySystem();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while(!exit){
            System.out.println("\nInventory Management System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item Stock");
            System.out.println("4. Generate Report");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:


            }
        }
    }
}
