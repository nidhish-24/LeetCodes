class Solution {
    public List<Integer> pathInZigZagTree(int label) {
        List<Integer> list = new ArrayList<>();
        int out = label;

        list.add(out);   // include the starting label

        while(out > 1){ 
            int pow = 1;

            while(pow * 2 <= out)
                pow *= 2;

            int nth = out - pow + 1;
            int prev_nth = (nth + 1) / 2;

            out = pow - prev_nth;
            list.add(out);
        }

        Collections.reverse(list);   // now correct order
        return list;
    }
}

