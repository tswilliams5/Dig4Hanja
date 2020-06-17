public class Main {
    public static String SAMPLE = "공부해 얼른 와 공부해";
    public static String SAMPLE_2 = "실제로 결정을 해야돼";
    public static String SAMPLE_3 = "잉? 뭐지?";
    public static void main(String[] args) {
        HanjaReport hanjaReport = new HanjaEngine().compute(SAMPLE);
        System.out.println(new HanjaReportReader().read(hanjaReport));
        HanjaReport hanjaReport2 = new HanjaEngine().compute(SAMPLE_2);
        System.out.println(new HanjaReportReader().read(hanjaReport2));
        HanjaReport hanjaReport3 = new HanjaEngine().compute(SAMPLE_3);
        System.out.println(new HanjaReportReader().read(hanjaReport3));

    }
}
