class Leap {

    boolean isLeapYear(int year) {
        boolean ok=false;
      
        if((year %4==0&&year%100!=0)||year%400==0){
            ok=true;
        }
        
        return ok;
        
    }

}
