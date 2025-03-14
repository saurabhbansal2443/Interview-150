class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if (totalGas < totalCost) {
            return -1;
        }

        int currentGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            currentGas += gas[i] - cost[i];
            if (currentGas < 0) {
                currentGas = 0;
                start = i + 1;
            }
        }

        return start;        
    }
}

// in this question we have 2 array cost and gas where we have to complete 1 circle for that we have firstly check weather we  the totalcost > totalgas that means it is impossible to to complete circle, so we return -1 and after that if code comes that means that there is a solution, then we are checking for the solution by checking the correct point where to start 