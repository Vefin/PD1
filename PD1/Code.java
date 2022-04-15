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
					char[] newState = Create(state, i);
					best = Math.max(best, Minimax(newState, !max, endPoints));
				}
			} else {
				best = 20;
				for (int i = 1; i < state.length; i++) {
					endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
					char[] newState = Create(state, i);
					best = Math.min(best, Minimax(newState, !max, endPoints));
				}
			}
			return best;
		}
	}

	static char[] Create(char startState[], int pair) {
		char[] endState = new char[startState.length - 1];
		for (int i = 0, n = 0; i < startState.length; i++) {
			if (i != pair && i != pair - 1) {
				endState[n] = startState[i];
				n++;
			} else if (i == pair - 1) {
				if (CheckPairPoints(startState[pair], startState[pair - 1]) == 2)
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

	static int BestMove(char state[], Boolean max, double startPoints) {
		int bestMove = -1;
		double endPoints;
		if (max) {
			int bestValue = -20;
			for (int i = 1; i < state.length; i++) {
				endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
				char[] newState = Create(state, i);
				int moveValue = Minimax(newState, false, endPoints);
				if (moveValue > bestValue) {
					bestMove = i;
					bestValue = moveValue;
				}
			}
		} else {
			int bestValue = 20;
			for (int i = 1; i < state.length; i++) {
				endPoints = startPoints + CheckPairPoints(state[i], state[i - 1]);
				char[] newState = Create(state, i);
				int moveValue = Minimax(newState, true, endPoints);
				if (moveValue < bestValue) {
					bestMove = i;
					bestValue = moveValue;
				}
			}

		}
		return bestMove;
	}
}
