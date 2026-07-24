public class Square {
    public boolean squareIsWhite(String coordinates) {
      char col = coordinates.charAt(0);
      char row = coordinates.charAt(1);
      int colnumber = col-'a'+1;
      int rownumber = row-'0';
      return(colnumber+rownumber)%2!=0;  
    }
}