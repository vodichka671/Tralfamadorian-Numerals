import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static java.lang.Math.pow;

public class TralfNum {


   private String Number;
   private int decimal;
   private static String[] specialArray = {"|", "+", "++"};
   private ArrayList<String> special = new ArrayList<>(Arrays.asList(specialArray));
   private static String[] greekAlphArray = {"\u03b1", "\u03b2", "\u03b3", "\u03b4","\u03b5","\u03b6", "\u03b7", "\u03b8", "\u03b9"};
   private static ArrayList<String> greekAlph = new ArrayList<>(Arrays.asList(greekAlphArray));

   public void generateSpecials(int len){
      for (int i = 3; i < len; i++) {
         special.add(special.get(i-2)+"x");
      }
//      for (String i:special
//           ) {
//         System.out.println(i);
//      }

   }

   public TralfNum(String number) {
      Number = number;
      decimal = Transform(Number);
   }

   public int Transform(String TralfNum){
       generateSpecials(Number.length());
       int result = 0;
       ArrayList<String> greek= new ArrayList<>();
       ArrayList<String> spec = new ArrayList<>();

      for (int i = 0; i <TralfNum.length() ; i++) {
         if(!Character.toString(TralfNum.charAt(i)).equals("+")   && !Character.toString(TralfNum.charAt(i)).equals("x")
                 && !Character.toString(TralfNum.charAt(i)).equals("|"))  {
             greek.add(Character.toString(TralfNum.charAt(i)));

         }
         else{
             int k = i;
             while (Character.toString(TralfNum.charAt(k)).equals("+")   || Character.toString(TralfNum.charAt(k)).equals("x")
                     || Character.toString(TralfNum.charAt(k)).equals("|")){

                 k++;
                 if (k>=TralfNum.length()){
                     break;
                 }
             }
             spec.add(TralfNum.substring(i,k));
             i = k-1;
         }


      }
//       for (String j:greek
//               ) {
//           System.out.println(j);
//       }


       for (int i = 0; i <spec.size() ; i++) {
           //System.out.println(greekAlph.indexOf(greek.get(i))+1);
          result = result +  (int) ((greekAlph.indexOf(greek.get(i))+1)*pow(10,special.indexOf(spec.get(i))));
       }


      return result;
   }

   public ArrayList<String> getSpecial() {
      return special;
   }

   public String getNumber() {
      return Number;
   }

    public int getDecimal() {
        return decimal;
    }
}
