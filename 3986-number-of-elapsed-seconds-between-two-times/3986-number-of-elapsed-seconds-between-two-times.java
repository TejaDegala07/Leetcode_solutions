class Solution {
    public int secondsBetweenTimes(String s, String e) {
        int sf = Integer.parseInt(s.substring(0, 2));
        int ss = Integer.parseInt(s.substring(3, 5));
        int st = Integer.parseInt(s.substring(6, 8));

        int ef = Integer.parseInt(e.substring(0, 2));
        int es = Integer.parseInt(e.substring(3, 5));
        int et = Integer.parseInt(e.substring(6, 8));

        int start=sf*3600+ss*60+st;
        int end=ef*3600+es*60+et;
        return Math.abs(start-end);
    }
}