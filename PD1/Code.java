package PD1;
import java.util.Random;

public class Code {

	static Random rand = new Random();

	static int CheckVowel(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
			return 1;
		else
			return 0;
	}

	static double CheckPairPoints(char first, char second) {
		int a = CheckVowel(first);
		int b = CheckVowel(second);
		if (a == 0 && b == 0)
			return -1;
		if (a == 1 && b == 1)
			return 1.5;
		return 0;
	}

	static int EndState(double points) {
		if (points > 0)
			return 1;
		if (points < 0)
			return -1;
		else
			return 0;
	}

	static int Minimax(char state[], Boolean max, double startPoints) {

		if (state.length == 1)
			return EndState(startPoints);
		else {
			int best;
			double endPoints;
			if (max) {
				best = -20;
				for (int i = 1; i < state.length; i++) {
					endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
					char[] b = Create(state, i);
					best = Math.max(best, Minimax(b, !max, endPoints));
				}
			} else {
				best = 20;
				for (int i = 1; i < state.length; i++) {
					endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
					char[] b = Create(state, i);
					best = Math.min(best, Minimax(b, !max, endPoints));
				}
			}
			return best;
		}
	}

	static char[] Create(char startState[], int x) {
		char[] endState = new char[startState.length - 1];
		for (int i = 0, n = 0; i < startState.length; i++) {
			if (i != x && i != x - 1) {
				endState[n] = startState[i];
				n++;
			} else if (i == x - 1) {
				if (CheckPairPoints(startState[x], startState[x - 1]) == 2)
					endState[n] = 's';
				else
					endState[n] = 'a';
				n++;
			}
		}
		return endState;
	}

	static char[] CreateStart() {
		char[] startState = new char[10];
		for (int i = 0; i < startState.length; i++) {
			startState[i] = (char) (rand.nextInt(26) + 97);
		}
		return startState;
	};

	static int BestMove(char state[], Boolean max, int startPoints) {
		int bestMove = -1;
		double endPoints;
		if (max) {
			int bestVal = -20;
			for (int i = 1; i < state.length; i++) {
				endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
				char[] b = Create(state, i);
				int moveVal = Minimax(b, false, endPoints);
				if (moveVal > bestVal) {
					bestMove = i;
					bestVal = moveVal;
				}
			}
			System.out.println(bestVal);

		} else {
			int bestVal = 20;
			for (int i = 1; i < state.length; i++) {
				endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
				char[] b = Create(state, i);
				int moveVal = Minimax(b, true, endPoints);
				if (moveVal < bestVal) {
					bestMove = i;
					bestVal = moveVal;
				}
			}

		}
		return bestMove;
	}
}