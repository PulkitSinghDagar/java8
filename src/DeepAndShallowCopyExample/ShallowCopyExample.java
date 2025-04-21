package DeepAndShallowCopyExample;

import java.util.ArrayList;
import java.util.List;

public class ShallowCopyExample {
    public static void main(String[] args) {
//        ArrayList<String> originalList = new ArrayList<>();
//        originalList.add("item 1");
//        originalList.add("item 2");
//        ArrayList<String> shallowCopy = (ArrayList<String>) originalList.clone();
//
//        System.out.println("original"+originalList);
//        System.out.println("shallow"+ shallowCopy);
//
//        originalList.set(0,"new item added");
//        System.out.println("or"+originalList);
//        System.out.println("sha"+shallowCopy);


        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Item 1");
        originalList.add("Item 2");

        // Shallow copy using clone() (works only for objects implementing Cloneable)
        ArrayList<String> shallowCopy = (ArrayList<String>) originalList.clone();

        System.out.println("Original List: " + originalList);
        System.out.println("Shallow Copy: " + shallowCopy);

        // Modifying the original list
        originalList.set(0, "Modified Item 1");

        System.out.println("\nAfter modification:");
        System.out.println("Original List: " + originalList);
        System.out.println("Shallow Copy: " + shallowCopy);
    }
}
