package bitwiseOperation;

import java.util.ArrayList;
import java.util.List;

public class MinLength {
//The city of Hackerland organized a chess tournament for its citizens.
//There are i participants numbered 1 to n where the ith participant has potential denoted by potential[i.
// The potential of each player is distinct. Initially, all players stand in a queue in order from the 15 to the nth player In each game,
// the first 2 participants of the queue compete and the participant with a higher potential wins the game.
//After each game, the winner remains at the beginning of the queue and plays with the next person from the queue and
// the losing player goes to the end of the queue. The game continues until a player wins k consecutive games.
//Given the potential of the participants and the deciding factor k, find the potential of the winning player.
//Example
//Consider n = 4 participants have potential = [3, 2, 1, 41, and k = 2.
//• Initial position of participants: [1. 245, 4).
//• Participants 1 and 2 compete. Their potentials are 3 and 2. Player 1 wins due to the higher potential.
// Player 1 stays at the front of the queue and player 2 moves to the back. Now their positions are [1, 3.
//4, 21.
//• Participants 1 and 3 compete. Their potentials are 3 and 1. 1 wins a
//second consecutive game. Since k = 2, player 1 has won enough
//consecutive games.
//Return player 1's potential, 3.
//Function Description
//Complete the function getPotentialOfWinner in the editor below.
//getPotentia/OfWinner has the following parameters: int potential[n]: the potentials of participants
//long_int k: the number of consecutive matches the winning participant must win
//Returns
//int: the potential of the winning player

    public static int potentalWin(List<Integer> potental, int k){
        int win=0;
        for(int i=0; i<potental.size(); i++){
            for(int j=i+1; j<potental.size(); j++){
                int xor= potental.get(i) ^ potental.get(j);
                int and =potental.get(i) & potental.get(j);

                if(xor > and){
                    win++;
                }
            }
        }
        return win;
    }
    public static void main(String[] args){
        int k =2;
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(41);
        System.out.println(potentalWin(list,k));

    }
}
