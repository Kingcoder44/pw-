package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SymmetricCheck {
    static class Pair {
        int i, j;
        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public String toString() {
            return "(" + i + ", " + j + ")";
        }
    }

    public List<Pair> check(Pair[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Pair> symmetricPairs = new ArrayList<>();

        for (Pair pair : a) {
            if (map.containsKey(pair.j) && map.get(pair.j) == pair.i) {
                symmetricPairs.add(new Pair(pair.j, pair.i));
                symmetricPairs.add(new Pair(pair.i, pair.j));
            } else {
                map.put(pair.i, pair.j);
            }
        }
        return symmetricPairs;
    }

    public static void main(String[] args) {
        Pair[] a = {
                new Pair(1, 3),
                new Pair(2, 6),
                new Pair(3, 5),
                new Pair(7, 4),
                new Pair(5, 3),
                new Pair(8, 7),
                new Pair(3, 1)
        };

        SymmetricCheck sc = new SymmetricCheck();
        List<Pair> result = sc.check(a);

        if (!result.isEmpty()) {
            System.out.println("Symmetric pairs found:");
            for (Pair pair : result) {
                System.out.println(pair);
            }
        } else {
            System.out.println("No symmetric pairs found.");
        }
    }
}
