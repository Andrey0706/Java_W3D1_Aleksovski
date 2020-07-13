package A5;

import java.util.ArrayList;

public class Warehouse {
    private ArrayList<String> inventory = new ArrayList<>();

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(String inventory) {
        this.inventory.add(inventory);
    }

    public void print(){
//        int theBiggest = inventory.get(0).length();
//        for(int i=0; i<inventory.size(); i++){
//            if(inventory.get(i).length()>theBiggest){
//                theBiggest = inventory.get(i).length();
//            }
//        }

        System.out.println("List of all the inventories");
        for(int i=0; i<inventory.size(); i++){
            System.out.println(" Item no" + (i+1) + ": " + inventory.get(i));
        }
    }
}
