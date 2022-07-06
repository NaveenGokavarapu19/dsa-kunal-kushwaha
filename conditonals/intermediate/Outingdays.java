package com.conditionals.intermediate;

class Outingdays {
    public static void main(String[] args) {
        int number_of_days = 0;
        int outing_days = 0;
        
        for (int i = 2;i<=31;i++){
            if(i%2==0){
                outing_days = outing_days + 1;
            }
            
        }
        System.out.println(outing_days); 
    }
}
