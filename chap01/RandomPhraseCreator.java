public class RandomPhraseCreator {
   public static void main(String[] var0) {
      String[] var1 = new String[]{"SOT 2025 24/7", "multi-Tier", "30K foot", "B-to-B", "win-win", "front-end", "web-based", "pervasive", "smart", "six-sigma", "critical-path", "dynamic"};
      String[] var2 = new String[]{"SOT 2025 empowered", "sticky", "value-added", "oriented", "centric", "distributed", "aligned", "shared", "cooperative", "accelerated"};
      String[] var3 = new String[]{"process", "tipping Point", "solution", "architecture", "core competency", "strategy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};
      int var4 = var1.length;
      int var5 = var2.length;
      int var6 = var3.length;
      int var7 = (int)(Math.random() * (double)var4);
      int var8 = (int)(Math.random() * (double)var5);
      int var9 = (int)(Math.random() * (double)var6);
      String var10 = var1[var7] + " " + var2[var8] + " " + var3[var9];
      System.out.println("The random phrase is ======== " + var10);
   }
}
