package PascalTriangle;
import java.util.*;
public class Solution {
    
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> finalList=new ArrayList<List<Integer>>();
        List<Integer> prevList=new ArrayList<Integer>();
        
        if(numRows==1){
            prevList.add(1);
            finalList.add(prevList);
            return finalList;
        }
        prevList.add(1);
        
        finalList.add(prevList);
        for(int i=0;i<numRows-1;i++){//Last element and first element will always be 1 and middle element will be of size previous-1
            List<Integer> currentList = new ArrayList<Integer>();
            currentList.add(1);//first index elements
            for(int j=0;j<prevList.size()-1;j++){//middle elements

                       currentList.add(prevList.get(j)+prevList.get(j+1));
                    
                    
            }
            currentList.add(1);//last index elements
            finalList.add(currentList);
            prevList=currentList;
            
            
        }

        return finalList;

    }
    public static void main(String[] args) {
        System.out.println(generate(3));
    }
}
