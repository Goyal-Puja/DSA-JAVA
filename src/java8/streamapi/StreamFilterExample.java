package java8.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product {
    private int id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString(){
        return "Product "+ "[ " + this.id + ", " + this.name + ", " + this.price + " ]";
    }
}

public class StreamFilterExample {
    public static void main(String[] args){
            List<Product> list = new ArrayList<Product>();
            for(Product product : getProduct()){
                if(product.getPrice() > 25000f){
                    list.add(product);
                }
            }
            for(Product product : list){
              System.out.println(product);
            }

            // using stream API
            List<Product> list2 =  getProduct().stream().filter((product) -> product.getPrice() > 25000f).collect(Collectors.toList());
            list2.forEach(System.out::println);
    }
    private static List<Product> getProduct(){
        List<Product> productList = new ArrayList<Product>();
        productList.add(new Product(1, "HP Laptop", 25000f));
        productList.add(new Product(2, "Dell Laptop", 30000f));
        productList.add(new Product(3, "Lenovo Laptop", 40000f));
        productList.add(new Product(4, "Apple Laptop", 50000f));

        return productList;
    }
}

// There are two way to create a string.

// 1. String Literal  ( recommended one ) --->  ( always use string pool for better performance and memory management )
// This method stores the string in the String Pool, which help in memory optimization
// if the same string is created elsewhere, Java will refer to the existing object in the pool instead of creating a new one.

// 2. create a new object of string class using new keyword ( not recommended )   ----->> this creates a new string object in the heap memory,
// even if the same string already existing in the string pool.

