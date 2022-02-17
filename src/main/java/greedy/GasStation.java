package greedy;

/**
 * 134. Gas Station
 * Medium
 * <p>
 * There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * <p>
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 * <p>
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
 * Output: 3
 * Explanation:
 * Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
 * Travel to station 4. Your tank = 4 - 1 + 5 = 8
 * Travel to station 0. Your tank = 8 - 2 + 1 = 7
 * Travel to station 1. Your tank = 7 - 3 + 2 = 6
 * Travel to station 2. Your tank = 6 - 4 + 3 = 5
 * Travel to station 3. The cost is 5. Your gas is just enough to travel back to station 3.
 * Therefore, return 3 as the starting index.
 * Example 2:
 * <p>
 * Input: gas = [2,3,4], cost = [3,4,3]
 * Output: -1
 * Explanation:
 * You can't start at station 0 or 1, as there is not enough gas to travel to the next station.
 * Let's start at station 2 and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
 * Travel to station 0. Your tank = 4 - 3 + 2 = 3
 * Travel to station 1. Your tank = 3 - 3 + 3 = 3
 * You cannot travel back to station 2, as it requires 4 unit of gas but you only have 3.
 * Therefore, you can't travel around the circuit once no matter where you start.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * gas.length == n
 * cost.length == n
 * 1 <= n <= 105
 * 0 <= gas[i], cost[i] <= 104
 */

// TC = O(N)
// SC = O(1)
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        // Initiate total_tank and curr_tank as zero, and choose station 0 as a starting station.
        int totalTank = 0;
        int currTank = 0;
        int startStation = 0;

        // Iterate over all stations :
        // Update total_tank and curr_tank at each step, by adding gas[i] and subtracting cost[i].
        // If curr_tank < 0 at i + 1 station, make i + 1 station a new starting point and reset curr_tank = 0 to start with an empty tank
        for (int i = 0; i < gas.length; i++) {
            totalTank += gas[i] - cost[i];
            currTank += gas[i] - cost[i];
            if (currTank < 0) {
                startStation = i + 1;
                currTank = 0;
            }
        }

        // Return -1 if total_tank < 0 and starting station otherwise.
        if (totalTank < 0) return -1;
        else return startStation;
    }
}
