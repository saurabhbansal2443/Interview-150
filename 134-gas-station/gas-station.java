class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Firstly in this case we are checking the totalGasRequired and totalGasAvaialble is sufficinet or not 
        int totalGasRequired = 0 ; 
        int totalGasAvailable = 0 ; 

        int n = gas.length ; 

        for(int i=0 ; i<n ; i++ ){

            totalGasRequired += cost[i]; 
            totalGasAvailable += gas[i]; 
        }

        if(totalGasRequired>totalGasAvailable){
            return -1 ; 
        }


        int gase = 0 ; 
        int startingPoint = -1 ; 

        for(int i=0 ; i<n ; i++ ){

            if(cost[i]<= gas[i] && startingPoint == -1 ){
                gase = gas[i] - cost[i];
                startingPoint = i ;  
            }else if ( startingPoint != -1 ){
                gase += gas[i] - cost[i]; 
                if(gase<0 ){
                   startingPoint = -1 ;  
                }
            }
        }

        return startingPoint; 
    }
}